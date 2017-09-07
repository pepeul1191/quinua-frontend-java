package actions;

import java.util.concurrent.CompletionStage;
import play.mvc.Http.Context;
import play.mvc.Result;

public class LogeadoAction extends play.mvc.Action.Simple {
	@Override
	public CompletionStage<Result> call(Context ctx) {
		System.out.println("1+++++++++++++++++++++++++++++++++++++++++");
		ctx.args.put("user", "123");
		return delegate.call(ctx);
	}
}