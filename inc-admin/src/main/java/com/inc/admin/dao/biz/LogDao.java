package com.inc.admin.dao.biz;

import com.inc.admin.domain.biz.Log;
import com.inc.admin.domain.biz.LogCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LogDao {
    /**
     * @param example
     * @return long
     */
    long countByExample(LogCriteria example);

    /**
     * @param example
     * @return int
     */
    int deleteByExample(LogCriteria example);

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
    int insert(Log record);

    /**
     * 插入值不为空的列 
     * @param record
     * @return int
     */
    int insertSelective(Log record);

    /**
     * @param example
     * @return java.util.List<com.inc.admin.domain.biz.Log>
     */
    List<Log> selectByExampleWithBLOBs(LogCriteria example);

    /**
     * @param example
     * @return java.util.List<com.inc.admin.domain.biz.Log>
     */
    List<Log> selectByExample(LogCriteria example);

    /**
     * 根据主键查询 
     * @param id
     * @return com.inc.admin.domain.biz.Log
     */
    Log selectByPrimaryKey(Integer id);

    /**
     * @param record
     * @param example
     * @return int
     */
    int updateByExampleSelective(@Param("record") Log record, @Param("example") LogCriteria example);

    /**
     * @param record
     * @param example
     * @return int
     */
    int updateByExampleWithBLOBs(@Param("record") Log record, @Param("example") LogCriteria example);

    /**
     * @param record
     * @param example
     * @return int
     */
    int updateByExample(@Param("record") Log record, @Param("example") LogCriteria example);

    /**
     * 根据主键更新值不为空的列 
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(Log record);

    /**
     * @param record
     * @return int
     */
    int updateByPrimaryKeyWithBLOBs(Log record);

    /**
     * 根据主键更新 
     * @param record
     * @return int
     */
    int updateByPrimaryKey(Log record);
}