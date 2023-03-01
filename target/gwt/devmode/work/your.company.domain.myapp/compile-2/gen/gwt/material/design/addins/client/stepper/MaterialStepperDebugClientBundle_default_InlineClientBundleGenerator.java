package gwt.material.design.addins.client.stepper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MaterialStepperDebugClientBundle_default_InlineClientBundleGenerator implements gwt.material.design.addins.client.stepper.MaterialStepperDebugClientBundle {
  private static MaterialStepperDebugClientBundle_default_InlineClientBundleGenerator _instance0 = new MaterialStepperDebugClientBundle_default_InlineClientBundleGenerator();
  private void stepperDarkCssInitializer() {
    stepperDarkCss = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.4.0/gwt-material-addins-2.4.0.jar!/gwt/material/design/addins/client/stepper/resources/css/stepper-dark.css
      public String getText() {
        return ".stepper.horizontal .step .step-header {\r\n    background: #292929;\r\n}\r\n\r\n.stepper .line {\r\n    border-left: 2px solid #414141;\r\n}\r\n\r\n.stepper.horizontal .step .line {\r\n    border-top: 2px solid #414141;\r\n}\r\n\r\n.stepper .step:hover, .stepper.horizontal .step:hover .step-header {\r\n    background: #303030;\r\n}\r\n\r\n.stepper .step > div:first-child .circle {\r\n    background: #bb86fc !important;\r\n}\r\n\r\n.stepper .step.success > div:first-child i,\r\n.stepper .step.success .title, .stepper .step.success .description {\r\n    color: #bb86fc !important;\r\n}\r\n\r\n.feedback {\r\n    background: transparent;\r\n}\r\n\r\n.feedback .loader-wrapper {\r\n    background-color: rgb(59, 59, 59) !important;\r\n}\r\n";
      }
      public String getName() {
        return "stepperDarkCss";
      }
    }
    ;
  }
  private static class stepperDarkCssInitializer {
    static {
      _instance0.stepperDarkCssInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return stepperDarkCss;
    }
  }
  public com.google.gwt.resources.client.TextResource stepperDarkCss() {
    return stepperDarkCssInitializer.get();
  }
  private void stepperDebugCssInitializer() {
    stepperDebugCss = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.4.0/gwt-material-addins-2.4.0.jar!/gwt/material/design/addins/client/stepper/resources/css/stepper.css
      public String getText() {
        return ".stepper .step {\r\n    position: relative;\r\n    min-height: 32px;\r\n    padding: 12px;\r\n    cursor: pointer;\r\n}\r\n\r\n.stepper.horizontal .step {\r\n    min-width: 240px;\r\n}\r\n\r\n.stepper.horizontal.fixed-step-width .step {\r\n    min-width: unset;\r\n}\r\n\r\n.stepper .step:hover,\r\n.stepper.horizontal .step:hover .step-header {\r\n    background: #F6F6F6\r\n}\r\n\r\n.stepper .step > div:first-child {\r\n    position: static;\r\n    height: 0\r\n}\r\n\r\n.stepper .step > div:last-child {\r\n    margin-left: 32px;\r\n    padding-left: 16px;\r\n    min-height: 24px\r\n}\r\n\r\n.stepper .step > div:first-child .circle {\r\n    background: #4285f4;\r\n    width: 32px;\r\n    height: 32px;\r\n    line-height: 32px;\r\n    border-radius: 16px;\r\n    position: relative;\r\n    color: #fff;\r\n    text-align: center\r\n}\r\n\r\n.stepper .line {\r\n    position: absolute;\r\n    border-left: 2px solid #dcdcdc;\r\n    left: 28px;\r\n    bottom: 0;\r\n    top: 56px;\r\n    z-index: 1\r\n}\r\n\r\n.stepper .step:last-child .line {\r\n    display: none !important\r\n}\r\n\r\n.stepper .title {\r\n    line-height: 32px;\r\n    font-weight: 500;\r\n    margin-left: 0\r\n}\r\n\r\n.stepper .body {\r\n    opacity: 1;\r\n    padding: 20px\r\n}\r\n\r\n.stepper .description {\r\n    line-height: 1.2;\r\n    font-size: 1em;\r\n    padding-bottom: 24px;\r\n    color: #989898\r\n}\r\n\r\n.stepper.horizontal {\r\n    line-height: 0;\r\n    position: relative;\r\n    min-height: 600px\r\n}\r\n\r\n.stepper.horizontal .step {\r\n    display: inline-block;\r\n    height: 72px;\r\n    padding-top: 20px;\r\n    position: initial\r\n}\r\n\r\n.stepper.horizontal .step .line, .stepper.horizontal .step .title, .stepper.horizontal .step > div:first-child .circle {\r\n    display: inline-block\r\n}\r\n\r\n.stepper.horizontal .step .step-header {\r\n    display: inherit;\r\n    height: 40px;\r\n    max-width: 80%;\r\n    background: #FFFFFF;\r\n    z-index: 1;\r\n    position: relative;\r\n    padding-right: 20px;\r\n    box-sizing: border-box;\r\n    white-space: nowrap;\r\n    overflow: hidden;\r\n    text-overflow: ellipsis;\r\n}\r\n\r\n.stepper.horizontal .step .line {\r\n    border-left: 0;\r\n    height: 2px;\r\n    position: inherit;\r\n    border-top: 2px solid #dcdcdc;\r\n    width: 100%;\r\n    float: right;\r\n    margin-top: -24px;\r\n}\r\n\r\n.stepper.horizontal .step .title {\r\n    margin-left: 8px\r\n}\r\n\r\n.stepper.horizontal .step .description {\r\n    margin-left: 40px;\r\n    font-size: .8em;\r\n    margin-top: -8px\r\n}\r\n\r\n.stepper.horizontal .step .body {\r\n    line-height: initial\r\n}\r\n\r\n.stepper.horizontal .step > div:last-child {\r\n    position: absolute;\r\n    width: 100%;\r\n    top: 93px;\r\n    padding-left: 0;\r\n    margin: auto;\r\n    left: 0\r\n}\r\n\r\n.stepper .step.inactive .title {\r\n    color: #C9C9C9;\r\n    font-weight: 400\r\n}\r\n\r\n.stepper .step.inactive .body {\r\n    opacity: 0;\r\n    transition: .6s all;\r\n    -webkit-transition: .6s all;\r\n    max-height: 0;\r\n    z-index: -1;\r\n    position: relative;\r\n    display: none\r\n}\r\n\r\n.stepper .step.active .body {\r\n    opacity: 1;\r\n    transition-delay: .3s;\r\n    -webkit-transition-delay: .3s;\r\n    max-height: 1400px;\r\n    padding-bottom: 28px;\r\n    padding-top: 8px;\r\n    z-index: 1 !important;\r\n    display: block !important\r\n}\r\n\r\n.stepper .step.inactive > div:first-child .circle {\r\n    background-color: #9e9e9e !important\r\n}\r\n\r\n.stepper .step > div:first-child i {\r\n    font-size: 36px;\r\n    vertical-align: middle\r\n}\r\n\r\n.stepper .step.success .description, .stepper .step.success .title, .stepper .step.success > div:first-child i {\r\n    color: #2196f3\r\n}\r\n\r\n.stepper .step.error .description, .stepper .step.error .title, .stepper .step.error > div:first-child i {\r\n    color: #f44336\r\n}\r\n\r\n.stepper .step.error > div:first-child .description, .stepper .step.success > div:first-child .description {\r\n    margin-left: 44px\r\n}\r\n\r\n.stepper .step.error .title, .stepper .step.success .title {\r\n    font-weight: 600\r\n}\r\n\r\n.feedback {\r\n    position: absolute !important;\r\n    left: 0;\r\n    font-size: 1.1em;\r\n    top: 0;\r\n    width: 100%;\r\n    height: 100%;\r\n    padding: 36px\r\n}\r\n\r\n\r\n.feedback .loader-wrapper {\r\n    background-color: #dfdfdf!important;\r\n}\r\n\r\n/** Vertical Stepper **/\r\n.stepper.vertical {\r\n    position: relative;\r\n}\r\n\r\n.stepper.vertical .step {\r\n    width: 100% !important;\r\n}\r\n\r\n.stepper.vertical .step.active .body {\r\n    padding-bottom: 0;\r\n    padding-right: 20px\r\n}";
      }
      public String getName() {
        return "stepperDebugCss";
      }
    }
    ;
  }
  private static class stepperDebugCssInitializer {
    static {
      _instance0.stepperDebugCssInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return stepperDebugCss;
    }
  }
  public com.google.gwt.resources.client.TextResource stepperDebugCss() {
    return stepperDebugCssInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.google.gwt.resources.client.TextResource stepperDarkCss;
  private static com.google.gwt.resources.client.TextResource stepperDebugCss;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      stepperDarkCss(), 
      stepperDebugCss(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("stepperDarkCss", stepperDarkCss());
        resourceMap.put("stepperDebugCss", stepperDebugCss());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'stepperDarkCss': return this.@gwt.material.design.addins.client.stepper.MaterialStepperDebugClientBundle::stepperDarkCss()();
      case 'stepperDebugCss': return this.@gwt.material.design.addins.client.stepper.MaterialStepperDebugClientBundle::stepperDebugCss()();
    }
    return null;
  }-*/;
}
