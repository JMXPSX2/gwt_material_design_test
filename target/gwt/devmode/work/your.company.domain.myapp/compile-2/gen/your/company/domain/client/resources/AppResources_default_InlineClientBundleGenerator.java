package your.company.domain.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class AppResources_default_InlineClientBundleGenerator implements your.company.domain.client.resources.AppResources {
  private static AppResources_default_InlineClientBundleGenerator _instance0 = new AppResources_default_InlineClientBundleGenerator();
  private void appCssInitializer() {
    appCss = new com.google.gwt.resources.client.TextResource() {
      // file:/Users/jmxpsx/Desktop/GWT%20Material%20Design/your-project/target/myapp/WEB-INF/classes/your/company/domain/client/resources/css/app.css
      public String getText() {
        return "/** Default Style for your application specific styles **/";
      }
      public String getName() {
        return "appCss";
      }
    }
    ;
  }
  private static class appCssInitializer {
    static {
      _instance0.appCssInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return appCss;
    }
  }
  public com.google.gwt.resources.client.TextResource appCss() {
    return appCssInitializer.get();
  }
  private void appDarkCssInitializer() {
    appDarkCss = new com.google.gwt.resources.client.TextResource() {
      // file:/Users/jmxpsx/Desktop/GWT%20Material%20Design/your-project/target/myapp/WEB-INF/classes/your/company/domain/client/resources/css/app-dark.css
      public String getText() {
        return "/** Dark theme Style for your application specific styles **/";
      }
      public String getName() {
        return "appDarkCss";
      }
    }
    ;
  }
  private static class appDarkCssInitializer {
    static {
      _instance0.appDarkCssInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return appDarkCss;
    }
  }
  public com.google.gwt.resources.client.TextResource appDarkCss() {
    return appDarkCssInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.google.gwt.resources.client.TextResource appCss;
  private static com.google.gwt.resources.client.TextResource appDarkCss;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      appCss(), 
      appDarkCss(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("appCss", appCss());
        resourceMap.put("appDarkCss", appDarkCss());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'appCss': return this.@your.company.domain.client.resources.AppResources::appCss()();
      case 'appDarkCss': return this.@your.company.domain.client.resources.AppResources::appDarkCss()();
    }
    return null;
  }-*/;
}
