import java.util.*;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    // staticFileLocation("/public");
    //
    // get("/", (request, response) -> {
    //   Map<String, Object> model = new HashMap<String, Object>();
    //   model.put("template", "templates/home.vtl");
    //   return new ModelAndView(model, "templates/layout.vtl");
    // }, new VelocityTemplateEngine());
    //
    // get("/result", (request, response) -> {
    //   Map<String, Object> model = new HashMap<String, Object>();
    //
    //   Triangle triangle = new Triangle();
    //   Integer side1 = Integer.parseInt(request.queryParams("inputOne"));
    //   Integer side2 = Integer.parseInt(request.queryParams("inputTwo"));
    //   Integer side3 = Integer.parseInt(request.queryParams("inputThree"));
    //   String triangleFinal = triangle.triangleTest(side1, side2, side3);
    //   model.put("triangleFinal", triangleFinal);
    //
    //   model.put("template", "templates/result.vtl");
    //   return new ModelAndView(model, "templates/layout.vtl");
    // }, new VelocityTemplateEngine());
  }
}
