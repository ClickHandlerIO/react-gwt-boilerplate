package reactGwtBoilerplate.client;

import reactGwtBoilerplate.client.modules.gettingStarted.GettingStartedPage;
import reactGwtBoilerplate.client.modules.home.HomePage;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Routes {

    @Inject
    public Routes() {
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // Home
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    public static class HomeRoutes {
        @Inject
        HomePage.Route homePage;

        @Inject
        public HomeRoutes() {
        }

        public HomePage.Route getHomePage() {
            return homePage;
        }
    }

    @Inject
    HomeRoutes home;

    public HomeRoutes getHome() {
        return home;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // Getting Started
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    public static class GettingStartedRoutes {
        @Inject
        GettingStartedPage.Route gettingStartedPage;

        @Inject
        public GettingStartedRoutes() {
        }

        public GettingStartedPage.Route getGettingStartedPage() {
            return gettingStartedPage;
        }
    }

    @Inject
    GettingStartedRoutes gettingStartedRoutes;

    public GettingStartedRoutes getGettingStartedRoutes() {
        return gettingStartedRoutes;
    }
}
