package es.ulpgc.eite.CanaryFit.android.screen.landscape.proximas;

import es.ulpgc.eite.CanaryFit.android.mediator.MediatorCode;
import es.ulpgc.eite.CanaryFit.android.screen.proximas.presenter.ProxCarrerasPresenter;

public class LandscapeProxCarrerasPresenter extends ProxCarrerasPresenter{

    @Override
    public void rotateScreen() {
        debug("rotateScreen");

        changeRotation(MediatorCode.PROXIMAS_PORTRAIT);
    }


}
