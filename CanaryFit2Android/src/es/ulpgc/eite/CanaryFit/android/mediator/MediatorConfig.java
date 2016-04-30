package es.ulpgc.eite.CanaryFit.android.mediator;

import es.ulpgc.eite.CanaryFit.android.screen.buscador.model.BuscadorModel;
import es.ulpgc.eite.CanaryFit.android.screen.landscape.buscador.LandscapeBuscadorPresenter;
import es.ulpgc.eite.CanaryFit.android.screen.landscape.buscador.LandscapeBuscadorView;
import es.ulpgc.eite.CanaryFit.android.screen.landscape.principal.LandscapePrincipalPresenter;
import es.ulpgc.eite.CanaryFit.android.screen.landscape.principal.LandscapePrincipalView;
import es.ulpgc.eite.CanaryFit.android.screen.master.landscape.productos.proximas.LandscapeProxCarrerasPresenter;
import es.ulpgc.eite.CanaryFit.android.screen.master.landscape.productos.proximas.LandscapeProxCarrerasView;
import es.ulpgc.eite.CanaryFit.android.screen.master.landscape.productos.resultados.LandscapeResultadosPresenter;
import es.ulpgc.eite.CanaryFit.android.screen.master.landscape.productos.resultados.LandscapeResultadosView;
import es.ulpgc.eite.CanaryFit.android.screen.portrait.buscador.PortraitBuscadorPresenter;
import es.ulpgc.eite.CanaryFit.android.screen.portrait.buscador.PortraitBuscadorView;
import es.ulpgc.eite.CanaryFit.android.screen.portrait.principal.PortraitPrincipalPresenter;
import es.ulpgc.eite.CanaryFit.android.screen.portrait.principal.PortraitPrincipalView;
import es.ulpgc.eite.CanaryFit.android.screen.master.portrait.productos.proximas.PortraitProxCarrerasPresenter;
import es.ulpgc.eite.CanaryFit.android.screen.master.portrait.productos.proximas.PortraitProxCarrerasView;
import es.ulpgc.eite.CanaryFit.android.screen.master.portrait.productos.resultados.PortraitResultadosPresenter;
import es.ulpgc.eite.CanaryFit.android.screen.master.portrait.productos.resultados.PortraitResultadosView;
import es.ulpgc.eite.CanaryFit.android.screen.principal.model.PrincipalModel;
import es.ulpgc.eite.CanaryFit.android.screen.proximas.model.ProxCarrerasModel;
import es.ulpgc.eite.CanaryFit.android.screen.resultados.model.ResultadosModel;
import es.ulpgc.eite.framework.core.mediator.I_MediatorSingleton;
import es.ulpgc.eite.framework.core.mediator.MediatorScreen;
import es.ulpgc.eite.framework.core.mediator.MediatorTransition;

public class MediatorConfig extends es.ulpgc.eite.framework.core.mediator.MediatorConfig {
    public MediatorConfig(I_MediatorSingleton mediator) {
        super(mediator);
    }

    @Override
    public void setCustomConfig() {
        setPrincipalConfig();
    }

    private void setPrincipalConfig() {
        setPrincipalScreenCollection();
        setPrincipalTransitionCollection();
    }

    private void setPrincipalScreenCollection() {
        getScreens().add(new MediatorScreen(
                LandscapePrincipalView.class, LandscapePrincipalPresenter.class, PrincipalModel.class
        ));

        getScreens().add(new MediatorScreen(
                PortraitPrincipalView.class, PortraitPrincipalPresenter.class, PrincipalModel.class
        ));

        getScreens().add(new MediatorScreen(
                PortraitBuscadorView.class, PortraitBuscadorPresenter.class, BuscadorModel.class
        ));

        getScreens().add(new MediatorScreen(
                LandscapeBuscadorView.class, LandscapeBuscadorPresenter.class, BuscadorModel.class
        ));

        getScreens().add(new MediatorScreen(
                PortraitProxCarrerasView.class, PortraitProxCarrerasPresenter.class, ProxCarrerasModel.class
        ));

        getScreens().add(new MediatorScreen(
                LandscapeProxCarrerasView.class, LandscapeProxCarrerasPresenter.class, ProxCarrerasModel.class
        ));

        getScreens().add(new MediatorScreen(
                PortraitResultadosView.class, PortraitResultadosPresenter.class, ResultadosModel.class
        ));

        getScreens().add(new MediatorScreen(
                LandscapeResultadosView.class, LandscapeResultadosPresenter.class, ResultadosModel.class
        ));

    }

