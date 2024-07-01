package com.inc.admin.controller.biz;

import com.inc.admin.domain.biz.RainfallStation;
import com.inc.admin.service.biz.RainfallStationService;
import com.inc.admin.utils.R;
import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 管理 控制器
 * @author tanzibiao
 * @date 2024-07-01 20:32:25
*/
@RestController
@RequestMapping("/rainfallStation")
public class RainfallStationController {
    @Resource
    private RainfallStationService rainfallStationService;

    /**
     * 分页查询 列表
     */
    @PostMapping("/listByPage")
    public R listByPage(@RequestBody RainfallStation req) {
        return R.ok().put("page", rainfallStationService.listByPage(req));
    }

    /**
     * 添加 信息
     */
    @PostMapping("/insert")
    public R insert(@RequestBody RainfallStation req) {
        return R.operate(rainfallStationService.insert(req)>0);
    }

    /**
     * 更新 信息
     */
    @PostMapping("/update")
    public R update(@RequestBody RainfallStation req) {
        return R.operate(rainfallStationService.update(req)>0);
    }

    /**
     * 删除 信息
     */
    @PostMapping("/delete")
    public R delete(@Validated @NotNull(message = "编号不能为空") @RequestParam("id") @RequestBody Integer id) {
        return R.operate(rainfallStationService.delete(id)>0);
    }
}