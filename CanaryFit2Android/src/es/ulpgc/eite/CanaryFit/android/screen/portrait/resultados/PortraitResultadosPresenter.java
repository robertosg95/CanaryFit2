package es.ulpgc.eite.CanaryFit.android.screen.portrait.resultados;


import es.ulpgc.eite.CanaryFit.android.mediator.MediatorCode;
import es.ulpgc.eite.CanaryFit.android.screen.resultados.presenter.ResultadosPresenter;

public class PortraitResultadosPresenter extends ResultadosPresenter{

    @Override
    public void rotateScreen() {
        debug("rotateScreen");

        changeRotation(MediatorCode.RESULTADOS_LANDSCAPE);
    }
}
