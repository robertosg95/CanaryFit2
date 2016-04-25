package es.ulpgc.eite.CanaryFit.android.screen.buscador.view;

import es.ulpgc.eite.CanaryFit.android.screen.buscador.presenter.I_BuscadorPresenter;
import es.ulpgc.eite.framework.android.AndroidScreenView;


public abstract class BuscadorView extends AndroidScreenView implements I_BuscadorView {

    private I_BuscadorPresenter getBuscadorPresenter(){
        return (I_BuscadorPresenter) getScreenPresenter();
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
