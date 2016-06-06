package es.ulpgc.eite.CanaryFit.android.category.proximas.portrait;

import es.ulpgc.eite.CanaryFit.android.master.presenter.MasterPresenter;
import es.ulpgc.eite.CanaryFit.android.mediator.MediatorCode;

public class PortraitCategoryProximasPresenter extends MasterPresenter{

    @Override
    public void rotateScreen() {
        debug("rotateScreen");

        changeRotation(MediatorCode.PROXIMAS_CATEGORIA_LANDSCAPE);
    }

    @Override
    public void setListPosition(int position) {
        super.setListPosition(position);

        startNextScreenWithFinish(MediatorCode.PROXIMAS_CATEGORIA_PROXIMAS_PRODUCTO_PORTRAIT, false);
    }
}
