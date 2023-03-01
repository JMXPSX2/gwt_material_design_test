package gwt.material.design.addins.client.bubble;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MaterialBubbleClientBundle_default_InlineClientBundleGenerator implements gwt.material.design.addins.client.bubble.MaterialBubbleClientBundle {
  private static MaterialBubbleClientBundle_default_InlineClientBundleGenerator _instance0 = new MaterialBubbleClientBundle_default_InlineClientBundleGenerator();
  private void bubbleCssInitializer() {
    bubbleCss = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.4.0/gwt-material-addins-2.4.0.jar!/gwt/material/design/addins/client/bubble/resources/css/bubble.min.css
      public String getText() {
        return ".bubble{margin-left:60px;float:left;background:#f3f3f3;color:#263238;position:relative;margin:8px 0 15px 0;height:auto;padding:8px 10px;display:block;word-wrap:break-word;border-radius:3px;-moz-border-radius:3px;-webkit-border-radius:3px;z-index:1;font-size:.9rem}.triangle{position:absolute;z-index:998;border:6px solid transparent;opacity:.8}.triangle.right{top:15px;right:-12px;border-left-color:#d0d0d0}.triangle.left{top:15px;left:-12px;border-right-color:#d0d0d0}.triangle.bottom,.triangle.top{left:calc(50% - 4px)}.triangle.top{top:-12px;border-bottom-color:#d0d0d0}.triangle.bottom{bottom:-12px;border-top-color:#d0d0d0}";
      }
      public String getName() {
        return "bubbleCss";
      }
    }
    ;
  }
  private static class bubbleCssInitializer {
    static {
      _instance0.bubbleCssInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return bubbleCss;
    }
  }
  public com.google.gwt.resources.client.TextResource bubbleCss() {
    return bubbleCssInitializer.get();
  }
  private void bubbleDarkCssInitializer() {
    bubbleDarkCss = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.4.0/gwt-material-addins-2.4.0.jar!/gwt/material/design/addins/client/bubble/resources/css/bubble-dark.min.css
      public String getText() {
        return ".bubble{background:#424242;color:#fff}.bubble .triangle.left{border-right-color:#424242}.bubble .triangle.right{border-left-color:#424242}.bubble .triangle.top{border-bottom-color:#424242}.bubble .triangle.bottom{border-top-color:#424242}";
      }
      public String getName() {
        return "bubbleDarkCss";
      }
    }
    ;
  }
  private static class bubbleDarkCssInitializer {
    static {
      _instance0.bubbleDarkCssInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return bubbleDarkCss;
    }
  }
  public com.google.gwt.resources.client.TextResource bubbleDarkCss() {
    return bubbleDarkCssInitializer.get();
  }
  private void bubbleJsInitializer() {
    bubbleJs = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.4.0/gwt-material-addins-2.4.0.jar!/gwt/material/design/addins/client/bubble/resources/js/bubble.min.js
      public String getText() {
        return "$.fn.bubble = function (options){var position = options.position, color = options.color; triangle = $(this).find('.triangle'); if(position === 'left'){triangle.css('borderRightColor', color); }else if(position === 'right'){triangle.css('borderLeftColor', color); }else if(position === 'top'){triangle.css('borderBottomColor', color); }else if(position === 'bottom'){triangle.css('borderTopColor', color); } };";
      }
      public String getName() {
        return "bubbleJs";
      }
    }
    ;
  }
  private static class bubbleJsInitializer {
    static {
      _instance0.bubbleJsInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return bubbleJs;
    }
  }
  public com.google.gwt.resources.client.TextResource bubbleJs() {
    return bubbleJsInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.google.gwt.resources.client.TextResource bubbleCss;
  private static com.google.gwt.resources.client.TextResource bubbleDarkCss;
  private static com.google.gwt.resources.client.TextResource bubbleJs;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      bubbleCss(), 
      bubbleDarkCss(), 
      bubbleJs(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("bubbleCss", bubbleCss());
        resourceMap.put("bubbleDarkCss", bubbleDarkCss());
        resourceMap.put("bubbleJs", bubbleJs());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'bubbleCss': return this.@gwt.material.design.addins.client.bubble.MaterialBubbleClientBundle::bubbleCss()();
      case 'bubbleDarkCss': return this.@gwt.material.design.addins.client.bubble.MaterialBubbleClientBundle::bubbleDarkCss()();
      case 'bubbleJs': return this.@gwt.material.design.addins.client.bubble.MaterialBubbleClientBundle::bubbleJs()();
    }
    return null;
  }-*/;
}
