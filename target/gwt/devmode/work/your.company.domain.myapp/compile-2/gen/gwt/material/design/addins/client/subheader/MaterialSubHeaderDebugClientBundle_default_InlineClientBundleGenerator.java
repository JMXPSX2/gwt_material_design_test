package gwt.material.design.addins.client.subheader;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MaterialSubHeaderDebugClientBundle_default_InlineClientBundleGenerator implements gwt.material.design.addins.client.subheader.MaterialSubHeaderDebugClientBundle {
  private static MaterialSubHeaderDebugClientBundle_default_InlineClientBundleGenerator _instance0 = new MaterialSubHeaderDebugClientBundle_default_InlineClientBundleGenerator();
  private void subheaderCssDebugInitializer() {
    subheaderCssDebug = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.4.0/gwt-material-addins-2.4.0.jar!/gwt/material/design/addins/client/subheader/resources/css/subheader.css
      public String getText() {
        return ".subheader {\r\n    background: #fff;\r\n    position: relative;\r\n    z-index: 995;\r\n    padding: 12px;\r\n}\r\n.subheader.fixed {\r\n    position: fixed;\r\n    top: 0;\r\n    width: 200px;\r\n    z-index: 0;\r\n}\r\n.subheader.fixed.absolute {\r\n    position: absolute;\r\n}\r\n.subheader-container {\r\n    overflow: auto;\r\n    position: relative;\r\n    padding: 0px !important;\r\n}\r\n.subheader-container .collection{\r\n    margin: 0 !important;\r\n}\r\n.top_holder {\r\n    position: absolute;\r\n    left: 0;\r\n    top: 0;\r\n    min-height: 5px;\r\n    width: 100%;\r\n    z-index: 996;\r\n}";
      }
      public String getName() {
        return "subheaderCssDebug";
      }
    }
    ;
  }
  private static class subheaderCssDebugInitializer {
    static {
      _instance0.subheaderCssDebugInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return subheaderCssDebug;
    }
  }
  public com.google.gwt.resources.client.TextResource subheaderCssDebug() {
    return subheaderCssDebugInitializer.get();
  }
  private void subheaderDarkCssInitializer() {
    subheaderDarkCss = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.4.0/gwt-material-addins-2.4.0.jar!/gwt/material/design/addins/client/subheader/resources/css/subheader-dark.css
      public String getText() {
        return ".subheader,\r\n.subheader-static{\r\n    background-color: #2f2f2f;\r\n}";
      }
      public String getName() {
        return "subheaderDarkCss";
      }
    }
    ;
  }
  private static class subheaderDarkCssInitializer {
    static {
      _instance0.subheaderDarkCssInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return subheaderDarkCss;
    }
  }
  public com.google.gwt.resources.client.TextResource subheaderDarkCss() {
    return subheaderDarkCssInitializer.get();
  }
  private void subheaderJsDebugInitializer() {
    subheaderJsDebug = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.4.0/gwt-material-addins-2.4.0.jar!/gwt/material/design/addins/client/subheader/resources/js/subheader.js
      public String getText() {
        return "function initSubheader(stickyElem, containerElem) {\r\n  jQuery(document).ready(function(){\r\n    var newStickies = new stickyTitles(stickyElem, containerElem);\r\n    newStickies.load();\r\n    $(containerElem).on(\"scroll\", function() {\r\n      newStickies.scroll();\r\n    });\r\n  });\r\n}\r\n\r\nfunction stickyTitles(stickyElem, containerElem) {\r\n  var stickies = jQuery(stickyElem);\r\n  var container = jQuery(containerElem);\r\n  container.addClass(\"subheader-container\");\r\n\r\n  /** Added top holder component **/\r\n  var topHolder = document.createElement(\"div\");\r\n  $(topHolder).addClass(\"top_holder\");\r\n  container.prepend(topHolder);\r\n\r\n  this.load = function() {\r\n    stickies.each(function() {\r\n      var thisSticky = jQuery(this).wrap('<div class=\"followWrap\" />');\r\n      thisSticky.parent().height(thisSticky.outerHeight());\r\n\r\n      jQuery.data(thisSticky[0], 'pos', thisSticky.position().top);\r\n    });\r\n  };\r\n\r\n  this.scroll = function() {\r\n    $(topHolder).css('top',  container.scrollTop());\r\n    $(topHolder).addClass(\"z-depth-1\");\r\n    stickies.each(function(i) {\r\n      var thisSticky = jQuery(this),\r\n          nextSticky = stickies.eq(i+1),\r\n          prevSticky = stickies.eq(i-1),\r\n          pos = jQuery.data(thisSticky[0], 'pos');\r\n\r\n      if(container.scrollTop() == 0) {\r\n        $(topHolder).hide();\r\n      } else {\r\n        $(topHolder).show();\r\n      }\r\n\r\n      if (pos <= container.scrollTop()) {\r\n        $(topHolder).html('');\r\n        thisSticky.clone().appendTo($(topHolder));\r\n      } else {\r\n        thisSticky.removeAttr('style').show();\r\n        if (prevSticky.length > 0 && container.offset().top <= jQuery.data(thisSticky[0], 'pos') - prevSticky.outerHeight()) {\r\n          prevSticky.removeClass(\"absolute\").removeAttr(\"style\");\r\n        }\r\n      }\r\n    });\r\n  }\r\n}";
      }
      public String getName() {
        return "subheaderJsDebug";
      }
    }
    ;
  }
  private static class subheaderJsDebugInitializer {
    static {
      _instance0.subheaderJsDebugInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return subheaderJsDebug;
    }
  }
  public com.google.gwt.resources.client.TextResource subheaderJsDebug() {
    return subheaderJsDebugInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.google.gwt.resources.client.TextResource subheaderCssDebug;
  private static com.google.gwt.resources.client.TextResource subheaderDarkCss;
  private static com.google.gwt.resources.client.TextResource subheaderJsDebug;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      subheaderCssDebug(), 
      subheaderDarkCss(), 
      subheaderJsDebug(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("subheaderCssDebug", subheaderCssDebug());
        resourceMap.put("subheaderDarkCss", subheaderDarkCss());
        resourceMap.put("subheaderJsDebug", subheaderJsDebug());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'subheaderCssDebug': return this.@gwt.material.design.addins.client.subheader.MaterialSubHeaderDebugClientBundle::subheaderCssDebug()();
      case 'subheaderDarkCss': return this.@gwt.material.design.addins.client.subheader.MaterialSubHeaderDebugClientBundle::subheaderDarkCss()();
      case 'subheaderJsDebug': return this.@gwt.material.design.addins.client.subheader.MaterialSubHeaderDebugClientBundle::subheaderJsDebug()();
    }
    return null;
  }-*/;
}
