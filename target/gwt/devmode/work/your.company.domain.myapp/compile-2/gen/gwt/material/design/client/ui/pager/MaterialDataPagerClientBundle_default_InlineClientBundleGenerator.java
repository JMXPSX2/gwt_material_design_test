package gwt.material.design.client.ui.pager;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MaterialDataPagerClientBundle_default_InlineClientBundleGenerator implements gwt.material.design.client.ui.pager.MaterialDataPagerClientBundle {
  private static MaterialDataPagerClientBundle_default_InlineClientBundleGenerator _instance0 = new MaterialDataPagerClientBundle_default_InlineClientBundleGenerator();
  private void dataPagerCssInitializer() {
    dataPagerCss = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-table/2.4.0/gwt-material-table-2.4.0.jar!/gwt/material/design/client/ui/pager/resources/css/data-pager.min.css
      public String getText() {
        return ".table-container .data-pager{width:100%;position:relative;color:#9e9e9e!important;font-size:.8em;border-top:1px solid #e9e9e9;margin-bottom:0;padding:4px 4px 8px}.data-pager .num-page-panel .input-field input[type=number]{width:50px;text-align:center;border-bottom:none;font-size:1em;margin-bottom:0;height:2em;margin-top:6px}.data-pager .num-page-panel>span{padding-top:12px;margin-right:8px;display:inline-block}.data-pager .action-page-panel i,.data-pager .action-page-panel>span,.data-pager .rows-per-page-panel>span{float:right;margin-right:8px;margin-top:12px}.data-pager .action-page-panel i{margin-top:4px}.data-pager .action-page-panel i.disabled{background:#fff!important;color:#e9e9e9!important}.data-pager .action-page-panel,.data-pager .num-page-panel,.data-pager .rows-per-page-panel{float:right}.data-pager .rows-per-page-panel{width:200px;margin-right:40px}.data-pager .select-wrapper{float:right;width:44px;max-width:64px;margin-left:32px}.data-pager .select-dropdown{border:none;margin-bottom:0;font-size:1em}.data-pager .input-field.listbox-wrapper{margin-top:0}.data-pager .num-page-panel .input-field{display:inline;text-align:right;margin-top:13px;margin-bottom:-13px}.data-pager .input-field .select-wrapper .caret:before{right:4px;bottom:6px}.data-pager .input-field .select-wrapper input.select-dropdown{height:1.6em;line-height:1.6em;margin-top:12px;margin-bottom:0;font-size:1em}@media only screen and (max-width:520px),(min-device-width:0px) and (max-device-width:519px){.table-container .data-pager{margin-top:-6px;border-top:1px solid #e9e9e9;text-align:center}.table-container .data-pager .action-page-panel{margin-top:0!important}.table-container .data-pager .action-page-panel .arrow-prev{float:left}.table-container .data-pager .action-page-panel span{display:inline-block;float:none}}";
      }
      public String getName() {
        return "dataPagerCss";
      }
    }
    ;
  }
  private static class dataPagerCssInitializer {
    static {
      _instance0.dataPagerCssInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return dataPagerCss;
    }
  }
  public com.google.gwt.resources.client.TextResource dataPagerCss() {
    return dataPagerCssInitializer.get();
  }
  private void dataPagerDebugCssInitializer() {
    dataPagerDebugCss = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-table/2.4.0/gwt-material-table-2.4.0.jar!/gwt/material/design/client/ui/pager/resources/css/data-pager.css
      public String getText() {
        return ".table-container .data-pager {\r\n    width: 100%;\r\n    position: relative;\r\n    color: #9e9e9e !important;\r\n    font-size: 0.8em;\r\n    border-top: 1px solid #e9e9e9;\r\n    margin-bottom: 0;\r\n    padding: 8px 4px;\r\n    padding-top: 4px;\r\n}\r\n\r\n.data-pager .num-page-panel .input-field input[type=number] {\r\n    width: 50px;\r\n    text-align: center;\r\n    border-bottom: none;\r\n    font-size: 1em;\r\n    margin-bottom: 0px;\r\n    height: 2em;\r\n    margin-top: 6px;\r\n}\r\n\r\n.data-pager .num-page-panel > span {\r\n    padding-top: 12px;\r\n    margin-right: 8px;\r\n    display: inline-block;\r\n}\r\n\r\n.data-pager .action-page-panel > span,\r\n.data-pager .rows-per-page-panel > span,\r\n.data-pager .action-page-panel i {\r\n    float: right;\r\n    margin-right: 8px;\r\n    margin-top: 12px;\r\n}\r\n\r\n.data-pager .action-page-panel i {\r\n    margin-top: 4px;\r\n}\r\n\r\n.data-pager .action-page-panel i.disabled {\r\n    background: white !important;\r\n    color: #e9e9e9 !important;\r\n}\r\n\r\n.data-pager .action-page-panel,\r\n.data-pager .num-page-panel,\r\n.data-pager .rows-per-page-panel {\r\n    float: right;\r\n}\r\n\r\n.data-pager .rows-per-page-panel {\r\n    width: 200px;\r\n    margin-right: 40px;\r\n}\r\n\r\n.data-pager .select-wrapper {\r\n    float: right;\r\n    width: 44px;\r\n    max-width: 64px;\r\n    margin-left: 32px;\r\n}\r\n\r\n.data-pager .select-dropdown {\r\n    border: none;\r\n    margin-bottom: 0;\r\n    font-size: 1em;\r\n}\r\n\r\n.data-pager .input-field.listbox-wrapper {\r\n    margin-top: 0px;\r\n}\r\n\r\n.data-pager .num-page-panel .input-field {\r\n    display: inline;\r\n    text-align: right;\r\n    margin-top: 13px;\r\n    margin-bottom: -13px;\r\n}\r\n\r\n.data-pager .input-field .select-wrapper .caret:before {\r\n    right: 4px;\r\n    bottom: 6px\r\n}\r\n\r\n.data-pager .input-field .select-wrapper input.select-dropdown {\r\n    height: 1.6em;\r\n    line-height: 1.6em;\r\n    margin-top: 12px;\r\n    margin-bottom: 0px;\r\n    font-size: 1em;\r\n}\r\n\r\n@media only screen and (max-width: 520px), (min-device-width: 0px) and (max-device-width: 519px) {\r\n    .table-container .data-pager {\r\n        margin-top: -6px;\r\n        border-top: 1px solid #e9e9e9;\r\n        text-align: center;\r\n    }\r\n\r\n    .table-container .data-pager .action-page-panel {\r\n        margin-top: 0px !important;\r\n    }\r\n\r\n    .table-container .data-pager .action-page-panel .arrow-prev {\r\n        float: left;\r\n    }\r\n\r\n    .table-container .data-pager .action-page-panel span {\r\n        display: inline-block;\r\n        float: none;\r\n    }\r\n}";
      }
      public String getName() {
        return "dataPagerDebugCss";
      }
    }
    ;
  }
  private static class dataPagerDebugCssInitializer {
    static {
      _instance0.dataPagerDebugCssInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return dataPagerDebugCss;
    }
  }
  public com.google.gwt.resources.client.TextResource dataPagerDebugCss() {
    return dataPagerDebugCssInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.google.gwt.resources.client.TextResource dataPagerCss;
  private static com.google.gwt.resources.client.TextResource dataPagerDebugCss;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      dataPagerCss(), 
      dataPagerDebugCss(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("dataPagerCss", dataPagerCss());
        resourceMap.put("dataPagerDebugCss", dataPagerDebugCss());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'dataPagerCss': return this.@gwt.material.design.client.ui.pager.MaterialDataPagerClientBundle::dataPagerCss()();
      case 'dataPagerDebugCss': return this.@gwt.material.design.client.ui.pager.MaterialDataPagerClientBundle::dataPagerDebugCss()();
    }
    return null;
  }-*/;
}
