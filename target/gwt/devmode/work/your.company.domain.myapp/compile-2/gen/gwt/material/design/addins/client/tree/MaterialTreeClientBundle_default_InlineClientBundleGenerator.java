package gwt.material.design.addins.client.tree;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MaterialTreeClientBundle_default_InlineClientBundleGenerator implements gwt.material.design.addins.client.tree.MaterialTreeClientBundle {
  private static MaterialTreeClientBundle_default_InlineClientBundleGenerator _instance0 = new MaterialTreeClientBundle_default_InlineClientBundleGenerator();
  private void treeCssInitializer() {
    treeCss = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.4.0/gwt-material-addins-2.4.0.jar!/gwt/material/design/addins/client/tree/resources/css/tree.min.css
      public String getText() {
        return ".tree-item i,.tree-item img{float:left;margin-right:8px}.tree{overflow:auto;width:100%}.tree-item .tree-header{white-space:nowrap}.tree-item{clear:both;margin-top:10px;margin-left:20px}.tree-item i{margin-top:-2px}.tree-item img{width:2em;height:2em}.tree-item.selected>.tree-header span{font-weight:700}";
      }
      public String getName() {
        return "treeCss";
      }
    }
    ;
  }
  private static class treeCssInitializer {
    static {
      _instance0.treeCssInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return treeCss;
    }
  }
  public com.google.gwt.resources.client.TextResource treeCss() {
    return treeCssInitializer.get();
  }
  private void treeDarkCssInitializer() {
    treeDarkCss = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.4.0/gwt-material-addins-2.4.0.jar!/gwt/material/design/addins/client/tree/resources/css/tree-dark.min.css
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
  private static com.google.gwt.resources.client.TextResource treeCss;
  private static com.google.gwt.resources.client.TextResource treeDarkCss;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      treeCss(), 
      treeDarkCss(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("treeCss", treeCss());
        resourceMap.put("treeDarkCss", treeDarkCss());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'treeCss': return this.@gwt.material.design.addins.client.tree.MaterialTreeClientBundle::treeCss()();
      case 'treeDarkCss': return this.@gwt.material.design.addins.client.tree.MaterialTreeClientBundle::treeDarkCss()();
    }
    return null;
  }-*/;
}
