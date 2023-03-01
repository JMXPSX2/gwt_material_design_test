package gwt.material.design.addins.client.rating;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MaterialRatingDebugClientBundle_default_InlineClientBundleGenerator implements gwt.material.design.addins.client.rating.MaterialRatingDebugClientBundle {
  private static MaterialRatingDebugClientBundle_default_InlineClientBundleGenerator _instance0 = new MaterialRatingDebugClientBundle_default_InlineClientBundleGenerator();
  private void ratingDarkCssInitializer() {
    ratingDarkCss = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.4.0/gwt-material-addins-2.4.0.jar!/gwt/material/design/addins/client/rating/resources/css/rating-dark.css
      public String getText() {
        return ".material-rating {\r\n    color: #bb86fc;\r\n}";
      }
      public String getName() {
        return "ratingDarkCss";
      }
    }
    ;
  }
  private static class ratingDarkCssInitializer {
    static {
      _instance0.ratingDarkCssInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return ratingDarkCss;
    }
  }
  public com.google.gwt.resources.client.TextResource ratingDarkCss() {
    return ratingDarkCssInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.google.gwt.resources.client.TextResource ratingDarkCss;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      ratingDarkCss(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("ratingDarkCss", ratingDarkCss());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'ratingDarkCss': return this.@gwt.material.design.addins.client.rating.MaterialRatingDebugClientBundle::ratingDarkCss()();
    }
    return null;
  }-*/;
}
