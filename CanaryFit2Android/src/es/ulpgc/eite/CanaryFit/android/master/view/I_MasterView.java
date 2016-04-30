package es.ulpgc.eite.CanaryFit.android.master.view;


import es.ulpgc.eite.CanaryFit.android.database.I_Data;

import java.util.List;

public interface I_MasterView {
    void setMasterScreen();

    void setMasterCollection(List<? extends I_Data> collection);

    void setListPosition(int position);
}
