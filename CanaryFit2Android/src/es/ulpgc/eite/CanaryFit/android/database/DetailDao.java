package es.ulpgc.eite.CanaryFit.android.database;

import android.database.sqlite.SQLiteDatabase;
import es.ulpgc.eite.CanaryFit.android.data.DetailData;
import org.droidpersistence.dao.DroidDao;
import org.droidpersistence.dao.TableDefinition;


public class DetailDao extends DroidDao<DetailData, Long> {

	public DetailDao(TableDefinition<DetailData> td, SQLiteDatabase db) {

		super(DetailData.class, td, db);
	}

}
