package es.ulpgc.eite.CanaryFit.android.mediator;

import es.ulpgc.eite.framework.android.AndroidMediatorSingleton;


public class MediatorSingleton extends AndroidMediatorSingleton {

    @Override
    public void createMediator() {
        setCustomConfig(new MediatorConfig(this));
    }
}
