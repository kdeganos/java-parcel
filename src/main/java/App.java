import java.util.*;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

    get("/result", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      Parcel parcel = new Parcel(Double.parseDouble(request.queryParams("inputWeight")), Double.parseDouble(request.queryParams("inputHeight")), Double.parseDouble(request.queryParams("inputWidth")), Double.parseDouble(request.queryParams("inputDepth")));

      if (request.queryParams().size() > 4) {
        parcel.giftWrapSurfaceArea();
      }

      Double outPut = parcel.costToShip();
      model.put("outPut", outPut);
      model.put("template", "templates/result.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());
  }
}
