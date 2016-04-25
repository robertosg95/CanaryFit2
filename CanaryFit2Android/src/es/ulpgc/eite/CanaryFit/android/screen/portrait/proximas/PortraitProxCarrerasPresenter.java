package es.ulpgc.eite.CanaryFit.android.screen.portrait.proximas;

import es.ulpgc.eite.CanaryFit.android.mediator.MediatorCode;
import es.ulpgc.eite.CanaryFit.android.screen.proximas.presenter.ProxCarrerasPresenter;

public class PortraitProxCarrerasPresenter extends ProxCarrerasPresenter{

    @Override
    public void rotateScreen() {
        debug("rotateScreen");

        changeRotation(MediatorCode.PROXIMAS_LANDSCAPE);
    }


}
