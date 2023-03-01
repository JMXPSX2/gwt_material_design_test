package gwt.material.design.addins.client.window;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MaterialWindowDebugClientBundle_default_InlineClientBundleGenerator implements gwt.material.design.addins.client.window.MaterialWindowDebugClientBundle {
  private static MaterialWindowDebugClientBundle_default_InlineClientBundleGenerator _instance0 = new MaterialWindowDebugClientBundle_default_InlineClientBundleGenerator();
  private void windowCssDebugInitializer() {
    windowCssDebug = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.4.0/gwt-material-addins-2.4.0.jar!/gwt/material/design/addins/client/window/resources/css/window.css
      public String getText() {
        return "/** Window Dialog **/\r\n.window {\r\n    position: fixed;\r\n    display: none;\r\n    z-index: 1001;\r\n    top: 0;\r\n    left: 0;\r\n    right: 0;\r\n    padding: 0;\r\n    /*max-height: 80%;*/\r\n    width: 50%;\r\n    margin: auto;\r\n    overflow: hidden;\r\n    will-change: top, opacity;\r\n    box-shadow: 0 12px 15px 0 rgba(0, 0, 0, 0.24), 0 17px 50px 0 rgba(0, 0, 0, 0.19);\r\n    border-radius: 4px;\r\n    transition: 150ms all;\r\n    -moz-transition: 150ms all;\r\n    -webkit-transition: 150ms all;\r\n}\r\n\r\n.window-overlay {\r\n    height: 100%;\r\n    width: 100%;\r\n    position: fixed;\r\n    top: 0;\r\n    right: 0;\r\n    left: 0;\r\n    background: rgba(0,0,0,0.3);\r\n    bottom: 0;\r\n    z-index: 1000;\r\n}\r\n\r\n.window .window-toolbar {\r\n    background-color: #2196f3;\r\n    color: #fff;\r\n    overflow: hidden;\r\n    padding: 8px;\r\n}\r\n\r\n.window .window-title {\r\n    color: #fff;\r\n    font-size: 1.1em;\r\n    float: left;\r\n}\r\n\r\n.window .window-action {\r\n    font-size: 16px;\r\n    float: right;\r\n    margin-left: 12px;\r\n}\r\n\r\n.window.maximize {\r\n    width: 100% !important;\r\n    top: 0 !important;\r\n    left: 0 !important;\r\n    right: 0 !important;\r\n    bottom: 0 !important;\r\n    max-height: 100% !important;\r\n    transform: translate(0px ,0px) !important;\r\n    -webkit-transform: translate(0px ,0px) !important;\r\n    -moz-transform: translate(0px ,0px) !important;\r\n    -webkit-transition:width 400ms ease-in-out, height 400ms ease-in-out;\r\n    -moz-transition:width 400ms ease-in-out, height 400ms ease-in-out;\r\n    -o-transition:width 400ms ease-in-out, height 400ms ease-in-out;\r\n    transition:width 400ms ease-in-out, height 400ms ease-in-out;\r\n    height: 100vh !important;\r\n}\r\n\r\n.window.open {\r\n    display: block !important;\r\n    opacity: 1 !important;\r\n}\r\n\r\n.window .content {\r\n    background-color: #fafafa;\r\n    height: calc(100% - 40px);\r\n    overflow: auto;\r\n}\r\n\r\n@media only screen and (max-width: 992px) {\r\n    .window .content {\r\n        width: 100% !important;\r\n    }\r\n}";
      }
      public String getName() {
        return "windowCssDebug";
      }
    }
    ;
  }
  private static class windowCssDebugInitializer {
    static {
      _instance0.windowCssDebugInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return windowCssDebug;
    }
  }
  public com.google.gwt.resources.client.TextResource windowCssDebug() {
    return windowCssDebugInitializer.get();
  }
  private void windowDarkCssInitializer() {
    windowDarkCss = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.4.0/gwt-material-addins-2.4.0.jar!/gwt/material/design/addins/client/window/resources/css/window-dark.css
      public String getText() {
        return ".window .window-toolbar {\r\n    background-color: #1e1e1e;\r\n}\r\n\r\n.window .content {\r\n    background-color: #383838;\r\n}";
      }
      public String getName() {
        return "windowDarkCss";
      }
    }
    ;
  }
  private static class windowDarkCssInitializer {
    static {
      _instance0.windowDarkCssInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return windowDarkCss;
    }
  }
  public com.google.gwt.resources.client.TextResource windowDarkCss() {
    return windowDarkCssInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.google.gwt.resources.client.TextResource windowCssDebug;
  private static com.google.gwt.resources.client.TextResource windowDarkCss;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      windowCssDebug(), 
      windowDarkCss(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("windowCssDebug", windowCssDebug());
        resourceMap.put("windowDarkCss", windowDarkCss());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'windowCssDebug': return this.@gwt.material.design.addins.client.window.MaterialWindowDebugClientBundle::windowCssDebug()();
      case 'windowDarkCss': return this.@gwt.material.design.addins.client.window.MaterialWindowDebugClientBundle::windowDarkCss()();
    }
    return null;
  }-*/;
}
