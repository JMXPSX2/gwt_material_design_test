package gwt.material.design.addins.client.tree;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MaterialTreeDebugClientBundle_default_InlineClientBundleGenerator implements gwt.material.design.addins.client.tree.MaterialTreeDebugClientBundle {
  private static MaterialTreeDebugClientBundle_default_InlineClientBundleGenerator _instance0 = new MaterialTreeDebugClientBundle_default_InlineClientBundleGenerator();
  private void treeCssDebugInitializer() {
    treeCssDebug = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.4.0/gwt-material-addins-2.4.0.jar!/gwt/material/design/addins/client/tree/resources/css/tree.css
      public String getText() {
        return "/** Tree **/\r\n.tree{\r\n    overflow: auto;\r\n    width: 100%;\r\n}\r\n.tree-item .tree-header{\r\n    white-space: nowrap;\r\n}\r\n.tree-item{\r\n    clear: both;\r\n    margin-top: 10px;\r\n    margin-left: 20px;\r\n}\r\n\r\n.tree-item i{\r\n    margin-top: -2px;\r\n    float: left;\r\n    margin-right: 8px;\r\n}\r\n\r\n.tree-item img{\r\n    width: 2em;\r\n    height: 2em;\r\n    float: left;\r\n    margin-right: 8px;\r\n}\r\n\r\n.tree-item.selected > .tree-header span{\r\n    font-weight: bold;\r\n}";
      }
      public String getName() {
        return "treeCssDebug";
      }
    }
    ;
  }
  private static class treeCssDebugInitializer {
    static {
      _instance0.treeCssDebugInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return treeCssDebug;
    }
  }
  public com.google.gwt.resources.client.TextResource treeCssDebug() {
    return treeCssDebugInitializer.get();
  }
  private void treeDarkCssInitializer() {
    treeDarkCss = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.4.0/gwt-material-addins-2.4.0.jar!/gwt/material/design/addins/client/tree/resources/css/tree-dark.css
      public String getText() {
        return "/** Tree **/\r\n.tree-item i {\r\n    color: #BB86FC;\r\n}";
      }
      public String getName() {
        return "treeDarkCss";
      }
    }
    ;
  }
  private static class treeDarkCssInitializer {
    static {
      _instance0.treeDarkCssInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return treeDarkCss;
    }
  }
  public com.google.gwt.resources.client.TextResource treeDarkCss() {
    return treeDarkCssInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.google.gwt.resources.client.TextResource treeCssDebug;
  private static com.google.gwt.resources.client.TextResource treeDarkCss;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      treeCssDebug(), 
      treeDarkCss(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("treeCssDebug", treeCssDebug());
        resourceMap.put("treeDarkCss", treeDarkCss());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'treeCssDebug': return this.@gwt.material.design.addins.client.tree.MaterialTreeDebugClientBundle::treeCssDebug()();
      case 'treeDarkCss': return this.@gwt.material.design.addins.client.tree.MaterialTreeDebugClientBundle::treeDarkCss()();
    }
    return null;
  }-*/;
}
