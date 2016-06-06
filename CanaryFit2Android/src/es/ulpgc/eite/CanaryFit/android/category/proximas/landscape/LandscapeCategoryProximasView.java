package es.ulpgc.eite.CanaryFit.android.category.proximas.landscape;

import es.ulpgc.eite.CanaryFit.android.R;
import es.ulpgc.eite.CanaryFit.android.master.view.MasterView;

public class LandscapeCategoryProximasView extends MasterView {

    public int getListLayout(){
        return R.layout.master_categoria_prox_carreras_land;
    }

    public int getListView(){
        return R.id.listView_master_categoria_prox_portrait;
    }

}
