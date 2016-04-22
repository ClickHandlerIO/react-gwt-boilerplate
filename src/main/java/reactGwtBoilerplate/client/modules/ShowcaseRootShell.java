package reactGwtBoilerplate.client.modules;

import io.clickhandler.reactGwt.client.react.ReactComponent;
import io.clickhandler.reactGwt.client.react.ReactElement;
import io.clickhandler.reactRouterGwt.client.RootRoute;
import io.clickhandler.reactRouterGwt.client.SimpleRouteComponent;
import io.clickhandler.reactRouterGwt.client.SimpleRouteProps;
import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;

import javax.inject.Inject;
import javax.inject.Singleton;

import static io.clickhandler.reactGwt.client.dom.DOM.div;


@Singleton
public class ShowcaseRootShell extends SimpleRouteComponent<RootRoute, ShowcaseRootShell.Props, ShowcaseRootShell.State> {
//    private final Loggly log = Loggly.get(ShowcaseRootShell.class);

//    @Inject
//    AlertConfirmManager alertConfirmManager;

    @Inject
    public ShowcaseRootShell() {
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // Render
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    @JsIgnore
    protected ReactElement render(ReactComponent<Props, State> $this) {
        return div($ -> $.className("full-height"),
                $this.getProps().getChildren()
//            alertConfirmManager.$()
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
}
