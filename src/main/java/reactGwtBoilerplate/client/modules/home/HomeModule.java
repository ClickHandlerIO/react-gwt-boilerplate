package reactGwtBoilerplate.client.modules.home;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import dagger.Component;
import io.clickhandler.reactGwt.client.Func;
import io.clickhandler.reactRouterGwt.client.ModuleLoader;
import io.clickhandler.reactRouterGwt.client.RoutesBuilder;
import reactGwtBoilerplate.client.App;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
@Component(modules = App.Core.class)
public interface HomeModule {
    HomeModule instance = DaggerHomeModule.create();

    Routes routes();

    @Singleton
    class Routes extends RoutesBuilder {
        @Inject
        HomePage home;

        @Inject
        public Routes() {
        }

        @Override
        protected void registerComponents() {
            add(home);
        }
    }

    class Loader extends ModuleLoader {
        @Inject
        public Loader(HomePage.Route root) {
            super(root.path());
        }

        @Override
        protected void loadRouteBuilder(Func.Run1<RoutesBuilder> callback) {
            GWT.runAsync(new RunAsyncCallback() {
                @Override
                public void onFailure(Throwable reason) {
                    // Ignore.
                }

                @Override
                public void onSuccess() {
                    callback.run(HomeModule.instance.routes());
                }
            });
        }
    }
}
