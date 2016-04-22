package reactGwtBoilerplate.client.modules;

import io.clickhandler.reactRouterGwt.client.RootModule;
import reactGwtBoilerplate.client.modules.gettingStarted.GettingStartedModule;
import reactGwtBoilerplate.client.modules.home.HomeModule;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ShowcaseRootModule extends RootModule {
    @Inject
    HomeModule.Loader home;
    @Inject
    GettingStartedModule.Loader gettingStarted;

    @Inject
    public ShowcaseRootModule(ShowcaseRootShell shell) {
        super(shell);
    }

    @Override
    protected void registerModules() {
        register(home);
        register(gettingStarted);
    }
}
