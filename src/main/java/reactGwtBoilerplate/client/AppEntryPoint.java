package reactGwtBoilerplate.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.ScriptInjector;
import io.clickhandler.momentGwt.resources.MomentGwtBundle;
import reactGwtBoilerplate.resources.AppResourceBundle;

public class AppEntryPoint implements EntryPoint {
    @Override
    public void onModuleLoad() {

        // Inject webpack javascript
        ScriptInjector.fromString(AppResourceBundle.INSTANCE.webpackjs().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();

        // inject moment javascript
        ScriptInjector.fromString(MomentGwtBundle.INSTANCE.momentWithLocales().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
        ScriptInjector.fromString(MomentGwtBundle.INSTANCE.momentTimezoneWithData().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();

        // Inject camber javascript
//        ScriptInjector.fromString(CamberResourceBundle.INSTANCE.jQuery().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
//        ScriptInjector.fromString(CamberResourceBundle.INSTANCE.Select2().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
//        ScriptInjector.fromString(CamberResourceBundle.INSTANCE.FullCalendar().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();

        // Wire the app
        final App app = App.get();

        // todo start utils

        // Start react app
        app.bootstrap().start("app");
    }
}
