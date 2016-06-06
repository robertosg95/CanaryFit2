package es.ulpgc.eite.CanaryFit.android.database;

import es.ulpgc.eite.CanaryFit.android.data.DetailData;
import org.droidpersistence.dao.TableDefinition;

public class DetailTable extends TableDefinition<DetailData> {

    public DetailTable() {
        super(DetailData.class);
    }

}
