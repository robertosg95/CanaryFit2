package es.ulpgc.eite.CanaryFit.android.screen.master1.proximas.model;

import es.ulpgc.eite.CanaryFit.android.master1.proximas.model.I_Master1ProximasCarrerasModel;
import es.ulpgc.eite.CanaryFit.android.master1.proximas.presenter.I_Master1ProximasCarrerasPresenter;
import es.ulpgc.eite.framework.android.AndroidScreenModel;

public class Master1ProximasCarrerasModel extends AndroidScreenModel implements I_Master1ProximasCarrerasModel {

    private I_Master1ProximasCarrerasPresenter getMaster1ProximasCarrerasPresenter(){
        return (I_Master1ProximasCarrerasPresenter) getScreenPresenter();
    }
}
