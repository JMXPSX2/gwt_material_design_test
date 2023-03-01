package gwt.material.design.addins.client.overlay;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MaterialOverlayDebugClientBundle_default_InlineClientBundleGenerator implements gwt.material.design.addins.client.overlay.MaterialOverlayDebugClientBundle {
  private static MaterialOverlayDebugClientBundle_default_InlineClientBundleGenerator _instance0 = new MaterialOverlayDebugClientBundle_default_InlineClientBundleGenerator();
  private void overlayCssDebugInitializer() {
    overlayCssDebug = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.4.0/gwt-material-addins-2.4.0.jar!/gwt/material/design/addins/client/overlay/resources/css/overlay.css
      public String getText() {
        return ".overlay-panel{\r\n    width: 100%;\r\n    height: 100%;\r\n    top: 0;\r\n    left: 0;\r\n    right: 0;\r\n    bottom: 0;\r\n    position: fixed;\r\n    z-index: 999;\r\n    visibility: hidden;\r\n    opacity: 0;\r\n    background: #fff;\r\n}\r\n\r\n.overlay-tab .lean-overlay {\r\n    background: rgba(0,0,0,0.7);\r\n}\r\n\r\n.overlay-panel.tab {\r\n    will-change: transform, opacity, box-shadow;\r\n    -webkit-transition: all 0.8s cubic-bezier(0.23, 1, 0.32, 1);\r\n    transition: all 0.8s cubic-bezier(0.23, 1, 0.32, 1);\r\n    box-shadow: rgba(0, 0, 0, 0.4) 0px 30px 60px;\r\n    cursor: pointer;\r\n}\r\n\r\n.overlay-panel .minimize-icon {\r\n    position: absolute;\r\n    right: 20px;\r\n    top: 20px;\r\n    z-index: 1010;\r\n}\r\n\r\n.overlay-panel .number {\r\n    font-size: 12em;\r\n    text-align: center;\r\n    padding: 10%;\r\n    width: 100%;\r\n}\r\n\r\n.overlay-panel.maximize {\r\n    transform: translate3d(0px, 0px, 0px) scale(1) !important;\r\n}\r\n\r\n.overlay-panel.hidden {\r\n    transform: translate3d(0, 100%, 0) scale(1) !important;\r\n}\r\n\r\n.overlay-tab .close {\r\n    position: fixed;\r\n    bottom: 32px;\r\n    right: 22px;\r\n    z-index: 1020;\r\n}\r\n\r\n.overlay-tab-activator {\r\n    position: relative;\r\n}\r\n\r\n.overlay-tab-activator .badge {\r\n    width: 16px !important;\r\n    height: 16px !important;\r\n    padding-top: 8px !important;\r\n    right: 0;\r\n    top: -8px;\r\n    background: #E91E63;\r\n}";
      }
      public String getName() {
        return "overlayCssDebug";
      }
    }
    ;
  }
  private static class overlayCssDebugInitializer {
    static {
      _instance0.overlayCssDebugInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return overlayCssDebug;
    }
  }
  public com.google.gwt.resources.client.TextResource overlayCssDebug() {
    return overlayCssDebugInitializer.get();
  }
  private void overlayDarkCssInitializer() {
    overlayDarkCss = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.4.0/gwt-material-addins-2.4.0.jar!/gwt/material/design/addins/client/overlay/resources/css/overlay-dark.css
      public String getText() {
        return ".overlay-panel{\r\n    background: #383838;\r\n}";
      }
      public String getName() {
        return "overlayDarkCss";
      }
    }
    ;
  }
  private static class overlayDarkCssInitializer {
    static {
      _instance0.overlayDarkCssInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return overlayDarkCss;
    }
  }
  public com.google.gwt.resources.client.TextResource overlayDarkCss() {
    return overlayDarkCssInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.google.gwt.resources.client.TextResource overlayCssDebug;
  private static com.google.gwt.resources.client.TextResource overlayDarkCss;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      overlayCssDebug(), 
      overlayDarkCss(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("overlayCssDebug", overlayCssDebug());
        resourceMap.put("overlayDarkCss", overlayDarkCss());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'overlayCssDebug': return this.@gwt.material.design.addins.client.overlay.MaterialOverlayDebugClientBundle::overlayCssDebug()();
      case 'overlayDarkCss': return this.@gwt.material.design.addins.client.overlay.MaterialOverlayDebugClientBundle::overlayDarkCss()();
    }
    return null;
  }-*/;
}
