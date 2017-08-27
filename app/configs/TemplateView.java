package configs;

import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

public class TemplateView {

    public static String render(String template, Map model) {
    	VelocityEngine ve = new VelocityEngine();
        Properties properties = new Properties();
        properties.setProperty("resource.loader", "file");
        properties.setProperty("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.FileResourceLoader");
        properties.setProperty("file.resource.loader.path", "app/views");
        properties.setProperty("file.resource.loader.cache", "true");
        properties.setProperty("file.resource.loader.modificationCheckInterval", "2");
        ve.init(properties);

        Template t = ve.getTemplate(template, "utf-8");
    	
        VelocityContext context = new VelocityContext();
        Iterator it = model.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            context.put((String) pair.getKey(), pair.getValue());
            it.remove(); // avoids a ConcurrentModificationException
        }
        context.put("constantes", Constantes.getMapita());
       
        StringWriter w = new StringWriter();
        t.merge(context, w);    		
    	
		return w.toString();
    }
}
