package actions;

import play.api.mvc.Result;
import play.mvc.Http;
import play.mvc.Security;

public class LoginAuthenticator  extends Security.Authenticator {  
    @Override
    public String getUsername(Http.Context ctx) {
        if (ctx.args.get("user").toString() == "123") {
        	System.out.println("Paso");
        	return "";
        }else {
        	return null;
        }
    }

    @Override
    public play.mvc.Result onUnauthorized(Http.Context context) {
        return redirect("/login");
    }
}
