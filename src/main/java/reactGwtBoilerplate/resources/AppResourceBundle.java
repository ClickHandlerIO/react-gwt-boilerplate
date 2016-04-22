package reactGwtBoilerplate.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface AppResourceBundle extends ClientBundle {
    AppResourceBundle INSTANCE = GWT.create(AppResourceBundle.class);

    @Source("app-webpack.js")
    TextResource webpackjs();
}
