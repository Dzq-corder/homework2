package com.inc.admin.service.biz.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inc.admin.dao.biz.HydrologicStationDao;
import com.inc.admin.domain.biz.HydrologicStation;
import com.inc.admin.domain.biz.HydrologicStationCriteria;
import com.inc.admin.service.biz.HydrologicStationService;
import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service("hydrologicStationService")
public class HydrologicStationServiceImpl implements HydrologicStationService {
    @Resource
    private HydrologicStationDao hydrologicStationDao;

    /**
     * 分页查询
     */
    @Override
    public PageInfo<HydrologicStation> listByPage(HydrologicStation req) {
        PageHelper.startPage(req.getPageNo(), req.getPageSize());
        HydrologicStationCriteria condition = buildCondition(req);
        return new PageInfo<>(hydrologicStationDao.selectByExample(condition));
    }

    /**
     * 查询list
     */
    @Override
    public List<HydrologicStation> getList(HydrologicStation req) {
        return hydrologicStationDao.selectByExample(buildCondition(req));
    }

    /**
     * 单个查询
     */
    @Override
    public HydrologicStation getOne(HydrologicStation req) {
        List<HydrologicStation> lst = getList(req);
        if (CollectionUtils.isEmpty(lst)) {
            return null;
        }
        return lst.get(0);
    }

    /**
     * 新增
     */
    @Override
    public int insert(HydrologicStation req) {
        return hydrologicStationDao.insertSelective(req);
    }

    /**
     * 根据主键更新不为空的值
     */
    @Override
    public int update(HydrologicStation req) {
        return hydrologicStationDao.updateByPrimaryKeySelective(req);
    }

    /**
     * 根据主键删除该记录
     */
    @Override
    public int delete(Integer id) {
        return hydrologicStationDao.deleteByPrimaryKey(id);
    }

    /**
     * 构建查询条件
     */
    private HydrologicStationCriteria buildCondition(HydrologicStation req) {
        HydrologicStationCriteria hydrologicStationCriteria= new HydrologicStationCriteria();
        HydrologicStationCriteria.Criteria criteria = hydrologicStationCriteria.createCriteria();
        if (req != null) {
            if (req.getId() != null) {criteria.andIdEqualTo(req.getId());}
            if (StringUtils.isNotBlank(req.gethName())) {criteria.andHNameEqualTo(req.gethName());}
            if (StringUtils.isNotBlank(req.gethCode())) {criteria.andHCodeEqualTo(req.gethCode());}
            if (StringUtils.isNotBlank(req.getrSystem())) {criteria.andRSystemEqualTo(req.getrSystem());}
            if (req.getLongitude() != null) {criteria.andLongitudeEqualTo(req.getLongitude());        }
            if (req.getLatitude() != null) {criteria.andLatitudeEqualTo(req.getLatitude());        }
            if (req.getMeanAnnualRunoff() != null) {criteria.andMeanAnnualRunoffEqualTo(req.getMeanAnnualRunoff());        }
            if (req.getMaximumDischarge() != null) {criteria.andMaximumDischargeEqualTo(req.getMaximumDischarge());        }
            if (req.getMaximumTime() != null) {criteria.andMaximumTimeEqualTo(req.getMaximumTime());        }
            if (req.getMinimumDischarge() != null) {criteria.andMinimumDischargeEqualTo(req.getMinimumDischarge());        }
            if (req.getMinimumTime() != null) {criteria.andMinimumTimeEqualTo(req.getMinimumTime());        }
        }
        return hydrologicStationCriteria;
    }
}