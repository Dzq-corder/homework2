package com.inc.admin.dao.biz;

import com.inc.admin.domain.biz.HydrologicStation;
import com.inc.admin.domain.biz.HydrologicStationCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HydrologicStationDao {
    /**
     * @param example
     * @return long
     */
    long countByExample(HydrologicStationCriteria example);

    /**
     * @param example
     * @return int
     */
    int deleteByExample(HydrologicStationCriteria example);

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
    int insert(HydrologicStation record);

    /**
     * 插入值不为空的列 
     * @param record
     * @return int
     */
    int insertSelective(HydrologicStation record);

    /**
     * @param example
     * @return java.util.List<com.inc.admin.domain.biz.HydrologicStation>
     */
    List<HydrologicStation> selectByExample(HydrologicStationCriteria example);

    /**
     * 根据主键查询 
     * @param id
     * @return com.inc.admin.domain.biz.HydrologicStation
     */
    HydrologicStation selectByPrimaryKey(Integer id);

    /**
     * @param record
     * @param example
     * @return int
     */
    int updateByExampleSelective(@Param("record") HydrologicStation record, @Param("example") HydrologicStationCriteria example);

    /**
     * @param record
     * @param example
     * @return int
     */
    int updateByExample(@Param("record") HydrologicStation record, @Param("example") HydrologicStationCriteria example);

    /**
     * 根据主键更新值不为空的列 
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(HydrologicStation record);

    /**
     * 根据主键更新 
     * @param record
     * @return int
     */
    int updateByPrimaryKey(HydrologicStation record);
}