package es.ulpgc.eite.CanaryFit.android.screen.buscador.presenter;

import es.ulpgc.eite.CanaryFit.android.screen.buscador.view.I_BuscadorView;
import es.ulpgc.eite.framework.android.AndroidScreenPresenter;
import es.ulpgc.eite.framework.core.screen.I_ScreenObserver;
import es.ulpgc.eite.framework.core.screen.I_ScreenState;
import es.ulpgc.eite.framework.core.screen.I_ScreenView;

public class BuscadorPresenter extends AndroidScreenPresenter implements I_BuscadorPresenter, I_ScreenObserver{

    private I_BuscadorView getBuscadorView() {
        return (I_BuscadorView) getScreenView();
    }

    @Override
    public void createScreen() {
        debug("createScreen");

        getBuscadorView().setLayout();
        getBuscadorView().setListener();
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
