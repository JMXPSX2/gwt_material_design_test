package gwt.material.design.addins.client.overlay;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MaterialOverlayClientBundle_default_InlineClientBundleGenerator implements gwt.material.design.addins.client.overlay.MaterialOverlayClientBundle {
  private static MaterialOverlayClientBundle_default_InlineClientBundleGenerator _instance0 = new MaterialOverlayClientBundle_default_InlineClientBundleGenerator();
  private void overlayCssInitializer() {
    overlayCss = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.4.0/gwt-material-addins-2.4.0.jar!/gwt/material/design/addins/client/overlay/resources/css/overlay.min.css
      public String getText() {
        return ".overlay-panel{width:100%;height:100%;top:0;left:0;right:0;bottom:0;position:fixed;z-index:999;visibility:hidden;opacity:0;background:#fff}.overlay-tab .lean-overlay{background:rgba(0,0,0,.7)}.overlay-panel.tab{will-change:transform,opacity,box-shadow;-webkit-transition:all .8s cubic-bezier(.23,1,.32,1);transition:all .8s cubic-bezier(.23,1,.32,1);box-shadow:rgba(0,0,0,.4) 0 30px 60px;cursor:pointer}.overlay-panel .minimize-icon{position:absolute;right:20px;top:20px;z-index:1010}.overlay-panel .number{font-size:12em;text-align:center;padding:10%;width:100%}.overlay-panel.maximize{transform:translate3d(0,0,0) scale(1)!important}.overlay-panel.hidden{transform:translate3d(0,100%,0) scale(1)!important}.overlay-tab .close{position:fixed;bottom:32px;right:22px;z-index:1020}.overlay-tab-activator{position:relative}.overlay-tab-activator .badge{width:16px!important;height:16px!important;padding-top:8px!important;right:0;top:-8px;background:#E91E63}";
      }
      public String getName() {
        return "overlayCss";
      }
    }
    ;
  }
  private static class overlayCssInitializer {
    static {
      _instance0.overlayCssInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return overlayCss;
    }
  }
  public com.google.gwt.resources.client.TextResource overlayCss() {
    return overlayCssInitializer.get();
  }
  private void overlayDarkCssInitializer() {
    overlayDarkCss = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.4.0/gwt-material-addins-2.4.0.jar!/gwt/material/design/addins/client/overlay/resources/css/overlay-dark.min.css
      public String getText() {
        return ".overlay-panel{background:#383838}";
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
  private static com.google.gwt.resources.client.TextResource overlayCss;
  private static com.google.gwt.resources.client.TextResource overlayDarkCss;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      overlayCss(), 
      overlayDarkCss(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("overlayCss", overlayCss());
        resourceMap.put("overlayDarkCss", overlayDarkCss());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'overlayCss': return this.@gwt.material.design.addins.client.overlay.MaterialOverlayClientBundle::overlayCss()();
      case 'overlayDarkCss': return this.@gwt.material.design.addins.client.overlay.MaterialOverlayClientBundle::overlayDarkCss()();
    }
    return null;
  }-*/;
}
