package com.inc.admin.controller.biz;

import com.inc.admin.domain.biz.HydrologicStation;
import com.inc.admin.service.biz.HydrologicStationService;
import com.inc.admin.utils.R;
import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 管理 控制器
 * @author tanzibiao
 * @date 2024-07-01 21:00:08
*/
@RestController
@RequestMapping("/hydrologicStation")
public class HydrologicStationController {
    @Resource
    private HydrologicStationService hydrologicStationService;

    /**
     * 分页查询 列表
     */
    @PostMapping("/listByPage")
    public R listByPage(@RequestBody HydrologicStation req) {
        return R.ok().put("page", hydrologicStationService.listByPage(req));
    }

    /**
     * 添加 信息
     */
    @PostMapping("/insert")
    public R insert(@RequestBody HydrologicStation req) {
        return R.operate(hydrologicStationService.insert(req)>0);
    }

    /**
     * 更新 信息
     */
    @PostMapping("/update")
    public R update(@RequestBody HydrologicStation req) {
        return R.operate(hydrologicStationService.update(req)>0);
    }

    /**
     * 删除 信息
     */
    @PostMapping("/delete")
    public R delete(@Validated @NotNull(message = "编号不能为空") @RequestParam("id") @RequestBody Integer id) {
        return R.operate(hydrologicStationService.delete(id)>0);
    }
}