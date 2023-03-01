package gwt.material.design.addins.client.autocomplete;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MaterialAutocompleteDebugClientBundle_default_InlineClientBundleGenerator implements gwt.material.design.addins.client.autocomplete.MaterialAutocompleteDebugClientBundle {
  private static MaterialAutocompleteDebugClientBundle_default_InlineClientBundleGenerator _instance0 = new MaterialAutocompleteDebugClientBundle_default_InlineClientBundleGenerator();
  private void autocompleteCssDebugInitializer() {
    autocompleteCssDebug = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.4.0/gwt-material-addins-2.4.0.jar!/gwt/material/design/addins/client/autocomplete/resources/css/autocomplete.css
      public String getText() {
        return ".autocomplete.disabled .chip i, .suggestPopupBottom, .suggestPopupMiddleLeft, .suggestPopupMiddleRight, .suggestPopupTop {\r\n    display: none\r\n}\r\n\r\nul.multiValueSuggestBox-list {\r\n    overflow: hidden;\r\n    height: auto !important;\r\n    height: 1%;\r\n    cursor: text;\r\n    min-height: 1px;\r\n    z-index: 999;\r\n    margin: 0 0 8px;\r\n    padding: 0;\r\n    border: none;\r\n    width: 100%;\r\n    list-style-type: none;\r\n    border-bottom: 1px solid #9e9e9e\r\n}\r\n\r\n\r\n.autocomplete.disabled ul.multiValueSuggestBox-list {\r\n    border-bottom: 1px dotted rgba(0, 0, 0, .26)\r\n}\r\n\r\n\r\n.autocomplete-text .multiValueSuggestBox-input-token, .autocomplete-text .multiValueSuggestBox-input-token input {\r\n    width: 100% !important\r\n}\r\n\r\n.autocomplete.read-only ul.multiValueSuggestBox-list {\r\n    border: none !important\r\n}\r\n\r\n.autocomplete.disabled .chip {\r\n    color: rgba(0, 0, 0, .6) !important;\r\n    background-color: #e4e4e4 !important\r\n}\r\n\r\n.gwt-SuggestBoxPopup .item {\r\n    padding-left: 20px !important;\r\n    padding: 12px\r\n}\r\n\r\n.gwt-SuggestBoxPopup .item img {\r\n    border-radius: 12px;\r\n    float: left;\r\n    height: 24px;\r\n    width: 24px;\r\n    margin-right: 12px\r\n}\r\n\r\n.gwt-SuggestBoxPopup {\r\n    z-index: 9999;\r\n    min-width: 300px !important;\r\n    background: #fff;\r\n    border-radius: 2px;\r\n    -webkit-box-shadow: 0 2px 5px 0 rgba(0, 0, 0, .16), 0 2px 10px 0 rgba(0, 0, 0, .12);\r\n    -moz-box-shadow: 0 2px 5px 0 rgba(0, 0, 0, .16), 0 2px 10px 0 rgba(0, 0, 0, .12);\r\n    box-shadow: 0 2px 5px 0 rgba(0, 0, 0, .16), 0 2px 10px 0 rgba(0, 0, 0, .12)\r\n}\r\n\r\n.gwt-SuggestBoxPopup tr {\r\n    white-space: nowrap\r\n}\r\n\r\n.gwt-SuggestBoxPopup .item-selected {\r\n    background: rgba(0, 0, 0, .03) !important\r\n}\r\n\r\n.suggestPopupMiddleCenter {\r\n    width: 100%;\r\n    padding: 0 !important\r\n}\r\n\r\n.suggestPopupMiddle {\r\n    width: 100%;\r\n    left: 0 !important\r\n}\r\n\r\nul.multiValueSuggestBox-list li:first-child {\r\n    margin-left: 0px;\r\n}\r\n\r\nul.multiValueSuggestBox-list li input {\r\n    width: 200px;\r\n    background-color: transparent;\r\n    margin: 0;\r\n    border: none !important\r\n}\r\n\r\nul.multiValueSuggestBox-list input[type=text]:focus:not([readonly]) {\r\n    border: none !important;\r\n    box-shadow: 0 1px 0 0 #fff !important\r\n}\r\n\r\nli.multiValueSuggestBox-token {\r\n    cursor: default;\r\n    float: left;\r\n    margin: 8px 0 0 8px\r\n}\r\n\r\nli.multiValueSuggestBox-input-token {\r\n    float: left\r\n}\r\n\r\n.row .autocomplete label {\r\n    left: .75rem !important\r\n}\r\n\r\n.input-field.autocomplete .multiValueSuggestBox-list.field-error input::placeholder {\r\n    color: #f44336 !important\r\n}\r\n\r\n.input-field.autocomplete .multiValueSuggestBox-list.field-success input::placeholder {\r\n    color: #4caf50 !important\r\n}\r\n\r\n.input-field.autocomplete.filled input {\r\n    background: inherit;\r\n    border-radius: inherit;\r\n    padding-top: inherit\r\n}\r\n\r\n.input-field.autocomplete.filled .multiValueSuggestBox-list {\r\n    background: rgba(0, 0, 0, .04);\r\n    border-radius: 4px 4px 0 0;\r\n    padding-top: 18px\r\n}";
      }
      public String getName() {
        return "autocompleteCssDebug";
      }
    }
    ;
  }
  private static class autocompleteCssDebugInitializer {
    static {
      _instance0.autocompleteCssDebugInitializer();
    }
    static com.google.gwt.resources.client.TextResource get() {
      return autocompleteCssDebug;
    }
  }
  public com.google.gwt.resources.client.TextResource autocompleteCssDebug() {
    return autocompleteCssDebugInitializer.get();
  }
  private void autocompleteDarkCssInitializer() {
    autocompleteDarkCss = new com.google.gwt.resources.client.TextResource() {
      // jar:file:/Users/jmxpsx/.m2/repository/com/github/gwtmaterialdesign/gwt-material-addins/2.4.0/gwt-material-addins-2.4.0.jar!/gwt/material/design/addins/client/autocomplete/resources/css/autocomplete-dark.css
      public String getText() {
        return ".gwt-SuggestBoxPopup {\r\n    background: #2f2f2f;\r\n}\r\n\r\n.gwt-SuggestBoxPopup .suggestPopupContent table tr td:hover {\r\n    background-color: #353535 !important;\r\n}\r\n\r\nul.multiValueSuggestBox-list input[type=text]:focus:not([readonly]) {\r\n    border: none !important;\r\n    box-shadow: none !important;\r\n}";
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
  private static com.google.gwt.resources.client.TextResource autocompleteCssDebug;
  private static com.google.gwt.resources.client.TextResource autocompleteDarkCss;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      autocompleteCssDebug(), 
      autocompleteDarkCss(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("autocompleteCssDebug", autocompleteCssDebug());
        resourceMap.put("autocompleteDarkCss", autocompleteDarkCss());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'autocompleteCssDebug': return this.@gwt.material.design.addins.client.autocomplete.MaterialAutocompleteDebugClientBundle::autocompleteCssDebug()();
      case 'autocompleteDarkCss': return this.@gwt.material.design.addins.client.autocomplete.MaterialAutocompleteDebugClientBundle::autocompleteDarkCss()();
    }
    return null;
  }-*/;
}
