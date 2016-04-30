package es.ulpgc.eite.CanaryFit.android.master.model;


import es.ulpgc.eite.CanaryFit.android.database.I_Data;
import es.ulpgc.eite.CanaryFit.android.master.data.proximas.DetailProximasData;

import java.util.List;

public interface I_MasterModel {
    DetailProximasData getDataRef();

    void setDataRef(DetailProximasData data);

    int getPosition();

    void setPosition(int pos);

    // TODO: 30/04/2016 se implementa en los hijos
    List<? extends I_Data> getCollection();
}
