package your.company.domain.client.application.profile;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$your$company$domain$client$application$profile$ProfilePresenter$MyProxy$_annotation$$none$$(your.company.domain.client.application.profile.ProfilePresenter.MyProxy injectee) {
    
  }
  
  public void memberInject_Key$type$your$company$domain$client$application$profile$ProfilePresenter$_annotation$$none$$(your.company.domain.client.application.profile.ProfilePresenter injectee) {
    injector.getFragment_com_gwtplatform_mvp_client().com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection__(injectee, injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  public void memberInject_Key$type$your$company$domain$client$application$profile$ProfileView$Binder$_annotation$$none$$(your.company.domain.client.application.profile.ProfileView.Binder injectee) {
    
  }
  
  public void memberInject_Key$type$your$company$domain$client$application$profile$ProfileView$_annotation$$none$$(your.company.domain.client.application.profile.ProfileView injectee) {
    
  }
  
  
  /**
   * Binding for your.company.domain.client.application.profile.ProfilePresenter$MyView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:122)
   */
  public your.company.domain.client.application.profile.ProfilePresenter.MyView get_Key$type$your$company$domain$client$application$profile$ProfilePresenter$MyView$_annotation$$none$$() {
    your.company.domain.client.application.profile.ProfilePresenter.MyView result = get_Key$type$your$company$domain$client$application$profile$ProfileView$_annotation$$none$$();
    return result;
    
  }
  
  private your.company.domain.client.application.profile.ProfilePresenter.MyProxy singleton_Key$type$your$company$domain$client$application$profile$ProfilePresenter$MyProxy$_annotation$$none$$ = null;
  
  public your.company.domain.client.application.profile.ProfilePresenter.MyProxy get_Key$type$your$company$domain$client$application$profile$ProfilePresenter$MyProxy$_annotation$$none$$() {
    
    if (singleton_Key$type$your$company$domain$client$application$profile$ProfilePresenter$MyProxy$_annotation$$none$$ == null) {
    Object created = GWT.create(your.company.domain.client.application.profile.ProfilePresenter.MyProxy.class);
    assert created instanceof your.company.domain.client.application.profile.ProfilePresenter.MyProxy;
    your.company.domain.client.application.profile.ProfilePresenter.MyProxy result = (your.company.domain.client.application.profile.ProfilePresenter.MyProxy) created;
    
    memberInject_Key$type$your$company$domain$client$application$profile$ProfilePresenter$MyProxy$_annotation$$none$$(result);
    
        singleton_Key$type$your$company$domain$client$application$profile$ProfilePresenter$MyProxy$_annotation$$none$$ = result;
    }
    return singleton_Key$type$your$company$domain$client$application$profile$ProfilePresenter$MyProxy$_annotation$$none$$;
    
  }
  
  private your.company.domain.client.application.profile.ProfilePresenter singleton_Key$type$your$company$domain$client$application$profile$ProfilePresenter$_annotation$$none$$ = null;
  
  public your.company.domain.client.application.profile.ProfilePresenter get_Key$type$your$company$domain$client$application$profile$ProfilePresenter$_annotation$$none$$() {
    
    if (singleton_Key$type$your$company$domain$client$application$profile$ProfilePresenter$_annotation$$none$$ == null) {
    your.company.domain.client.application.profile.ProfilePresenter result = your$company$domain$client$application$profile$ProfilePresenter_your$company$domain$client$application$profile$ProfilePresenter_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$your$company$domain$client$application$profile$ProfilePresenter$MyView$_annotation$$none$$(), get_Key$type$your$company$domain$client$application$profile$ProfilePresenter$MyProxy$_annotation$$none$$());
    memberInject_Key$type$your$company$domain$client$application$profile$ProfilePresenter$_annotation$$none$$(result);
    
        singleton_Key$type$your$company$domain$client$application$profile$ProfilePresenter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$your$company$domain$client$application$profile$ProfilePresenter$_annotation$$none$$;
    
  }
  
  public your.company.domain.client.application.profile.ProfilePresenter your$company$domain$client$application$profile$ProfilePresenter_your$company$domain$client$application$profile$ProfilePresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, your.company.domain.client.application.profile.ProfilePresenter.MyView _1, your.company.domain.client.application.profile.ProfilePresenter.MyProxy _2) {
    return new your.company.domain.client.application.profile.ProfilePresenter(_0, _1, _2);
  }
  
  
  /**
   * Binding for com.google.inject.Provider<your.company.domain.client.application.profile.ProfilePresenter> declared at:
   *   Implicit provider for com.google.inject.Provider<your.company.domain.client.application.profile.ProfilePresenter>
   */
  public com.google.inject.Provider<your.company.domain.client.application.profile.ProfilePresenter> get_Key$type$com$google$inject$Provider$your$company$domain$client$application$profile$ProfilePresenter$$_annotation$$none$$() {
    com.google.inject.Provider<your.company.domain.client.application.profile.ProfilePresenter> result = new com.google.inject.Provider<your.company.domain.client.application.profile.ProfilePresenter>() { 
      public your.company.domain.client.application.profile.ProfilePresenter get() { 
        return get_Key$type$your$company$domain$client$application$profile$ProfilePresenter$_annotation$$none$$();
      }
    };
    return result;
    
  }
  
  
  /**
   * Binding for your.company.domain.client.application.profile.ProfileView$Binder declared at:
   *   Implicit GWT.create binding for your.company.domain.client.application.profile.ProfileView$Binder
   */
  public your.company.domain.client.application.profile.ProfileView.Binder get_Key$type$your$company$domain$client$application$profile$ProfileView$Binder$_annotation$$none$$() {
    Object created = GWT.create(your.company.domain.client.application.profile.ProfileView.Binder.class);
    assert created instanceof your.company.domain.client.application.profile.ProfileView.Binder;
    your.company.domain.client.application.profile.ProfileView.Binder result = (your.company.domain.client.application.profile.ProfileView.Binder) created;
    
    memberInject_Key$type$your$company$domain$client$application$profile$ProfileView$Binder$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private your.company.domain.client.application.profile.ProfileView singleton_Key$type$your$company$domain$client$application$profile$ProfileView$_annotation$$none$$ = null;
  
  public your.company.domain.client.application.profile.ProfileView get_Key$type$your$company$domain$client$application$profile$ProfileView$_annotation$$none$$() {
    
    if (singleton_Key$type$your$company$domain$client$application$profile$ProfileView$_annotation$$none$$ == null) {
    your.company.domain.client.application.profile.ProfileView result = your$company$domain$client$application$profile$ProfileView_your$company$domain$client$application$profile$ProfileView_methodInjection(get_Key$type$your$company$domain$client$application$profile$ProfileView$Binder$_annotation$$none$$());
    memberInject_Key$type$your$company$domain$client$application$profile$ProfileView$_annotation$$none$$(result);
    
        singleton_Key$type$your$company$domain$client$application$profile$ProfileView$_annotation$$none$$ = result;
    }
    return singleton_Key$type$your$company$domain$client$application$profile$ProfileView$_annotation$$none$$;
    
  }
  
  public your.company.domain.client.application.profile.ProfileView your$company$domain$client$application$profile$ProfileView_your$company$domain$client$application$profile$ProfileView_methodInjection(your.company.domain.client.application.profile.ProfileView.Binder _0) {
    return new your.company.domain.client.application.profile.ProfileView(_0);
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector injector;
  public com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment(com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector injector) {
    this.injector = injector;
  }
  
  public void initializeEagerSingletons() {
    // Eager singleton bound at:
    //   Implicit GWT.create binding for your.company.domain.client.application.profile.ProfilePresenter$MyProxy
    get_Key$type$your$company$domain$client$application$profile$ProfilePresenter$MyProxy$_annotation$$none$$();
    
  }
  
}
