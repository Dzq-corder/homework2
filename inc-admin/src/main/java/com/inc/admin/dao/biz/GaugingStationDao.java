package com.inc.admin.dao.biz;

import com.inc.admin.domain.biz.GaugingStation;
import com.inc.admin.domain.biz.GaugingStationCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GaugingStationDao {
    /**
     * @param example
     * @return long
     */
    long countByExample(GaugingStationCriteria example);

    /**
     * @param example
     * @return int
     */
    int deleteByExample(GaugingStationCriteria example);

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
    int insert(GaugingStation record);

    /**
     * 插入值不为空的列 
     * @param record
     * @return int
     */
    int insertSelective(GaugingStation record);

    /**
     * @param example
     * @return java.util.List<com.inc.admin.domain.biz.GaugingStation>
     */
    List<GaugingStation> selectByExample(GaugingStationCriteria example);

    /**
     * 根据主键查询 
     * @param id
     * @return com.inc.admin.domain.biz.GaugingStation
     */
    GaugingStation selectByPrimaryKey(Integer id);

    /**
     * @param record
     * @param example
     * @return int
     */
    int updateByExampleSelective(@Param("record") GaugingStation record, @Param("example") GaugingStationCriteria example);

    /**
     * @param record
     * @param example
     * @return int
     */
    int updateByExample(@Param("record") GaugingStation record, @Param("example") GaugingStationCriteria example);

    /**
     * 根据主键更新值不为空的列 
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(GaugingStation record);

    /**
     * 根据主键更新 
     * @param record
     * @return int
     */
    int updateByPrimaryKey(GaugingStation record);
}