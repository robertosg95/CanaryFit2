package es.ulpgc.eite.CanaryFit.android.screen.principal.model;

import es.ulpgc.eite.CanaryFit.android.screen.principal.presenter.I_PrincipalPresenter;
import es.ulpgc.eite.framework.android.AndroidScreenModel;

public class PrincipalModel extends AndroidScreenModel implements I_PrincipalModel {

    private I_PrincipalPresenter getPrincipalPresenter(){
        return (I_PrincipalPresenter) getScreenPresenter();
    }
}
