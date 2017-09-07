package actions;

import java.util.concurrent.CompletionStage;
import play.mvc.Result;
import play.mvc.Http.Context;

public class AclAction extends play.mvc.Action.Simple {
	@Override
	public CompletionStage<Result> call(Context ctx) {
		System.out.println("2+++++++++++++++++++++++++++++++++++++++++");
		 //redirect("http://softweb.pe");
		System.out.println(ctx.args.get("user"));
		ctx.args.put("user", "123");
		return delegate.call(ctx);
	}
}