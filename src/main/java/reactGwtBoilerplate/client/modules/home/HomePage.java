package reactGwtBoilerplate.client.modules.home;

import io.clickhandler.reactGwt.client.dom.StyleProps;
import io.clickhandler.reactGwt.client.react.ReactComponent;
import io.clickhandler.reactGwt.client.react.ReactElement;
import io.clickhandler.reactRouterGwt.client.RootRoute;
import io.clickhandler.reactRouterGwt.client.SimpleRouteComponent;
import io.clickhandler.reactRouterGwt.client.SimpleRouteProps;
import io.clickhandler.reactRouterGwt.client.SimpleRouteProxy;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

import static io.clickhandler.reactGwt.client.dom.DOM.div;

@Singleton
public class HomePage extends SimpleRouteComponent<HomePage.Route, HomePage.Props, HomePage.State> {

//    @Inject
//    FlatButton flatButton;
//    @Inject
//    RaisedButton raisedButton;

    @Inject
    public HomePage() {
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Render
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected ReactElement render(ReactComponent $this) {
        return div($ -> $.style(new StyleProps().padding("10px")), "Home Page!"
                /*div("home page"),
                flatButton.$($ -> {
                    $.setLabel("Test Button");
                }),
                raisedButton.$($ -> $.setLabel("Hello"))*/
        );
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Component Lifecycle
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Work
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Props / State / Route / Args
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @JsType(isNative = true)
    public interface Props extends SimpleRouteProps {
    }

    @JsType(isNative = true)
    public interface State {
    }

    public static class Route extends SimpleRouteProxy {
        @Inject
        public Route(RootRoute parent) {
            super("home", parent);
        }
    }
}
