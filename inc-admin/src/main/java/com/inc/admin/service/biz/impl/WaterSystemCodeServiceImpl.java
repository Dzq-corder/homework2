package com.inc.admin.service.biz.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inc.admin.dao.biz.WaterSystemCodeDao;
import com.inc.admin.domain.biz.WaterSystemCode;
import com.inc.admin.domain.biz.WaterSystemCodeCriteria;
import com.inc.admin.service.biz.WaterSystemCodeService;
import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service("waterSystemCodeService")
public class WaterSystemCodeServiceImpl implements WaterSystemCodeService {
    @Resource
    private WaterSystemCodeDao waterSystemCodeDao;

    /**
     * 分页查询
     */
    @Override
    public PageInfo<WaterSystemCode> listByPage(WaterSystemCode req) {
        PageHelper.startPage(req.getPageNo(), req.getPageSize());
        WaterSystemCodeCriteria condition = buildCondition(req);
        return new PageInfo<>(waterSystemCodeDao.selectByExample(condition));
    }

    /**
     * 查询list
     */
    @Override
    public List<WaterSystemCode> getList(WaterSystemCode req) {
        return waterSystemCodeDao.selectByExample(buildCondition(req));
    }

    /**
     * 单个查询
     */
    @Override
    public WaterSystemCode getOne(WaterSystemCode req) {
        List<WaterSystemCode> lst = getList(req);
        if (CollectionUtils.isEmpty(lst)) {
            return null;
        }
        return lst.get(0);
    }

    /**
     * 新增
     */
    @Override
    public int insert(WaterSystemCode req) {
        return waterSystemCodeDao.insertSelective(req);
    }

    /**
     * 根据主键更新不为空的值
     */
    @Override
    public int update(WaterSystemCode req) {
        return waterSystemCodeDao.updateByPrimaryKeySelective(req);
    }

    /**
     * 根据主键删除该记录
     */
    @Override
    public int delete(Integer id) {
        return waterSystemCodeDao.deleteByPrimaryKey(id);
    }

    /**
     * 构建查询条件
     */
    private WaterSystemCodeCriteria buildCondition(WaterSystemCode req) {
        WaterSystemCodeCriteria waterSystemCodeCriteria= new WaterSystemCodeCriteria();
        WaterSystemCodeCriteria.Criteria criteria = waterSystemCodeCriteria.createCriteria();
        if (req != null) {
            if (req.getId() != null) {criteria.andIdEqualTo(req.getId());}
            if (StringUtils.isNotBlank(req.getCode())) {criteria.andCodeEqualTo(req.getCode());}
            if (StringUtils.isNotBlank(req.getName())) {criteria.andNameEqualTo(req.getName());}
        }
        return waterSystemCodeCriteria;
    }
}