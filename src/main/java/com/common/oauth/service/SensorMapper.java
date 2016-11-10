package com.common.oauth.service;

import com.common.oauth.model.Sensor;

public interface SensorMapper {
    int deleteByPrimaryKey(String sid);

    int insert(Sensor record);

    int insertSelective(Sensor record);

    Sensor selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(Sensor record);

    int updateByPrimaryKeyWithBLOBs(Sensor record);

    int updateByPrimaryKey(Sensor record);
}