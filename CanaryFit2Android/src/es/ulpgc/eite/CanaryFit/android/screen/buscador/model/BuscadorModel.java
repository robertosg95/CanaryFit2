package es.ulpgc.eite.CanaryFit.android.screen.buscador.model;

import es.ulpgc.eite.CanaryFit.android.screen.buscador.presenter.I_BuscadorPresenter;
import es.ulpgc.eite.framework.android.AndroidScreenModel;

public class BuscadorModel extends AndroidScreenModel implements I_BuscadorModel {

    private I_BuscadorPresenter getBuscadorPresenter(){
        return (I_BuscadorPresenter) getScreenPresenter();
    }
}
