package es.ulpgc.eite.CanaryFit.android.screen.master.landscape.categoria.resultados;


import es.ulpgc.eite.CanaryFit.android.mediator.MediatorCode;
import es.ulpgc.eite.CanaryFit.android.screen.resultados.presenter.ResultadosPresenter;

public class LandscapeResultadosPresenter extends ResultadosPresenter{

    @Override
    public void rotateScreen() {
        debug("rotateScreen");

        changeRotation(MediatorCode.RESULTADOS_PORTRAIT);
    }
}
