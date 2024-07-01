package com.inc.admin.dao.biz;

import com.inc.admin.domain.biz.RainfallStation;
import com.inc.admin.domain.biz.RainfallStationCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RainfallStationDao {
    /**
     * @param example
     * @return long
     */
    long countByExample(RainfallStationCriteria example);

    /**
     * @param example
     * @return int
     */
    int deleteByExample(RainfallStationCriteria example);

    /**
     * 根据主键删除 
     * @param id
     * @return int
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 添加 
     * @param record
     * @return int
     */
    int insert(RainfallStation record);

    /**
     * 插入值不为空的列 
     * @param record
     * @return int
     */
    int insertSelective(RainfallStation record);

    /**
     * @param example
     * @return java.util.List<com.inc.admin.domain.biz.RainfallStation>
     */
    List<RainfallStation> selectByExample(RainfallStationCriteria example);

    /**
     * 根据主键查询 
     * @param id
     * @return com.inc.admin.domain.biz.RainfallStation
     */
    RainfallStation selectByPrimaryKey(Integer id);

    /**
     * @param record
     * @param example
     * @return int
     */
    int updateByExampleSelective(@Param("record") RainfallStation record, @Param("example") RainfallStationCriteria example);

    /**
     * @param record
     * @param example
     * @return int
     */
    int updateByExample(@Param("record") RainfallStation record, @Param("example") RainfallStationCriteria example);

    /**
     * 根据主键更新值不为空的列 
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(RainfallStation record);

    /**
     * 根据主键更新 
     * @param record
     * @return int
     */
    int updateByPrimaryKey(RainfallStation record);
}