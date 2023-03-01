// .ui.xml template last modified: 1676960779626
package your.company.domain.client.application.profile;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class ProfileView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, your.company.domain.client.application.profile.ProfileView>, your.company.domain.client.application.profile.ProfileView.Binder {


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final your.company.domain.client.application.profile.ProfileView owner) {


    return new Widgets(owner).get_f_MaterialPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final your.company.domain.client.application.profile.ProfileView owner;


    public Widgets(final your.company.domain.client.application.profile.ProfileView owner) {
      this.owner = owner;
    }


    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private your.company.domain.client.application.profile.ProfileView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private your.company.domain.client.application.profile.ProfileView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final your.company.domain.client.application.profile.ProfileView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (your.company.domain.client.application.profile.ProfileView_BinderImpl_GenBundle) GWT.create(your.company.domain.client.application.profile.ProfileView_BinderImpl_GenBundle.class);
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
      f_MaterialPanel1.add(get_f_MaterialPanel2());

      return f_MaterialPanel1;
    }

    /**
     * Getter for f_MaterialPanel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private gwt.material.design.client.ui.MaterialPanel get_f_MaterialPanel2() {
      return build_f_MaterialPanel2();
    }
    private gwt.material.design.client.ui.MaterialPanel build_f_MaterialPanel2() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialPanel f_MaterialPanel2 = (gwt.material.design.client.ui.MaterialPanel) GWT.create(gwt.material.design.client.ui.MaterialPanel.class);
      // Setup section.
      f_MaterialPanel2.add(get_f_MaterialPanel3());
      f_MaterialPanel2.addStyleName("valign-wrapper");
      f_MaterialPanel2.setTextAlign(gwt.material.design.client.constants.TextAlign.CENTER);
      f_MaterialPanel2.setHeight("100vh");

      return f_MaterialPanel2;
    }

    /**
     * Getter for f_MaterialPanel3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private gwt.material.design.client.ui.MaterialPanel get_f_MaterialPanel3() {
      return build_f_MaterialPanel3();
    }
    private gwt.material.design.client.ui.MaterialPanel build_f_MaterialPanel3() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialPanel f_MaterialPanel3 = (gwt.material.design.client.ui.MaterialPanel) GWT.create(gwt.material.design.client.ui.MaterialPanel.class);
      // Setup section.
      f_MaterialPanel3.add(get_f_MaterialImage4());
      f_MaterialPanel3.add(get_f_MaterialLabel5());
      f_MaterialPanel3.add(get_f_MaterialLabel6());
      f_MaterialPanel3.setStyle("margin: auto");

      return f_MaterialPanel3;
    }

    /**
     * Getter for f_MaterialImage4 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialImage get_f_MaterialImage4() {
      return build_f_MaterialImage4();
    }
    private gwt.material.design.client.ui.MaterialImage build_f_MaterialImage4() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialImage f_MaterialImage4 = (gwt.material.design.client.ui.MaterialImage) GWT.create(gwt.material.design.client.ui.MaterialImage.class);
      // Setup section.
      f_MaterialImage4.setAlt("logo");
      f_MaterialImage4.setUrl("https://gwtmaterialdesign.github.io/gmd-core-demo/launcher-icons/launcher1x.png");

      return f_MaterialImage4;
    }

    /**
     * Getter for f_MaterialLabel5 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel5() {
      return build_f_MaterialLabel5();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel5() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel5 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel5.setFontSize("2em");
      f_MaterialLabel5.setText("Profile Page");

      return f_MaterialLabel5;
    }

    /**
     * Getter for f_MaterialLabel6 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private gwt.material.design.client.ui.MaterialLabel get_f_MaterialLabel6() {
      return build_f_MaterialLabel6();
    }
    private gwt.material.design.client.ui.MaterialLabel build_f_MaterialLabel6() {
      // Creation section.
      final gwt.material.design.client.ui.MaterialLabel f_MaterialLabel6 = (gwt.material.design.client.ui.MaterialLabel) GWT.create(gwt.material.design.client.ui.MaterialLabel.class);
      // Setup section.
      f_MaterialLabel6.setText("Lorem Ipsum Dolor emet");

      return f_MaterialLabel6;
    }
  }
}
