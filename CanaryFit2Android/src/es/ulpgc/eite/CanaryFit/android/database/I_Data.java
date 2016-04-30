package es.ulpgc.eite.CanaryFit.android.database;


import java.util.Date;

public interface I_Data {

    Long getId();
    String getNombre();
    String getModalidad();
    String getPais();
    String getLocalidad();
    Date getFecha();
    float getDistancia();
    String getDescripcion();
    float getPrecio();
}
