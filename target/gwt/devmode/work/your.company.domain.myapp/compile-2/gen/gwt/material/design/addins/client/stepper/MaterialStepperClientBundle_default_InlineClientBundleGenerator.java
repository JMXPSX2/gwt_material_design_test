package gwt.material.design.addins.client.stepper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MaterialStepperClientBundle_default_InlineClientBundleGenerator implements gwt.material.design.addins.client.stepper.MaterialStepperClientBundle {
  private static MaterialStepperClientBundle_default_InlineClientBundleGenerator _instance0 = new MaterialStepperClientBundle_default_InlineClientBundleGenerator();
  private void stepperCssInitializer() {
    stepperCss = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.4.0/gwt-material-addins-2.4.0.jar!/gwt/material/design/addins/client/stepper/resources/css/stepper.min.css
      public String getText() {
        return ".stepper .step{position:relative;min-height:32px;padding:12px;cursor:pointer}.stepper.horizontal .step{min-width:240px}.stepper.horizontal.fixed-step-width .step{min-width:unset}.stepper .step:hover,.stepper.horizontal .step:hover .step-header{background:#f6f6f6}.stepper .step>div:first-child{position:static;height:0}.stepper .step>div:last-child{margin-left:32px;padding-left:16px;min-height:24px}.stepper .step>div:first-child .circle{background:#4285f4;width:32px;height:32px;line-height:32px;border-radius:16px;position:relative;color:#fff;text-align:center}.stepper .line{position:absolute;border-left:2px solid #dcdcdc;left:28px;bottom:0;top:56px;z-index:1}.stepper .step:last-child .line{display:none!important}.stepper .title{line-height:32px;font-weight:500;margin-left:0}.stepper .body{opacity:1;padding:20px}.stepper .description{line-height:1.2;font-size:1em;padding-bottom:24px;color:#989898}.stepper.horizontal{line-height:0;position:relative;min-height:600px}.stepper.horizontal .step{display:inline-block;height:72px;padding-top:20px;position:initial}.stepper.horizontal .step .line,.stepper.horizontal .step .title,.stepper.horizontal .step>div:first-child .circle{display:inline-block}.stepper.horizontal .step .step-header{display:inherit;height:40px;max-width:80%;background:#fff;z-index:1;position:relative;padding-right:20px;box-sizing:border-box;white-space:nowrap;overflow:hidden;text-overflow:ellipsis}.stepper.horizontal .step .line{border-left:0;height:2px;position:inherit;border-top:2px solid #dcdcdc;width:100%;float:right;margin-top:-24px}.stepper.horizontal .step .title{margin-left:8px}.stepper.horizontal .step .description{margin-left:40px;font-size:.8em;margin-top:-8px}.stepper.horizontal .step .body{line-height:initial}.stepper.horizontal .step>div:last-child{position:absolute;width:100%;top:93px;padding-left:0;margin:auto;left:0}.stepper .step.inactive .title{color:#c9c9c9;font-weight:400}.stepper .step.inactive .body{opacity:0;transition:.6s all;-webkit-transition:.6s all;max-height:0;z-index:-1;position:relative;display:none}.stepper .step.active .body{opacity:1;transition-delay:.3s;-webkit-transition-delay:.3s;max-height:1400px;padding-bottom:28px;padding-top:8px;z-index:1!important;display:block!important}.stepper .step.inactive>div:first-child .circle{background-color:#9e9e9e!important}.stepper .step>div:first-child i{font-size:36px;vertical-align:middle}.stepper .step.success .description,.stepper .step.success .title,.stepper .step.success>div:first-child i{color:#2196f3}.stepper .step.error .description,.stepper .step.error .title,.stepper .step.error>div:first-child i{color:#f44336}.stepper .step.error>div:first-child .description,.stepper .step.success>div:first-child .description{margin-left:44px}.stepper .step.error .title,.stepper .step.success .title{font-weight:600}.feedback{position:absolute!important;left:0;font-size:1.1em;top:0;width:100%;height:100%;padding:36px}.feedback .loader-wrapper{background-color:#dfdfdf!important}.stepper.vertical{position:relative}.stepper.vertical .step{width:100%!important}.stepper.vertical .step.active .body{padding-bottom:0;padding-right:20px}";
      }
      public String getName() {
        return "stepperCss";
      }
    }
    ;
  }
  private static class stepperCssInitializer {
    static {
      _instance0.stepperCssInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return stepperCss;
    }
  }
  public com.google.gwt.resources.client.TextResource stepperCss() {
    return stepperCssInitializer.get();
  }
  private void stepperDarkCssInitializer() {
    stepperDarkCss = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.4.0/gwt-material-addins-2.4.0.jar!/gwt/material/design/addins/client/stepper/resources/css/stepper-dark.min.css
      public String getText() {
        return ".stepper.horizontal .step .step-header{background:#292929}.stepper .line{border-left:2px solid #414141}.stepper.horizontal .step .line{border-top:2px solid #414141}.stepper .step:hover,.stepper.horizontal .step:hover .step-header{background:#303030}.stepper .step>div:first-child .circle{background:#bb86fc!important}.stepper .step.success .description,.stepper .step.success .title,.stepper .step.success>div:first-child i{color:#bb86fc!important}.feedback{background:0 0}.feedback .loader-wrapper{background-color:#3b3b3b!important}";
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
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.google.gwt.resources.client.TextResource stepperCss;
  private static com.google.gwt.resources.client.TextResource stepperDarkCss;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      stepperCss(), 
      stepperDarkCss(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("stepperCss", stepperCss());
        resourceMap.put("stepperDarkCss", stepperDarkCss());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'stepperCss': return this.@gwt.material.design.addins.client.stepper.MaterialStepperClientBundle::stepperCss()();
      case 'stepperDarkCss': return this.@gwt.material.design.addins.client.stepper.MaterialStepperClientBundle::stepperDarkCss()();
    }
    return null;
  }-*/;
}
