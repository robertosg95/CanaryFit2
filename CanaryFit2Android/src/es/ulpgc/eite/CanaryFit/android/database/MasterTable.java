package es.ulpgc.eite.CanaryFit.android.database;

import es.ulpgc.eite.CanaryFit.android.data.MasterData;
import org.droidpersistence.dao.TableDefinition;

public class MasterTable extends TableDefinition<MasterData> {

    public MasterTable() {
        super(MasterData.class);
    }

}
