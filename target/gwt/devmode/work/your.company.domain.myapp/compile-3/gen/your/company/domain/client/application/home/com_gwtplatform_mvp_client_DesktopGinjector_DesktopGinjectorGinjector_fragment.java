package your.company.domain.client.application.home;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$your$company$domain$client$application$home$HomePresenter$MyProxy$_annotation$$none$$(your.company.domain.client.application.home.HomePresenter.MyProxy injectee) {
    
  }
  
  public void memberInject_Key$type$your$company$domain$client$application$home$HomePresenter$_annotation$$none$$(your.company.domain.client.application.home.HomePresenter injectee) {
    injector.getFragment_com_gwtplatform_mvp_client().com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection_(injectee, injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  public void memberInject_Key$type$your$company$domain$client$application$home$HomeView$Binder$_annotation$$none$$(your.company.domain.client.application.home.HomeView.Binder injectee) {
    
  }
  
  public void memberInject_Key$type$your$company$domain$client$application$home$HomeView$_annotation$$none$$(your.company.domain.client.application.home.HomeView injectee) {
    
  }
  
  
  /**
   * Binding for your.company.domain.client.application.home.HomePresenter$MyView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:122)
   */
  public your.company.domain.client.application.home.HomePresenter.MyView get_Key$type$your$company$domain$client$application$home$HomePresenter$MyView$_annotation$$none$$() {
    your.company.domain.client.application.home.HomePresenter.MyView result = get_Key$type$your$company$domain$client$application$home$HomeView$_annotation$$none$$();
    return result;
    
  }
  
  private your.company.domain.client.application.home.HomePresenter.MyProxy singleton_Key$type$your$company$domain$client$application$home$HomePresenter$MyProxy$_annotation$$none$$ = null;
  
  public your.company.domain.client.application.home.HomePresenter.MyProxy get_Key$type$your$company$domain$client$application$home$HomePresenter$MyProxy$_annotation$$none$$() {
    
    if (singleton_Key$type$your$company$domain$client$application$home$HomePresenter$MyProxy$_annotation$$none$$ == null) {
    Object created = GWT.create(your.company.domain.client.application.home.HomePresenter.MyProxy.class);
    assert created instanceof your.company.domain.client.application.home.HomePresenter.MyProxy;
    your.company.domain.client.application.home.HomePresenter.MyProxy result = (your.company.domain.client.application.home.HomePresenter.MyProxy) created;
    
    memberInject_Key$type$your$company$domain$client$application$home$HomePresenter$MyProxy$_annotation$$none$$(result);
    
        singleton_Key$type$your$company$domain$client$application$home$HomePresenter$MyProxy$_annotation$$none$$ = result;
    }
    return singleton_Key$type$your$company$domain$client$application$home$HomePresenter$MyProxy$_annotation$$none$$;
    
  }
  
  private your.company.domain.client.application.home.HomePresenter singleton_Key$type$your$company$domain$client$application$home$HomePresenter$_annotation$$none$$ = null;
  
  public your.company.domain.client.application.home.HomePresenter get_Key$type$your$company$domain$client$application$home$HomePresenter$_annotation$$none$$() {
    
    if (singleton_Key$type$your$company$domain$client$application$home$HomePresenter$_annotation$$none$$ == null) {
    your.company.domain.client.application.home.HomePresenter result = your$company$domain$client$application$home$HomePresenter_your$company$domain$client$application$home$HomePresenter_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$your$company$domain$client$application$home$HomePresenter$MyView$_annotation$$none$$(), get_Key$type$your$company$domain$client$application$home$HomePresenter$MyProxy$_annotation$$none$$());
    memberInject_Key$type$your$company$domain$client$application$home$HomePresenter$_annotation$$none$$(result);
    
        singleton_Key$type$your$company$domain$client$application$home$HomePresenter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$your$company$domain$client$application$home$HomePresenter$_annotation$$none$$;
    
  }
  
  public your.company.domain.client.application.home.HomePresenter your$company$domain$client$application$home$HomePresenter_your$company$domain$client$application$home$HomePresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, your.company.domain.client.application.home.HomePresenter.MyView _1, your.company.domain.client.application.home.HomePresenter.MyProxy _2) {
    return new your.company.domain.client.application.home.HomePresenter(_0, _1, _2);
  }
  
  
  /**
   * Binding for com.google.inject.Provider<your.company.domain.client.application.home.HomePresenter> declared at:
   *   Implicit provider for com.google.inject.Provider<your.company.domain.client.application.home.HomePresenter>
   */
  public com.google.inject.Provider<your.company.domain.client.application.home.HomePresenter> get_Key$type$com$google$inject$Provider$your$company$domain$client$application$home$HomePresenter$$_annotation$$none$$() {
    com.google.inject.Provider<your.company.domain.client.application.home.HomePresenter> result = new com.google.inject.Provider<your.company.domain.client.application.home.HomePresenter>() { 
      public your.company.domain.client.application.home.HomePresenter get() { 
        return get_Key$type$your$company$domain$client$application$home$HomePresenter$_annotation$$none$$();
      }
    };
    return result;
    
  }
  
  
  /**
   * Binding for your.company.domain.client.application.home.HomeView$Binder declared at:
   *   Implicit GWT.create binding for your.company.domain.client.application.home.HomeView$Binder
   */
  public your.company.domain.client.application.home.HomeView.Binder get_Key$type$your$company$domain$client$application$home$HomeView$Binder$_annotation$$none$$() {
    Object created = GWT.create(your.company.domain.client.application.home.HomeView.Binder.class);
    assert created instanceof your.company.domain.client.application.home.HomeView.Binder;
    your.company.domain.client.application.home.HomeView.Binder result = (your.company.domain.client.application.home.HomeView.Binder) created;
    
    memberInject_Key$type$your$company$domain$client$application$home$HomeView$Binder$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private your.company.domain.client.application.home.HomeView singleton_Key$type$your$company$domain$client$application$home$HomeView$_annotation$$none$$ = null;
  
  public your.company.domain.client.application.home.HomeView get_Key$type$your$company$domain$client$application$home$HomeView$_annotation$$none$$() {
    
    if (singleton_Key$type$your$company$domain$client$application$home$HomeView$_annotation$$none$$ == null) {
    your.company.domain.client.application.home.HomeView result = your$company$domain$client$application$home$HomeView_your$company$domain$client$application$home$HomeView_methodInjection(get_Key$type$your$company$domain$client$application$home$HomeView$Binder$_annotation$$none$$());
    memberInject_Key$type$your$company$domain$client$application$home$HomeView$_annotation$$none$$(result);
    
        singleton_Key$type$your$company$domain$client$application$home$HomeView$_annotation$$none$$ = result;
    }
    return singleton_Key$type$your$company$domain$client$application$home$HomeView$_annotation$$none$$;
    
  }
  
  public your.company.domain.client.application.home.HomeView your$company$domain$client$application$home$HomeView_your$company$domain$client$application$home$HomeView_methodInjection(your.company.domain.client.application.home.HomeView.Binder _0) {
    return new your.company.domain.client.application.home.HomeView(_0);
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
    //   Implicit GWT.create binding for your.company.domain.client.application.home.HomePresenter$MyProxy
    get_Key$type$your$company$domain$client$application$home$HomePresenter$MyProxy$_annotation$$none$$();
    
  }
  
}
