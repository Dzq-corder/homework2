package com.inc.admin.dao.biz;

import com.inc.admin.domain.biz.WaterSystemCode;
import com.inc.admin.domain.biz.WaterSystemCodeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WaterSystemCodeDao {
    /**
     * @param example
     * @return long
     */
    long countByExample(WaterSystemCodeCriteria example);

    /**
     * @param example
     * @return int
     */
    int deleteByExample(WaterSystemCodeCriteria example);

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
    int insert(WaterSystemCode record);

    /**
     * 插入值不为空的列 
     * @param record
     * @return int
     */
    int insertSelective(WaterSystemCode record);

    /**
     * @param example
     * @return java.util.List<com.inc.admin.domain.biz.WaterSystemCode>
     */
    List<WaterSystemCode> selectByExample(WaterSystemCodeCriteria example);

    /**
     * 根据主键查询 
     * @param id
     * @return com.inc.admin.domain.biz.WaterSystemCode
     */
    WaterSystemCode selectByPrimaryKey(Integer id);

    /**
     * @param record
     * @param example
     * @return int
     */
    int updateByExampleSelective(@Param("record") WaterSystemCode record, @Param("example") WaterSystemCodeCriteria example);

    /**
     * @param record
     * @param example
     * @return int
     */
    int updateByExample(@Param("record") WaterSystemCode record, @Param("example") WaterSystemCodeCriteria example);

    /**
     * 根据主键更新值不为空的列 
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(WaterSystemCode record);

    /**
     * 根据主键更新 
     * @param record
     * @return int
     */
    int updateByPrimaryKey(WaterSystemCode record);

    /**
     * 根据code获取名称
     * @return
     */

    String getName(String code);
}