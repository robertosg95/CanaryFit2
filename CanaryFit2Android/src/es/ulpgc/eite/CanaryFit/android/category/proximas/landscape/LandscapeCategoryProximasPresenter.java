package es.ulpgc.eite.CanaryFit.android.category.proximas.landscape;

import es.ulpgc.eite.CanaryFit.android.master.presenter.MasterPresenter;
import es.ulpgc.eite.CanaryFit.android.mediator.MediatorCode;

public class LandscapeCategoryProximasPresenter extends MasterPresenter{

    @Override
    public void rotateScreen() {
        debug("rotateScreen");

        changeRotation(MediatorCode.PROXIMAS_CATEGORIA_PORTRAIT);
    }

    @Override
    public void setListPosition(int position) {
        super.setListPosition(position);

        startNextScreenWithFinish(MediatorCode.PROXIMAS_CATEGORIA_PROXIMAS_PRODUCTO_LANDSCAPE, false);
    }


}
