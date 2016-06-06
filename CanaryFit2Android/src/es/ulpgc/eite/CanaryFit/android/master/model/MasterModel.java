package es.ulpgc.eite.CanaryFit.android.master.model;

import es.ulpgc.eite.CanaryFit.android.database.I_DetailDatabase;
import es.ulpgc.eite.CanaryFit.android.database.I_MasterDatabase;
import es.ulpgc.eite.CanaryFit.android.master.data.proximas.MasterData;
import es.ulpgc.eite.CanaryFit.android.master.presenter.I_MasterPresenter;
import es.ulpgc.eite.framework.android.AndroidScreenModel;


public abstract class MasterModel extends AndroidScreenModel implements I_MasterModel {


    private int position;
    //Cambiar nombre de MasterProximasData??? DONE
    private MasterData dataRef;


    protected I_MasterPresenter getMasterPresenter() {
        return (I_MasterPresenter) getScreenPresenter();
    }

    protected I_MasterDatabase getMasterDatabase(){
        return (I_MasterDatabase) getScreenDatabase();
    }

    protected I_DetailDatabase getDetailDatabase(){
        return (I_DetailDatabase) getScreenDatabase();
    }

    @Override
    public MasterData getDataRef() {
        return dataRef;
    }

    @Override
    public void setDataRef(MasterData data) {
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









}
