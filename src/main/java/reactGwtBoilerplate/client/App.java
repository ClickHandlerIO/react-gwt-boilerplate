package reactGwtBoilerplate.client;

import dagger.Component;
import dagger.Module;
import dagger.Provides;
import io.clickhandler.reactGwt.client.Bus;
import io.clickhandler.reactRouterGwt.client.History;
import io.clickhandler.reactRouterGwt.client.ReactRouter;
import io.clickhandler.reactRouterGwt.client.RouteGatekeeper;
import io.clickhandler.reactGwt.client.util.Is;
import reactGwtBoilerplate.client.modules.ShowcaseRootModule;
import reactGwtBoilerplate.client.modules._gatekeepers.RouteListener;

import javax.inject.Singleton;

@Singleton
@Component(modules = {App.M.class})
public interface App {
    App instance = DaggerApp.create();

    static App get() {
        return instance;
    }

    ////////////////////////////////////////////////////////////////////////////////////////
    // Convenience Methods
    ////////////////////////////////////////////////////////////////////////////////////////

    static boolean isSuperDevMode() {
        return Is.devMode();
    }

    static History getHistory() {
        return instance.history();
    }

    static Bus getBus() {
        return instance.bus();
    }

    static Routes getRoutes() {
        return instance.routes();
    }

    ////////////////////////////////////////////////////////////////////////////////////////
    // Top Level Dependencies
    ////////////////////////////////////////////////////////////////////////////////////////

    History history();

    Bus bus();

    ShowcaseRootModule bootstrap();

    Routes routes();

    RouteListener routeListener();

    ////////////////////////////////////////////////////////////////////////////////////////
    // Module
    ////////////////////////////////////////////////////////////////////////////////////////

    @Module
    class M {

        // Configure Route Gatekeeper

        @Provides
        @Singleton
        RouteGatekeeper onEnter(RouteListener routeListener) {
            return routeListener;
        }

        // Configure history

        @Provides
        @Singleton
        History history() {
            return ReactRouter.getHashHistory();
        }

        // Defaults

        @Provides
        Object object() {
            return new Object();
        }
    }

    @Module
    class Core {
        @Provides
        App app() {
            return instance;
        }

        @Provides
        @Singleton
        Bus bus() {
            return app().bus();
        }

        @Provides
        @Singleton
        History history() {
            return app().history();
        }

        @Provides
        RouteGatekeeper routeGatekeeper() {
            return app().routeListener();
        }

        @Provides
        Object object() {
            return new Object();
        }
    }
}
