package es.ulpgc.eite.CanaryFit.android.screen.resultados.view;


import es.ulpgc.eite.CanaryFit.android.screen.resultados.presenter.I_ResultadosPresenter;
import es.ulpgc.eite.framework.android.AndroidScreenView;

public abstract class ResultadosView extends AndroidScreenView implements I_ResultadosView{

    private I_ResultadosPresenter getResultadosPresenter(){
        return (I_ResultadosPresenter) getScreenPresenter();
    }

    public abstract int getLayout();

    @Override
    public void setLayout(){
        debug("setLayout");

        setContentView(getLayout());
    }

    @Override
    public void setListener() {

    }

}
