package es.ulpgc.eite.CanaryFit.android.screen.portrait.principal;


import es.ulpgc.eite.CanaryFit.android.mediator.MediatorCode;
import es.ulpgc.eite.CanaryFit.android.screen.principal.presenter.PrincipalPresenter;

public class PortraitPrincipalPresenter extends PrincipalPresenter{

    @Override
    public void rotateScreen() {
        debug("rotateScreen");

        changeRotation(MediatorCode.PRINCIPAL_LANDSCAPE);
    }

    @Override
    public void imageButtonClickedBuscador() {
        setBtnClickedBuscador(true);
        debug("buttonClickedBuscador", "clicked", getBtnClickedBuscador());
        startNextScreenWithFinish(MediatorCode.PRINCIPAL_BUSCADOR_PORTRAIT, false);
    }

    @Override
    public void imageButtonClickedProximasCarreras() {
        setBtnClickedProximasCarreras(true);
        debug("buttonClickedProximasCarreras", "clicked", getBtnClickedProximasCarreras());
        startNextScreenWithObserver(this, MediatorCode.PRINCIPAL_PROXIMAS_PORTRAIT);
    }

    @Override
    public void imageButtonClickedResultados() {

        setBtnClickedResultados(true);
        debug("buttonClickedResultados", "clicked", getBtnClickedResultados());
        startNextScreenWithObserver(this, MediatorCode.PRINCIPAL_RESULTADOS_PORTRAIT);

    }
}
