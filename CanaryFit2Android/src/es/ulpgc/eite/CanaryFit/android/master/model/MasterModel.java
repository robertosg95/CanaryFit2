package es.ulpgc.eite.CanaryFit.android.master.model;

import es.ulpgc.eite.CanaryFit.android.master.data.proximas.DetailProximasData;
import es.ulpgc.eite.CanaryFit.android.master.presenter.I_MasterPresenter;
import es.ulpgc.eite.framework.android.AndroidScreenModel;


public abstract class MasterModel extends AndroidScreenModel implements I_MasterModel {


    private int position;
    //Cambiar nombre a DetailProximasData???
    private DetailProximasData dataRef;


    protected I_MasterPresenter getMasterPresenter() {
        return (I_MasterPresenter) getScreenPresenter();
    }

    @Override
    public DetailProximasData getDataRef() {
        return dataRef;
    }

    @Override
    public void setDataRef(DetailProximasData data) {
        dataRef = data;
    }


    @Override
    public int getPosition() {
        return position;
    }

    @Override
    public void setPosition(int pos) {
        position = pos;
    }

    /*

    protected I_MasterDatabase getMasterDatabase(){
        return (I_MasterDatabase) getScreenDatabase();
    }

    protected I_DetailDatabase getDetailDatabase(){
        return (I_DetailDatabase) getScreenDatabase();
    }

     */



}
