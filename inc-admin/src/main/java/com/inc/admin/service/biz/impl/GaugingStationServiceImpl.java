package com.inc.admin.service.biz.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.inc.admin.dao.biz.GaugingStationDao;
import com.inc.admin.domain.biz.GaugingStation;
import com.inc.admin.domain.biz.GaugingStationCriteria;
import com.inc.admin.service.biz.GaugingStationService;
import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service("gaugingStationService")
public class GaugingStationServiceImpl implements GaugingStationService {
    @Resource
    private GaugingStationDao gaugingStationDao;

    /**
     * 分页查询
     */
    @Override
    public PageInfo<GaugingStation> listByPage(GaugingStation req) {
        PageHelper.startPage(req.getPageNo(), req.getPageSize());
        GaugingStationCriteria condition = buildCondition(req);
        return new PageInfo<>(gaugingStationDao.selectByExample(condition));
    }

    /**
     * 查询list
     */
    @Override
    public List<GaugingStation> getList(GaugingStation req) {
        return gaugingStationDao.selectByExample(buildCondition(req));
    }

    /**
     * 单个查询
     */
    @Override
    public GaugingStation getOne(GaugingStation req) {
        List<GaugingStation> lst = getList(req);
        if (CollectionUtils.isEmpty(lst)) {
            return null;
        }
        return lst.get(0);
    }

    /**
     * 新增
     */
    @Override
    public int insert(GaugingStation req) {
        return gaugingStationDao.insertSelective(req);
    }

    /**
     * 根据主键更新不为空的值
     */
    @Override
    public int update(GaugingStation req) {
        return gaugingStationDao.updateByPrimaryKeySelective(req);
    }

    /**
     * 根据主键删除该记录
     */
    @Override
    public int delete(Integer id) {
        return gaugingStationDao.deleteByPrimaryKey(id);
    }

    /**
     * 构建查询条件
     */
    private GaugingStationCriteria buildCondition(GaugingStation req) {
        GaugingStationCriteria gaugingStationCriteria= new GaugingStationCriteria();
        GaugingStationCriteria.Criteria criteria = gaugingStationCriteria.createCriteria();
        if (req != null) {
            if (req.getId() != null) {criteria.andIdEqualTo(req.getId());}
            if (StringUtils.isNotBlank(req.gethName())) {criteria.andHNameEqualTo(req.gethName());}
            if (StringUtils.isNotBlank(req.gethCode())) {criteria.andHCodeEqualTo(req.gethCode());}
            if (StringUtils.isNotBlank(req.getrSystem())) {criteria.andRSystemEqualTo(req.getrSystem());}
            if (req.getLongitude() != null) {criteria.andLongitudeEqualTo(req.getLongitude());        }
            if (req.getLatitude() != null) {criteria.andLatitudeEqualTo(req.getLatitude());        }
            if (req.getHighestWaterLevel() != null) {criteria.andHighestWaterLevelEqualTo(req.getHighestWaterLevel());        }
            if (req.getHighestWaterTime() != null) {criteria.andHighestWaterTimeEqualTo(req.getHighestWaterTime());        }
            if (req.getLowWaterLevel() != null) {criteria.andLowWaterLevelEqualTo(req.getLowWaterLevel());        }
            if (req.getLowWaterTime() != null) {criteria.andLowWaterTimeEqualTo(req.getLowWaterTime());        }
        }
        return gaugingStationCriteria;
    }
}