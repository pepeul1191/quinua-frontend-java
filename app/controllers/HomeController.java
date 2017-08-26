package controllers;

import java.util.HashMap;
import java.util.Map;


import configs.TemplateView;
import play.mvc.*;
import spark.ModelAndView;
import views.html.*;

public class HomeController extends Controller {

    public Result index() {
    	//return ok("Hola mundo").as("text/html; charset=iso-8859-1");
    	Map<String, Object> model = new HashMap<>();
    	ModelAndView modelAndView = new ModelAndView(model, "views/index");
    	model.put("title", "Mantenimiento - Accesós");
    	//System.out.println();    	
    	
    	return ok(TemplateView.render("index.vm", model)).as("text/html; charset=iso-8859-1");
    	
    	//return ok(views.html.index.render());
    }

}
