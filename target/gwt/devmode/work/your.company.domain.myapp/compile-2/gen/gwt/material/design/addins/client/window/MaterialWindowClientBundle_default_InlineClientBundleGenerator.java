package gwt.material.design.addins.client.window;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MaterialWindowClientBundle_default_InlineClientBundleGenerator implements gwt.material.design.addins.client.window.MaterialWindowClientBundle {
  private static MaterialWindowClientBundle_default_InlineClientBundleGenerator _instance0 = new MaterialWindowClientBundle_default_InlineClientBundleGenerator();
  private void windowCssInitializer() {
    windowCss = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.4.0/gwt-material-addins-2.4.0.jar!/gwt/material/design/addins/client/window/resources/css/window.min.css
      public String getText() {
        return ".window,.window-overlay{position:fixed;top:0;right:0;left:0}.window{display:none;z-index:1001;padding:0;width:50%;margin:auto;overflow:hidden;will-change:top,opacity;box-shadow:0 12px 15px 0 rgba(0,0,0,.24),0 17px 50px 0 rgba(0,0,0,.19);border-radius:4px;transition:150ms all;-moz-transition:150ms all;-webkit-transition:150ms all}.window-overlay{height:100%;width:100%;background:rgba(0,0,0,.3);bottom:0;z-index:1000}.window .window-toolbar{background-color:#2196f3;color:#fff;overflow:hidden;padding:8px}.window .window-title{color:#fff;font-size:1.1em;float:left}.window .window-action{font-size:16px;float:right;margin-left:12px}.window.maximize{width:100%!important;top:0!important;left:0!important;right:0!important;bottom:0!important;max-height:100%!important;transform:translate(0 ,0)!important;-webkit-transform:translate(0 ,0)!important;-moz-transform:translate(0 ,0)!important;-webkit-transition:width .4s ease-in-out,height .4s ease-in-out;-moz-transition:width .4s ease-in-out,height .4s ease-in-out;-o-transition:width .4s ease-in-out,height .4s ease-in-out;transition:width .4s ease-in-out,height .4s ease-in-out;height:100vh!important}.window.open{display:block!important;opacity:1!important}.window .content{background-color:#fafafa;height:calc(100% - 40px);overflow:auto}@media only screen and (max-width:992px){.window .content{width:100%!important}}";
      }
      public String getName() {
        return "windowCss";
      }
    }
    ;
  }
  private static class windowCssInitializer {
    static {
      _instance0.windowCssInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return windowCss;
    }
  }
  public com.google.gwt.resources.client.TextResource windowCss() {
    return windowCssInitializer.get();
  }
  private void windowDarkCssInitializer() {
    windowDarkCss = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.4.0/gwt-material-addins-2.4.0.jar!/gwt/material/design/addins/client/window/resources/css/window-dark.min.css
      public String getText() {
        return "";
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
  private static com.google.gwt.resources.client.TextResource windowCss;
  private static com.google.gwt.resources.client.TextResource windowDarkCss;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      windowCss(), 
      windowDarkCss(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("windowCss", windowCss());
        resourceMap.put("windowDarkCss", windowDarkCss());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'windowCss': return this.@gwt.material.design.addins.client.window.MaterialWindowClientBundle::windowCss()();
      case 'windowDarkCss': return this.@gwt.material.design.addins.client.window.MaterialWindowClientBundle::windowDarkCss()();
    }
    return null;
  }-*/;
}
