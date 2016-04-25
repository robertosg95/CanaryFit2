package es.ulpgc.eite.CanaryFit.android.screen.landscape.buscador;


import es.ulpgc.eite.CanaryFit.android.mediator.MediatorCode;
import es.ulpgc.eite.CanaryFit.android.screen.buscador.presenter.BuscadorPresenter;

public class LandscapeBuscadorPresenter extends BuscadorPresenter{

    @Override
    public void rotateScreen() {
        debug("rotateScreen");

        changeRotation(MediatorCode.BUSCADOR_PORTRAIT);
    }
}
