package es.ulpgc.eite.CanaryFit.android.screen.resultados.model;


import es.ulpgc.eite.CanaryFit.android.screen.resultados.presenter.I_ResultadosPresenter;
import es.ulpgc.eite.framework.android.AndroidScreenModel;

public class ResultadosModel extends AndroidScreenModel implements I_ResultadosModel{

    private I_ResultadosPresenter getResultadosPresenter(){
        return (I_ResultadosPresenter) getScreenPresenter();
    }
}
