package es.ulpgc.eite.CanaryFit.android.database;

import es.ulpgc.eite.CanaryFit.android.data.DetailData;

import java.util.List;

public interface I_DetailDatabase {

    DetailData getDetailData(Long dataId);
    DetailData getDetailDataBy(DatabaseClauseArg[] args);
    List<DetailData> getDetailDataListBy(DatabaseClauseArg[] args);
    boolean deleteDetailData(Long dataId);
    Long saveDetailData(DetailData data);
    List<DetailData> getDetailDataList();
    boolean deleteDetailDataList();
    boolean updateDetailData(DetailData data);

}
