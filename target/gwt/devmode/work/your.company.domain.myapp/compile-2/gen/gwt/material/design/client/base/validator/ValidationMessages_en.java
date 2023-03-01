package gwt.material.design.client.base.validator;

public class ValidationMessages_en implements gwt.material.design.client.base.validator.ValidationMessages {
  
  public java.lang.String gwt_material_design_validation_Blank_message() {
    return "Field cannot be blank";
  }
  
  public java.lang.String gwt_material_design_validation_DecimalMax_message() {
    return "Value must be less than or equal to {1}";
  }
  
  public java.lang.String gwt_material_design_validation_DecimalMin_message() {
    return "Value must be greater than or equal to {1}";
  }
  
  public java.lang.String gwt_material_design_validation_FieldMatch_message() {
    return "{1} do not match";
  }
  
  public java.lang.String gwt_material_design_validation_Future_message() {
    return "Value must be in the future";
  }
  
  public java.lang.String gwt_material_design_validation_Past_message() {
    return "Value must be in the past";
  }
  
  public java.lang.String gwt_material_design_validation_RegEx_message() {
    return "Must match regex";
  }
  
  public java.lang.String gwt_material_design_validation_Size_message() {
    return "Size must be between {1} and {2}";
  }
  
  public boolean getBoolean(java.lang.String arg0) {
    Boolean target = (Boolean) cache.get(arg0);
    if (target != null) {
      return target.booleanValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "gwt.material.design.client.base.validator.ValidationMessages", arg0);
  }
  
  public double getDouble(java.lang.String arg0) {
    Double target = (Double) cache.get(arg0);
    if (target != null) {
      return target.doubleValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "gwt.material.design.client.base.validator.ValidationMessages", arg0);
  }
  
  public float getFloat(java.lang.String arg0) {
    Float target = (Float) cache.get(arg0);
    if (target != null) {
      return target.floatValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "gwt.material.design.client.base.validator.ValidationMessages", arg0);
  }
  
  public int getInt(java.lang.String arg0) {
    Integer target = (Integer) cache.get(arg0);
    if (target != null) {
      return target.intValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "gwt.material.design.client.base.validator.ValidationMessages", arg0);
  }
  
  public java.util.Map<java.lang.String, java.lang.String> getMap(java.lang.String arg0) {
    java.util.Map<java.lang.String, java.lang.String> target = (java.util.Map<java.lang.String, java.lang.String>) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "gwt.material.design.client.base.validator.ValidationMessages", arg0);
  }
  
  public java.lang.String getString(java.lang.String arg0) {
    java.lang.String target = (java.lang.String) cache.get(arg0);
    if (target != null) {
      return target;
    }
    if (arg0.equals("gwt_material_design_validation_Blank_message")) {
      String answer = gwt_material_design_validation_Blank_message();
      cache.put("gwt_material_design_validation_Blank_message",answer);
      return answer;
    }
    if (arg0.equals("gwt_material_design_validation_DecimalMax_message")) {
      String answer = gwt_material_design_validation_DecimalMax_message();
      cache.put("gwt_material_design_validation_DecimalMax_message",answer);
      return answer;
    }
    if (arg0.equals("gwt_material_design_validation_DecimalMin_message")) {
      String answer = gwt_material_design_validation_DecimalMin_message();
      cache.put("gwt_material_design_validation_DecimalMin_message",answer);
      return answer;
    }
    if (arg0.equals("gwt_material_design_validation_FieldMatch_message")) {
      String answer = gwt_material_design_validation_FieldMatch_message();
      cache.put("gwt_material_design_validation_FieldMatch_message",answer);
      return answer;
    }
    if (arg0.equals("gwt_material_design_validation_Future_message")) {
      String answer = gwt_material_design_validation_Future_message();
      cache.put("gwt_material_design_validation_Future_message",answer);
      return answer;
    }
    if (arg0.equals("gwt_material_design_validation_Past_message")) {
      String answer = gwt_material_design_validation_Past_message();
      cache.put("gwt_material_design_validation_Past_message",answer);
      return answer;
    }
    if (arg0.equals("gwt_material_design_validation_RegEx_message")) {
      String answer = gwt_material_design_validation_RegEx_message();
      cache.put("gwt_material_design_validation_RegEx_message",answer);
      return answer;
    }
    if (arg0.equals("gwt_material_design_validation_Size_message")) {
      String answer = gwt_material_design_validation_Size_message();
      cache.put("gwt_material_design_validation_Size_message",answer);
      return answer;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "gwt.material.design.client.base.validator.ValidationMessages", arg0);
  }
  
  public java.lang.String[] getStringArray(java.lang.String arg0) {
    java.lang.String[] target = (java.lang.String[]) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "gwt.material.design.client.base.validator.ValidationMessages", arg0);
  }
  java.util.Map cache = new java.util.HashMap();
}
