package com.inc.admin.service.biz.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inc.admin.dao.biz.LogDao;
import com.inc.admin.domain.biz.Log;
import com.inc.admin.domain.biz.LogCriteria;
import com.inc.admin.service.biz.LogService;
import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service("logService")
public class LogServiceImpl implements LogService {
    @Resource
    private LogDao logDao;

    /**
     * 分页查询
     */
    @Override
    public PageInfo<Log> listByPage(Log req) {
        PageHelper.startPage(req.getPageNo(), req.getPageSize());
        LogCriteria condition = buildCondition(req);
        return new PageInfo<>(logDao.selectByExample(condition));
    }

    /**
     * 查询list
     */
    @Override
    public List<Log> getList(Log req) {
        return logDao.selectByExample(buildCondition(req));
    }

    /**
     * 单个查询
     */
    @Override
    public Log getOne(Log req) {
        List<Log> lst = getList(req);
        if (CollectionUtils.isEmpty(lst)) {
            return null;
        }
        return lst.get(0);
    }

    /**
     * 新增
     */
    @Override
    public int insert(Log req) {
        return logDao.insertSelective(req);
    }

    /**
     * 根据主键更新不为空的值
     */
    @Override
    public int update(Log req) {
        return logDao.updateByPrimaryKeySelective(req);
    }

    /**
     * 根据主键删除该记录
     */
    @Override
    public int delete(Integer id) {
        return logDao.deleteByPrimaryKey(id);
    }

    /**
     * 构建查询条件
     */
    private LogCriteria buildCondition(Log req) {
        LogCriteria logCriteria= new LogCriteria();
        LogCriteria.Criteria criteria = logCriteria.createCriteria();
        if (req != null) {
            if (req.getId() != null) {criteria.andIdEqualTo(req.getId());}
            if (StringUtils.isNotBlank(req.getUserId())) {criteria.andUserIdEqualTo(req.getUserId());}
            if (req.getLogTime() != null) {criteria.andLogTimeEqualTo(req.getLogTime());        }
        }
        return logCriteria;
    }
}