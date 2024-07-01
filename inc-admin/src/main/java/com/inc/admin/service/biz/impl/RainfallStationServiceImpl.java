package com.inc.admin.service.biz.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inc.admin.dao.biz.RainfallStationDao;
import com.inc.admin.domain.biz.RainfallStation;
import com.inc.admin.domain.biz.RainfallStationCriteria;
import com.inc.admin.service.biz.RainfallStationService;
import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service("rainfallStationService")
public class RainfallStationServiceImpl implements RainfallStationService {
    @Resource
    private RainfallStationDao rainfallStationDao;

    /**
     * 分页查询
     */
    @Override
    public PageInfo<RainfallStation> listByPage(RainfallStation req) {
        PageHelper.startPage(req.getPageNo(), req.getPageSize());
        RainfallStationCriteria condition = buildCondition(req);
        return new PageInfo<>(rainfallStationDao.selectByExample(condition));
    }

    /**
     * 查询list
     */
    @Override
    public List<RainfallStation> getList(RainfallStation req) {
        return rainfallStationDao.selectByExample(buildCondition(req));
    }

    /**
     * 单个查询
     */
    @Override
    public RainfallStation getOne(RainfallStation req) {
        List<RainfallStation> lst = getList(req);
        if (CollectionUtils.isEmpty(lst)) {
            return null;
        }
        return lst.get(0);
    }

    /**
     * 新增
     */
    @Override
    public int insert(RainfallStation req) {
        return rainfallStationDao.insertSelective(req);
    }

    /**
     * 根据主键更新不为空的值
     */
    @Override
    public int update(RainfallStation req) {
        return rainfallStationDao.updateByPrimaryKeySelective(req);
    }

    /**
     * 根据主键删除该记录
     */
    @Override
    public int delete(Integer id) {
        return rainfallStationDao.deleteByPrimaryKey(id);
    }

    /**
     * 构建查询条件
     */
    private RainfallStationCriteria buildCondition(RainfallStation req) {
        RainfallStationCriteria rainfallStationCriteria= new RainfallStationCriteria();
        RainfallStationCriteria.Criteria criteria = rainfallStationCriteria.createCriteria();
        if (req != null) {
            if (req.getId() != null) {criteria.andIdEqualTo(req.getId());}
            if (StringUtils.isNotBlank(req.gethName())) {criteria.andHNameEqualTo(req.gethName());}
            if (StringUtils.isNotBlank(req.gethCode())) {criteria.andHCodeEqualTo(req.gethCode());}
            if (StringUtils.isNotBlank(req.getrSystem())) {criteria.andRSystemEqualTo(req.getrSystem());}
            if (req.getLongitude() != null) {criteria.andLongitudeEqualTo(req.getLongitude());        }
            if (req.getLatitude() != null) {criteria.andLatitudeEqualTo(req.getLatitude());        }
            if (req.getAvgFall() != null) {criteria.andAvgFallEqualTo(req.getAvgFall());        }
            if (req.getMaxFall() != null) {criteria.andMaxFallEqualTo(req.getMaxFall());        }
        }
        return rainfallStationCriteria;
    }
}