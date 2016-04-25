package es.ulpgc.eite.CanaryFit.android.screen.master1.proximas.presenter;

import es.ulpgc.eite.CanaryFit.android.master1.proximas.model.I_Master1ProximasCarrerasModel;
import es.ulpgc.eite.CanaryFit.android.master1.proximas.presenter.I_Master1ProximasCarrerasPresenter;
import es.ulpgc.eite.CanaryFit.android.master1.proximas.view.I_Master1ProximasCarrerasView;
import es.ulpgc.eite.framework.android.AndroidScreenPresenter;
import es.ulpgc.eite.framework.core.screen.I_ScreenState;
import es.ulpgc.eite.framework.core.screen.I_ScreenView;

public class Master1ProximasCarrerasPresenter extends AndroidScreenPresenter implements I_Master1ProximasCarrerasPresenter {

    private I_Master1ProximasCarrerasModel getMaster1ProximasCarrerasModel(){
        return (I_Master1ProximasCarrerasModel) getScreenModel();
    }

    private I_Master1ProximasCarrerasView getMaster1ProximasCarrerasView(){
        return (I_Master1ProximasCarrerasView) getScreenView();
    }


    @Override
    public void createScreen() {

    }

    @Override
    public void backScreen() {

    }

    @Override
    public void resumeScreen() {

    }

    @Override
    public void pauseScreen() {

    }

    @Override
    public void rotateScreen() {

    }

    @Override
    public void setScreenState(Class<? extends I_ScreenView> view, int code, I_ScreenState state) {

    }

    @Override
    public I_ScreenState getScreenState() {
        return null;
    }

    @Override
    public I_ScreenState getNextState(Class<? extends I_ScreenView> view, int code) {
        return null;
    }
}
