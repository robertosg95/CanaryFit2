package es.ulpgc.eite.CanaryFit.android.screen.landscape.principal;


import es.ulpgc.eite.CanaryFit.android.mediator.MediatorCode;
import es.ulpgc.eite.CanaryFit.android.screen.principal.presenter.PrincipalPresenter;

public class LandscapePrincipalPresenter extends PrincipalPresenter{

    @Override
    public void rotateScreen() {
        debug("rotateScreen");

        changeRotation(MediatorCode.PRINCIPAL_PORTRAIT);
    }

    @Override
    public void imageButtonClickedBuscador() {
        setBtnClickedBuscador(true);
        debug("buttonClickedBuscador", "clicked", getBtnClickedBuscador());
        startNextScreenWithFinish(MediatorCode.PRINCIPAL_BUSCADOR_LANDSCAPE, false);

    }

    @Override
    public void imageButtonClickedProximasCarreras() {
        setBtnClickedProximasCarreras(true);
        debug("buttonClickedProximasCarreras", "clicked", getBtnClickedProximasCarreras());
        startNextScreenWithObserver(this, MediatorCode.PRINCIPAL_PROXIMAS_LANDSCAPE);
    }

    @Override
    public void imageButtonClickedResultados() {

        setBtnClickedResultados(true);
        debug("buttonClickedResultados", "clicked", getBtnClickedResultados());
        startNextScreenWithObserver(this, MediatorCode.PRINCIPAL_RESULTADOS_LANDSCAPE);

    }


}
