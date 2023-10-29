package com.primogemstudio.primogemcraft.database;

import com.primogemstudio.primogemcraft.gacha.serialize.GachaRecordModel;

public interface AbstractDatabase {
    void stageChanges(GachaRecordModel.DataModel data);
    void write(GachaRecordModel.DataModel data) throws Exception;
    GachaRecordModel.DataModel read() throws Exception;
}
