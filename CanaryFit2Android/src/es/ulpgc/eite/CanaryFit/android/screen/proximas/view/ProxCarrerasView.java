package es.ulpgc.eite.CanaryFit.android.screen.proximas.view;


import es.ulpgc.eite.CanaryFit.android.screen.proximas.presenter.I_ProxCarrerasPresenter;
import es.ulpgc.eite.framework.android.AndroidScreenView;

public abstract class ProxCarrerasView extends AndroidScreenView implements I_ProxCarrerasView {

    private I_ProxCarrerasPresenter getProxCarrerasPresenter(){
        return (I_ProxCarrerasPresenter) getScreenPresenter();
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
