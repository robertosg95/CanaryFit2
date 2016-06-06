package es.ulpgc.eite.CanaryFit.android.master.data.proximas;

import org.droidpersistence.annotation.Column;
import org.droidpersistence.annotation.PrimaryKey;
import org.droidpersistence.annotation.Table;

import java.util.Date;

@Table(name="carreras")
public class MasterData {

    @PrimaryKey (autoIncrement = true)
    @Column (name="id")
    private Long id;

    @Column
    private String nombre;

    @Column
    private String modalidad;

    @Column
    private String pais;

    @Column
    private String localidad;

    @Column
    private String descripcion;

    @Column
    private float distancia;

    @Column
    private Date fecha;     //Aprender a usar el Date!!

    @Column
    private float precio;


    public MasterData(String nombre, String modalidad, String pais, String localidad, String descripcion, float distancia, Date fecha, float precio) {
        setNombre(nombre);
        setModalidad(modalidad);
        setPais(pais);
        setLocalidad(localidad);
        setDescripcion(descripcion);
        setDistancia(distancia);
        setFecha(fecha);
        setPrecio(precio);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long num) {
        id = num;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreNuevo) {
        nombre = nombreNuevo;
    }



    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidadNueva) {
        modalidad = modalidadNueva;
    }



    public String getPais() {
        return pais;
    }

    public void setPais(String paisNuevo) {
        pais = paisNuevo;
    }



    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidadNueva) {
        localidad = localidadNueva;
    }



    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fechaNueva) {
        fecha = fechaNueva;
    }



    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distanciaNueva) {
        distancia = distanciaNueva;
    }



    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcionNueva) {
        descripcion = descripcionNueva;
    }




    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precioNuevo) {
        precio = precioNuevo;
    }

    //???
    //Comprobar que el objeto es de esta clase y ver si ya esta en la base de datos?
    //SOLID???
    // TODO: 30/04/2016
    @Override
    public boolean equals(Object obj){
        if (obj instanceof MasterData){
            MasterData data = (MasterData) obj;
            if(data.getId() == getId()){
                return true;
            }
        }
        return false;
    }

















}
