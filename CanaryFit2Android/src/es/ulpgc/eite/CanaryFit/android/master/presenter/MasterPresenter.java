package es.ulpgc.eite.CanaryFit.android.master.presenter;

import es.ulpgc.eite.CanaryFit.android.master.model.I_MasterModel;
import es.ulpgc.eite.CanaryFit.android.master.view.I_MasterView;
import es.ulpgc.eite.framework.android.AndroidScreenPresenter;
import es.ulpgc.eite.framework.core.screen.I_ScreenObserver;
import es.ulpgc.eite.framework.core.screen.I_ScreenState;
import es.ulpgc.eite.framework.core.screen.I_ScreenView;


public abstract class MasterPresenter extends AndroidScreenPresenter implements I_MasterPresenter, I_ScreenObserver {

    protected I_MasterModel getMasterModel() {
        return (I_MasterModel) getScreenModel();
    }

    protected I_MasterView getMasterView(){
        return (I_MasterView) getScreenView();
    }

    @Override
    public void setListPosition(int position) {

        getMasterModel().setPosition(position);

        debug("setListPosition", "position", position);
        debug("setListPosition", "data", getMasterModel().getData()); //<-- El getData lo hacen los hijos (categoria y producto)
    }



    @Override
    public void createScreen() {
        debug("createScreen");

        getMasterView().setMasterScreen();
    }

    @Override
    public void backScreen() {
        debug("backScreen");

    }

    @Override
    public void resumeScreen() {
        debug("resumeScreen");

        getMasterView().setMasterCollection(getMasterModel().getCollection());
        getMasterView().setListPosition(getMasterModel().getPosition());
    }

    @Override
    public void pauseScreen() {
        debug("pauseScreen");
    }

    @Override
    public void rotateScreen() {
        debug("rotateScreen");
    }

    //// TODO: 30/04/2016
    @Override
    public void setScreenState(Class<? extends I_ScreenView> aClass, int i, I_ScreenState i_screenState) {

    }

    //// TODO: 30/04/2016
    @Override
    public I_ScreenState getScreenState() {
        return null;
    }

    //// TODO: 30/04/2016
    @Override
    public I_ScreenState getNextState(Class<? extends I_ScreenView> aClass, int i) {
        return null;
    }

    // TODO: 30/04/2016
    @Override
    public I_ScreenState updateObserverState(
            Class<? extends I_ScreenView> view, int code, I_ScreenState state) {
        return null;
    }

    public void changeRotation(int code){
        debug("changeRotation", "code", code);

        startNextScreenWithFinish(code, true);
    }


}



