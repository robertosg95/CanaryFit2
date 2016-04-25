package es.ulpgc.eite.CanaryFit.android.screen.proximas.presenter;

import es.ulpgc.eite.CanaryFit.android.screen.proximas.view.I_ProxCarrerasView;
import es.ulpgc.eite.framework.android.AndroidScreenPresenter;
import es.ulpgc.eite.framework.core.screen.I_ScreenObserver;
import es.ulpgc.eite.framework.core.screen.I_ScreenState;
import es.ulpgc.eite.framework.core.screen.I_ScreenView;

public abstract class ProxCarrerasPresenter extends AndroidScreenPresenter implements I_ProxCarrerasPresenter, I_ScreenObserver {

    private I_ProxCarrerasView getProxCarrerasView() {
        return (I_ProxCarrerasView) getScreenView();
    }

    @Override
    public void createScreen() {
        debug("createScreen");

        getProxCarrerasView().setLayout();
        getProxCarrerasView().setListener();
    }

    @Override
    public void backScreen() {
        debug("backScreen");

    }

    @Override
    public void resumeScreen() {

    }

    @Override
    public void pauseScreen() {
        debug("pauseScreen");
    }

    @Override
    public void rotateScreen() {
        debug("rotateScreen");
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

    @Override
    public I_ScreenState updateObserverState(Class<? extends I_ScreenView> aClass, int i, I_ScreenState i_screenState) {
        return null;
    }

    public void changeRotation(int code){
        debug("changeRotation", "code", code);

        startNextScreenWithFinish(code, true);
    }

}


