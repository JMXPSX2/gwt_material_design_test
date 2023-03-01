// .ui.xml template last modified: 1677587365127
package your.company.domain.client.application;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class ApplicationView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, your.company.domain.client.application.ApplicationView>, your.company.domain.client.application.ApplicationView.Binder {


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final your.company.domain.client.application.ApplicationView owner) {


    return new Widgets(owner).get_f_MaterialPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final your.company.domain.client.application.ApplicationView owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onAdd((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final your.company.domain.client.application.ApplicationView owner) {
      this.owner = owner;
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private your.company.domain.client.application.ApplicationView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private your.company.domain.client.application.ApplicationView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final your.company.domain.client.application.ApplicationView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (your.company.domain.client.application.ApplicationView_BinderImpl_GenBundle) GWT.create(your.company.domain.client.application.ApplicationView_BinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for f_MaterialPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private gwt.material.design.client.ui.MaterialPanel get_f_MaterialPanel1() {
      return build_f_MaterialPanel1();
    }
    private gwt.material.design.client.ui.MaterialPanel build_f_MaterialPanel1() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialPanel f_MaterialPanel1 = (gwt.material.design.client.ui.MaterialPanel) GWT.create(gwt.material.design.client.ui.MaterialPanel.class);
      // Setup section.
      f_MaterialPanel1.add(get_f_MaterialHeader2());
      f_MaterialPanel1.add(get_f_MaterialSideNavPush8());
      f_MaterialPanel1.add(get_container());
      f_MaterialPanel1.add(get_f_MaterialFAB12());

      return f_MaterialPanel1;
    }

    /**
     * Getter for f_MaterialHeader2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private gwt.material.design.client.ui.MaterialHeader get_f_MaterialHeader2() {
      return build_f_MaterialHeader2();
    }
    private gwt.material.design.client.ui.MaterialHeader build_f_MaterialHeader2() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialHeader f_MaterialHeader2 = (gwt.material.design.client.ui.MaterialHeader) GWT.create(gwt.material.design.client.ui.MaterialHeader.class);
      // Setup section.
      f_MaterialHeader2.add(get_navBar());

      return f_MaterialHeader2;
    }

    /**
     * Getter for navBar called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialNavBar get_navBar() {
      return build_navBar();
    }
    private gwt.material.design.client.ui.MaterialNavBar build_navBar() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialNavBar navBar = (gwt.material.design.client.ui.MaterialNavBar) GWT.create(gwt.material.design.client.ui.MaterialNavBar.class);
      // Setup section.
      navBar.add(get_f_MaterialNavBrand3());
      navBar.add(get_f_MaterialNavSection4());
      navBar.setBackgroundColor(gwt.material.design.client.constants.Color.INDIGO);
      navBar.setActivates("sidenav");

      return navBar;
    }

    /**
     * Getter for f_MaterialNavBrand3 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialNavBrand get_f_MaterialNavBrand3() {
      return build_f_MaterialNavBrand3();
    }
    private gwt.material.design.client.ui.MaterialNavBrand build_f_MaterialNavBrand3() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialNavBrand f_MaterialNavBrand3 = (gwt.material.design.client.ui.MaterialNavBrand) GWT.create(gwt.material.design.client.ui.MaterialNavBrand.class);
      // Setup section.
      f_MaterialNavBrand3.setFontSize("1.2em");
      f_MaterialNavBrand3.setText("GmdTest");

      return f_MaterialNavBrand3;
    }

    /**
     * Getter for f_MaterialNavSection4 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialNavSection get_f_MaterialNavSection4() {
      return build_f_MaterialNavSection4();
    }
    private gwt.material.design.client.ui.MaterialNavSection build_f_MaterialNavSection4() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialNavSection f_MaterialNavSection4 = (gwt.material.design.client.ui.MaterialNavSection) GWT.create(gwt.material.design.client.ui.MaterialNavSection.class);
      // Setup section.
      f_MaterialNavSection4.add(get_f_MaterialDarkModeToggle5());
      f_MaterialNavSection4.add(get_f_MaterialLink6());
      f_MaterialNavSection4.add(get_f_MaterialLink7());
      f_MaterialNavSection4.setFloat(com.google.gwt.dom.client.Style.Float.RIGHT);
      f_MaterialNavSection4.setHideOn(gwt.material.design.client.constants.HideOn.NONE);

      return f_MaterialNavSection4;
    }

    /**
     * Getter for f_MaterialDarkModeToggle5 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialDarkModeToggle get_f_MaterialDarkModeToggle5() {
      return build_f_MaterialDarkModeToggle5();
    }
    private gwt.material.design.client.ui.MaterialDarkModeToggle build_f_MaterialDarkModeToggle5() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialDarkModeToggle f_MaterialDarkModeToggle5 = (gwt.material.design.client.ui.MaterialDarkModeToggle) GWT.create(gwt.material.design.client.ui.MaterialDarkModeToggle.class);
      // Setup section.

      return f_MaterialDarkModeToggle5;
    }

    /**
     * Getter for f_MaterialLink6 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink6() {
      return build_f_MaterialLink6();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink6() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink6 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink6.setText("Link 1");

      return f_MaterialLink6;
    }

    /**
     * Getter for f_MaterialLink7 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink7() {
      return build_f_MaterialLink7();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink7() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink7 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink7.setIconType(gwt.material.design.client.constants.IconType.POLYMER);

      return f_MaterialLink7;
    }

    /**
     * Getter for f_MaterialSideNavPush8 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private gwt.material.design.client.ui.MaterialSideNavPush get_f_MaterialSideNavPush8() {
      return build_f_MaterialSideNavPush8();
    }
    private gwt.material.design.client.ui.MaterialSideNavPush build_f_MaterialSideNavPush8() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialSideNavPush f_MaterialSideNavPush8 = (gwt.material.design.client.ui.MaterialSideNavPush) GWT.create(gwt.material.design.client.ui.MaterialSideNavPush.class);
      // Setup section.
      f_MaterialSideNavPush8.add(get_f_MaterialLink9());
      f_MaterialSideNavPush8.add(get_f_MaterialLink10());
      f_MaterialSideNavPush8.add(get_f_MaterialLink11());
      f_MaterialSideNavPush8.setWidth("280");
      f_MaterialSideNavPush8.setId("sidenav");

      return f_MaterialSideNavPush8;
    }

    /**
     * Getter for f_MaterialLink9 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink9() {
      return build_f_MaterialLink9();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink9() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink9 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink9.setText("Home");
      f_MaterialLink9.setHref("#");

      return f_MaterialLink9;
    }

    /**
     * Getter for f_MaterialLink10 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink10() {
      return build_f_MaterialLink10();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink10() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink10 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink10.setText("Settings");
      f_MaterialLink10.setHref("#profile");

      return f_MaterialLink10;
    }

    /**
     * Getter for f_MaterialLink11 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialLink get_f_MaterialLink11() {
      return build_f_MaterialLink11();
    }
    private gwt.material.design.client.ui.MaterialLink build_f_MaterialLink11() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLink f_MaterialLink11 = (gwt.material.design.client.ui.MaterialLink) GWT.create(gwt.material.design.client.ui.MaterialLink.class);
      // Setup section.
      f_MaterialLink11.setText("Test");
      f_MaterialLink11.setHref("#");

      return f_MaterialLink11;
    }

    /**
     * Getter for container called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private gwt.material.design.client.ui.MaterialContainer get_container() {
      return build_container();
    }
    private gwt.material.design.client.ui.MaterialContainer build_container() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialContainer container = (gwt.material.design.client.ui.MaterialContainer) GWT.create(gwt.material.design.client.ui.MaterialContainer.class);
      // Setup section.

      this.owner.container = container;

      return container;
    }

    /**
     * Getter for f_MaterialFAB12 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private gwt.material.design.client.ui.MaterialFAB get_f_MaterialFAB12() {
      return build_f_MaterialFAB12();
    }
    private gwt.material.design.client.ui.MaterialFAB build_f_MaterialFAB12() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialFAB f_MaterialFAB12 = (gwt.material.design.client.ui.MaterialFAB) GWT.create(gwt.material.design.client.ui.MaterialFAB.class);
      // Setup section.
      f_MaterialFAB12.add(get_btnAdd());

      return f_MaterialFAB12;
    }

    /**
     * Getter for btnAdd called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialButton get_btnAdd() {
      return build_btnAdd();
    }
    private gwt.material.design.client.ui.MaterialButton build_btnAdd() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialButton btnAdd = (gwt.material.design.client.ui.MaterialButton) GWT.create(gwt.material.design.client.ui.MaterialButton.class);
      // Setup section.
      btnAdd.setBackgroundColor(gwt.material.design.client.constants.Color.PINK);
      btnAdd.setSize(gwt.material.design.client.constants.ButtonSize.LARGE);
      btnAdd.setIconType(gwt.material.design.client.constants.IconType.ADD);
      btnAdd.setType(gwt.material.design.client.constants.ButtonType.FLOATING);
      btnAdd.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

      this.owner.btnAdd = btnAdd;

      return btnAdd;
    }
  }
}
