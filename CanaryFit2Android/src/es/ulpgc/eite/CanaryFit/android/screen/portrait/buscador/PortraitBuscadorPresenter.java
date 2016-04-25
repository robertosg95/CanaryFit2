package es.ulpgc.eite.CanaryFit.android.screen.portrait.buscador;


import es.ulpgc.eite.CanaryFit.android.mediator.MediatorCode;
import es.ulpgc.eite.CanaryFit.android.screen.buscador.presenter.BuscadorPresenter;

public class PortraitBuscadorPresenter extends BuscadorPresenter{

    @Override
    public void rotateScreen() {
        debug("rotateScreen");

        changeRotation(MediatorCode.BUSCADOR_LANDSCAPE);
    }



}
