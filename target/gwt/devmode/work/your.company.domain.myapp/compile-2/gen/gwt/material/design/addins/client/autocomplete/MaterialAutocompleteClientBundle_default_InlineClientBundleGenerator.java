package gwt.material.design.addins.client.autocomplete;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MaterialAutocompleteClientBundle_default_InlineClientBundleGenerator implements gwt.material.design.addins.client.autocomplete.MaterialAutocompleteClientBundle {
  private static MaterialAutocompleteClientBundle_default_InlineClientBundleGenerator _instance0 = new MaterialAutocompleteClientBundle_default_InlineClientBundleGenerator();
  private void autocompleteCssInitializer() {
    autocompleteCss = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.4.0/gwt-material-addins-2.4.0.jar!/gwt/material/design/addins/client/autocomplete/resources/css/autocomplete.min.css
      public String getText() {
        return ".autocomplete.disabled .chip i,.suggestPopupBottom,.suggestPopupMiddleLeft,.suggestPopupMiddleRight,.suggestPopupTop{display:none}ul.multiValueSuggestBox-list{overflow:hidden;height:auto!important;height:1%;cursor:text;min-height:1px;z-index:999;margin:0 0 8px;padding:0;border:none;width:100%;list-style-type:none;border-bottom:1px solid #9e9e9e}.autocomplete.disabled ul.multiValueSuggestBox-list{border-bottom:1px dotted rgba(0,0,0,.26)}.autocomplete-text .multiValueSuggestBox-input-token,.autocomplete-text .multiValueSuggestBox-input-token input{width:100%!important}.autocomplete.read-only ul.multiValueSuggestBox-list{border:none!important}.autocomplete.disabled .chip{color:rgba(0,0,0,.6)!important;background-color:#e4e4e4!important}.gwt-SuggestBoxPopup .item{padding-left:20px!important;padding:12px}.gwt-SuggestBoxPopup .item img{border-radius:12px;float:left;height:24px;width:24px;margin-right:12px}.gwt-SuggestBoxPopup{z-index:9999;min-width:300px!important;background:#fff;border-radius:2px;-webkit-box-shadow:0 2px 5px 0 rgba(0,0,0,.16),0 2px 10px 0 rgba(0,0,0,.12);-moz-box-shadow:0 2px 5px 0 rgba(0,0,0,.16),0 2px 10px 0 rgba(0,0,0,.12);box-shadow:0 2px 5px 0 rgba(0,0,0,.16),0 2px 10px 0 rgba(0,0,0,.12)}.gwt-SuggestBoxPopup tr{white-space:nowrap}.gwt-SuggestBoxPopup .item-selected{background:rgba(0,0,0,.03)!important}.suggestPopupMiddleCenter{width:100%;padding:0!important}.suggestPopupMiddle{width:100%;left:0!important}ul.multiValueSuggestBox-list li:first-child{margin-left:0}ul.multiValueSuggestBox-list li input{width:200px;background-color:transparent;margin:0;border:none!important}ul.multiValueSuggestBox-list input[type=text]:focus:not([readonly]){border:none!important;box-shadow:0 1px 0 0 #fff!important}li.multiValueSuggestBox-token{cursor:default;float:left;margin:8px 0 0 8px}li.multiValueSuggestBox-input-token{float:left}.row .autocomplete label{left:.75rem!important}.input-field.autocomplete .multiValueSuggestBox-list.field-error input::placeholder{color:#f44336!important}.input-field.autocomplete .multiValueSuggestBox-list.field-success input::placeholder{color:#4caf50!important}.input-field.autocomplete.filled input{background:inherit;border-radius:inherit;padding-top:inherit}.input-field.autocomplete.filled .multiValueSuggestBox-list{background:rgba(0,0,0,.04);border-radius:4px 4px 0 0;padding-top:18px}";
      }
      public String getName() {
        return "autocompleteCss";
      }
    }
    ;
  }
  private static class autocompleteCssInitializer {
    static {
      _instance0.autocompleteCssInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return autocompleteCss;
    }
  }
  public com.google.gwt.resources.client.TextResource autocompleteCss() {
    return autocompleteCssInitializer.get();
  }
  private void autocompleteDarkCssInitializer() {
    autocompleteDarkCss = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.4.0/gwt-material-addins-2.4.0.jar!/gwt/material/design/addins/client/autocomplete/resources/css/autocomplete-dark.min.css
      public String getText() {
        return ".gwt-SuggestBoxPopup{background:#2f2f2f}.gwt-SuggestBoxPopup .suggestPopupContent table tr td:hover{background-color:#353535!important}ul.multiValueSuggestBox-list input[type=text]:focus:not([readonly]){border:none!important;box-shadow:none!important}";
      }
      public String getName() {
        return "autocompleteDarkCss";
      }
    }
    ;
  }
  private static class autocompleteDarkCssInitializer {
    static {
      _instance0.autocompleteDarkCssInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return autocompleteDarkCss;
    }
  }
  public com.google.gwt.resources.client.TextResource autocompleteDarkCss() {
    return autocompleteDarkCssInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.google.gwt.resources.client.TextResource autocompleteCss;
  private static com.google.gwt.resources.client.TextResource autocompleteDarkCss;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      autocompleteCss(), 
      autocompleteDarkCss(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("autocompleteCss", autocompleteCss());
        resourceMap.put("autocompleteDarkCss", autocompleteDarkCss());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'autocompleteCss': return this.@gwt.material.design.addins.client.autocomplete.MaterialAutocompleteClientBundle::autocompleteCss()();
      case 'autocompleteDarkCss': return this.@gwt.material.design.addins.client.autocomplete.MaterialAutocompleteClientBundle::autocompleteDarkCss()();
    }
    return null;
  }-*/;
}
