package es.ulpgc.eite.CanaryFit.android.data;

import es.ulpgc.eite.CanaryFit.android.database.I_Data;
import org.droidpersistence.annotation.Column;
import org.droidpersistence.annotation.PrimaryKey;
import org.droidpersistence.annotation.Table;

@Table(name="product_table")
public class DetailData implements I_Data {

    @PrimaryKey(autoIncrement = true)
    @Column(name = "id")
    private Long id;

    @Column(name = "label")
    private String label;


    @Column(name = "ref")
    private Long ref;

    public DetailData() {
        setLabel("");
    }

    public DetailData(String txt) {
        setLabel(txt);
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long num) {
        id = num;
    }

    public Long getRef() {
        return ref;
    }

    public void setRef(Long num) {
        ref = num;
    }

    @Override
    public String getLabel() {
        return label;
    }

    public void setLabel(String txt) {
        label = txt;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof DetailData){
            DetailData data = (DetailData) obj;

            if(data.getId() == getId()){   //todo
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return getLabel();
    }
}