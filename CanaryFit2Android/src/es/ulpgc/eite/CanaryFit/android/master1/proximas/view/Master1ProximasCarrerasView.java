package es.ulpgc.eite.CanaryFit.android.master1.proximas.view;


import es.ulpgc.eite.CanaryFit.android.master1.proximas.presenter.I_Master1ProximasCarrerasPresenter;
import es.ulpgc.eite.framework.android.AndroidScreenView;

public class Master1ProximasCarrerasView extends AndroidScreenView implements I_Master1ProximasCarrerasView{

    private I_Master1ProximasCarrerasPresenter getMaster1ProximasCarrerasPresenter(){
        return (I_Master1ProximasCarrerasPresenter) getScreenPresenter();
    }
}
