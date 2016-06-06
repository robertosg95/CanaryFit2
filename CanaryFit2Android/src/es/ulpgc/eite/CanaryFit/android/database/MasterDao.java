package es.ulpgc.eite.CanaryFit.android.database;

import android.database.sqlite.SQLiteDatabase;
import es.ulpgc.eite.CanaryFit.android.data.MasterData;
import org.droidpersistence.dao.DroidDao;
import org.droidpersistence.dao.TableDefinition;

public class MasterDao extends DroidDao<MasterData, Long> {

    public MasterDao(TableDefinition< MasterData > td, SQLiteDatabase db) {

        super(MasterData.class, td, db);
    }


}
