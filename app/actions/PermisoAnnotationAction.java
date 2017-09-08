package actions;

import java.util.concurrent.CompletionStage;

import configs.PermisoAnnotation;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;

public class PermisoAnnotationAction extends Action<PermisoAnnotation> {
	@Override
	public CompletionStage<Result> call(Http.Context ctx) {
		if (configuration.value()) {
			ctx.args.put("user", "1234");
        }
        return delegate.call(ctx);
	}
}