    private void setPrincipalTransitionCollection() {

        getTransitions().add(new MediatorTransition(
                PortraitPrincipalView.class, LandscapePrincipalView.class, MediatorCode.PRINCIPAL_LANDSCAPE
        ));

        getTransitions().add(new MediatorTransition(
                LandscapePrincipalView.class, PortraitPrincipalView.class, MediatorCode.PRINCIPAL_PORTRAIT
        ));


        getTransitions().add(new MediatorTransition(
                PortraitPrincipalView.class, PortraitBuscadorView.class, MediatorCode.PRINCIPAL_BUSCADOR_PORTRAIT
        ));

        getTransitions().add(new MediatorTransition(
                LandscapePrincipalView.class, LandscapeBuscadorView.class, MediatorCode.PRINCIPAL_BUSCADOR_LANDSCAPE
        ));

        getTransitions().add(new MediatorTransition(
                PortraitBuscadorView.class, PortraitPrincipalView.class, MediatorCode.BUSCADOR_PRINCIPAL_PORTRAIT
        ));

        getTransitions().add(new MediatorTransition(
                LandscapeBuscadorView.class, LandscapePrincipalView.class, MediatorCode.BUSCADOR_PRINCIPAL_LANDSCAPE
        ));

        getTransitions().add(new MediatorTransition(
                PortraitBuscadorView.class, LandscapeBuscadorView.class, MediatorCode.BUSCADOR_LANDSCAPE
        ));

        getTransitions().add(new MediatorTransition(
                LandscapeBuscadorView.class, PortraitBuscadorView.class, MediatorCode.BUSCADOR_PORTRAIT
        ));

        getTransitions().add(new MediatorTransition(
                PortraitPrincipalView.class, PortraitProxCarrerasView.class, MediatorCode.PRINCIPAL_PROXIMAS_PORTRAIT
        ));

        getTransitions().add(new MediatorTransition(
                LandscapePrincipalView.class, LandscapeProxCarrerasView.class, MediatorCode.PRINCIPAL_PROXIMAS_LANDSCAPE
        ));

        getTransitions().add(new MediatorTransition(
                PortraitProxCarrerasView.class, PortraitPrincipalView.class, MediatorCode.PROXIMAS_PRINCIPAL_PORTRAIT
        ));

        getTransitions().add(new MediatorTransition(
                LandscapeProxCarrerasView.class, LandscapePrincipalView.class, MediatorCode.PROXIMAS_PRINCIPAL_LANDSCAPE
        ));

        getTransitions().add(new MediatorTransition(
                PortraitProxCarrerasView.class, LandscapeProxCarrerasView.class, MediatorCode.PROXIMAS_LANDSCAPE
        ));

        getTransitions().add(new MediatorTransition(
                LandscapeProxCarrerasView.class, PortraitProxCarrerasView.class, MediatorCode.PROXIMAS_PORTRAIT
        ));



        getTransitions().add(new MediatorTransition(
                PortraitPrincipalView.class, PortraitResultadosView.class, MediatorCode.PRINCIPAL_RESULTADOS_PORTRAIT
        ));

        getTransitions().add(new MediatorTransition(
                LandscapePrincipalView.class, LandscapeResultadosView.class, MediatorCode.PRINCIPAL_RESULTADOS_LANDSCAPE
        ));

        getTransitions().add(new MediatorTransition(
                PortraitResultadosView.class, PortraitPrincipalView.class, MediatorCode.RESULTADOS_PRINCIPAL_PORTRAIT
        ));

        getTransitions().add(new MediatorTransition(
                LandscapeResultadosView.class, LandscapePrincipalView.class, MediatorCode.RESULTADOS_PRINCIPAL_LANDSCAPE
        ));

        getTransitions().add(new MediatorTransition(
                PortraitResultadosView.class, LandscapeResultadosView.class, MediatorCode.RESULTADOS_LANDSCAPE
        ));

        getTransitions().add(new MediatorTransition(
                LandscapeResultadosView.class, PortraitResultadosView.class, MediatorCode.RESULTADOS_PORTRAIT
        ));


    }
}
