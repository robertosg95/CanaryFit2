package es.ulpgc.eite.CanaryFit.android.screen.proximas.model;


import es.ulpgc.eite.CanaryFit.android.screen.proximas.presenter.I_ProxCarrerasPresenter;
import es.ulpgc.eite.framework.android.AndroidScreenModel;

public class ProxCarrerasModel extends AndroidScreenModel implements I_ProxCarrerasPresenter{

    private I_ProxCarrerasPresenter getProxCarrerasPresenter(){
        return (I_ProxCarrerasPresenter) getScreenPresenter();
    }
}


