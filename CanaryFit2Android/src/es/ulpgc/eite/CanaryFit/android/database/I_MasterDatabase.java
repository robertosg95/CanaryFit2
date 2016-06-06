package es.ulpgc.eite.CanaryFit.android.database;

import es.ulpgc.eite.CanaryFit.android.master.data.proximas.MasterData;

import java.util.List;

public interface I_MasterDatabase {

    MasterData getMasterData(Long dataId);
    MasterData getMasterDataBy(DatabaseClauseArg[] args);
    List<MasterData> getMasterDataListBy(DatabaseClauseArg[] args);
    List<MasterData> getMasterDataList();
    boolean deleteMasterData(Long dataId);
    boolean deleteMasterDataList();
    Long saveMasterData(MasterData data);
    boolean updateMasterData(MasterData data);
}
