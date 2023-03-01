package gwt.material.design.addins.client.bubble;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MaterialBubbleDebugClientBundle_default_InlineClientBundleGenerator implements gwt.material.design.addins.client.bubble.MaterialBubbleDebugClientBundle {
  private static MaterialBubbleDebugClientBundle_default_InlineClientBundleGenerator _instance0 = new MaterialBubbleDebugClientBundle_default_InlineClientBundleGenerator();
  private void bubbleCssDebugInitializer() {
    bubbleCssDebug = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.4.0/gwt-material-addins-2.4.0.jar!/gwt/material/design/addins/client/bubble/resources/css/bubble.css
      public String getText() {
        return ".bubble{\r\n    margin-left: 60px;\r\n    float: left;\r\n    background: #f3f3f3;\r\n    color: #263238;\r\n    position: relative;\r\n    margin: 8px 0 15px 0;\r\n    height: auto;\r\n    padding: 8px 10px;\r\n    display: block;\r\n    word-wrap: break-word;\r\n    border-radius: 3px;\r\n    -moz-border-radius: 3px;\r\n    -webkit-border-radius: 3px;\r\n    z-index: 1;\r\n    font-size: 0.9rem;\r\n}\r\n.triangle{\r\n    position: absolute;\r\n    z-index: 998;\r\n    border: 6px solid transparent;\r\n    opacity: 0.8;\r\n}\r\n.triangle.right{\r\n    top: 15px;\r\n    right: -12px;\r\n    border-left-color: #f3f3f3;\r\n}\r\n.triangle.left{\r\n    top: 15px;\r\n    left: -12px;\r\n    border-right-color: #f3f3f3;\r\n}\r\n.triangle.top, .triangle.bottom{\r\n    left: calc(50% - 4px);\r\n}\r\n.triangle.top{\r\n    top: -12px;\r\n    border-bottom-color: #f3f3f3;\r\n}\r\n.triangle.bottom{\r\n    bottom: -12px;\r\n    border-top-color: #f3f3f3;\r\n}";
      }
      public String getName() {
        return "bubbleCssDebug";
      }
    }
    ;
  }
  private static class bubbleCssDebugInitializer {
    static {
      _instance0.bubbleCssDebugInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return bubbleCssDebug;
    }
  }
  public com.google.gwt.resources.client.TextResource bubbleCssDebug() {
    return bubbleCssDebugInitializer.get();
  }
  private void bubbleDarkDebugCssInitializer() {
    bubbleDarkDebugCss = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.4.0/gwt-material-addins-2.4.0.jar!/gwt/material/design/addins/client/bubble/resources/css/bubble-dark.css
      public String getText() {
        return ".bubble {\r\n    background: #424242;\r\n    color: #ffffff;\r\n}\r\n\r\n.bubble .triangle.left {\r\n    border-right-color: #424242;\r\n}\r\n.bubble .triangle.right {\r\n    border-left-color: #424242;\r\n}\r\n.bubble .triangle.top {\r\n    border-bottom-color: #424242;\r\n}\r\n\r\n.bubble .triangle.bottom {\r\n    border-top-color: #424242;\r\n}";
      }
      public String getName() {
        return "bubbleDarkDebugCss";
      }
    }
    ;
  }
  private static class bubbleDarkDebugCssInitializer {
    static {
      _instance0.bubbleDarkDebugCssInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return bubbleDarkDebugCss;
    }
  }
  public com.google.gwt.resources.client.TextResource bubbleDarkDebugCss() {
    return bubbleDarkDebugCssInitializer.get();
  }
  private void bubbleJsDebugInitializer() {
    bubbleJsDebug = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.4.0/gwt-material-addins-2.4.0.jar!/gwt/material/design/addins/client/bubble/resources/js/bubble.js
      public String getText() {
        return "$.fn.bubble = function (options){\r\n\r\n    var position = options.position,\r\n        color = options.color;\r\n    triangle = $(this).find('.triangle');\r\n\r\n    if(position === 'left'){\r\n        triangle.css('borderRightColor', color);\r\n    }else if(position === 'right'){\r\n        triangle.css('borderLeftColor', color);\r\n    }else if(position === 'top'){\r\n        triangle.css('borderBottomColor', color);\r\n    }else if(position === 'bottom'){\r\n        triangle.css('borderTopColor', color);\r\n    }\r\n};";
      }
      public String getName() {
        return "bubbleJsDebug";
      }
    }
    ;
  }
  private static class bubbleJsDebugInitializer {
    static {
      _instance0.bubbleJsDebugInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return bubbleJsDebug;
    }
  }
  public com.google.gwt.resources.client.TextResource bubbleJsDebug() {
    return bubbleJsDebugInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.google.gwt.resources.client.TextResource bubbleCssDebug;
  private static com.google.gwt.resources.client.TextResource bubbleDarkDebugCss;
  private static com.google.gwt.resources.client.TextResource bubbleJsDebug;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      bubbleCssDebug(), 
      bubbleDarkDebugCss(), 
      bubbleJsDebug(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("bubbleCssDebug", bubbleCssDebug());
        resourceMap.put("bubbleDarkDebugCss", bubbleDarkDebugCss());
        resourceMap.put("bubbleJsDebug", bubbleJsDebug());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'bubbleCssDebug': return this.@gwt.material.design.addins.client.bubble.MaterialBubbleDebugClientBundle::bubbleCssDebug()();
      case 'bubbleDarkDebugCss': return this.@gwt.material.design.addins.client.bubble.MaterialBubbleDebugClientBundle::bubbleDarkDebugCss()();
      case 'bubbleJsDebug': return this.@gwt.material.design.addins.client.bubble.MaterialBubbleDebugClientBundle::bubbleJsDebug()();
    }
    return null;
  }-*/;
}
