package controllers;

import java.util.HashMap;
import java.util.Map;

import configs.Constantes;
import configs.TemplateView;
import play.mvc.Controller;
import play.mvc.Result;

public class LoginController  extends Controller {

    public Result index() {
    	Map<String, Object> model = new HashMap<>();
        model.put("partial", "login/index.vm");
        model.put("title", "Mantenimiento - Accesos");
        model.put("css", Constantes.getMapita().get("STATIC_URL") + "dist/login.min.css");
        model.put("js", Constantes.getMapita().get("STATIC_URL") + "dist/vendor.min.js");
        model.put("data", "");
        return ok(TemplateView.render("layouts/blank.vm", model)).as("text/html; charset=utf-8");
    }

}
