package es.ulpgc.eite.CanaryFit.android.screen.principal.presenter;

import es.ulpgc.eite.CanaryFit.android.screen.principal.model.I_PrincipalModel;
import es.ulpgc.eite.CanaryFit.android.screen.principal.view.I_PrincipalView;
import es.ulpgc.eite.framework.android.AndroidScreenPresenter;
import es.ulpgc.eite.framework.core.screen.I_ScreenObserver;
import es.ulpgc.eite.framework.core.screen.I_ScreenState;
import es.ulpgc.eite.framework.core.screen.I_ScreenView;

public class PrincipalPresenter extends AndroidScreenPresenter implements I_PrincipalPresenter, I_ScreenObserver{

    private Boolean _btnClickedBuscador;

    private Boolean _btnClickedProximasCarreras;

    private Boolean _btnClickedResultados;

    public Boolean getBtnClickedBuscador() {
        return _btnClickedBuscador;
    }

    public Boolean getBtnClickedProximasCarreras() {
        return _btnClickedProximasCarreras;
    }

    public Boolean getBtnClickedResultados() {
        return _btnClickedResultados;
    }

    public void setBtnClickedBuscador(Boolean btnClicked) {
        _btnClickedBuscador = btnClicked;
    }

    public void setBtnClickedProximasCarreras(Boolean btnClicked) {
        _btnClickedProximasCarreras = btnClicked;
    }

    public void setBtnClickedResultados(Boolean btnClicked) {
        _btnClickedResultados = btnClicked;
    }

    private I_PrincipalView getPrincipalView() {
        return (I_PrincipalView) getScreenView();
    }

    private I_PrincipalModel getHelloModel(){ return (I_PrincipalModel) getScreenModel();
    }

    @Override
    public void imageButtonClickedBuscador() {

    }

    @Override
    public void imageButtonClickedProximasCarreras() {

    }

    @Override
    public void imageButtonClickedResultados() {

    }


    @Override
    public void createScreen() {
        debug("createScreen");

        getPrincipalView().setLayout();
        getPrincipalView().setListener();
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
