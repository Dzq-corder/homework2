package com.inc.admin.controller.biz;

import com.inc.admin.domain.biz.WaterSystemCode;
import com.inc.admin.service.biz.WaterSystemCodeService;
import com.inc.admin.utils.R;
import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 管理 控制器
 * @author tanzibiao
 * @date 2024-07-01 21:12:45
*/
@RestController
@RequestMapping("/waterSystemCode")
public class WaterSystemCodeController {
    @Resource
    private WaterSystemCodeService waterSystemCodeService;

    /**
     * 分页查询 列表
     */
    @PostMapping("/listByPage")
    public R listByPage(@RequestBody WaterSystemCode req) {
        return R.ok().put("page", waterSystemCodeService.listByPage(req));
    }

    /**
     * 添加 信息
     */
    @PostMapping("/insert")
    public R insert(@RequestBody WaterSystemCode req) {
        return R.operate(waterSystemCodeService.insert(req)>0);
    }

    /**
     * 更新 信息
     */
    @PostMapping("/update")
    public R update(@RequestBody WaterSystemCode req) {
        return R.operate(waterSystemCodeService.update(req)>0);
    }

    /**
     * 删除 信息
     */
    @PostMapping("/delete")
    public R delete(@Validated @NotNull(message = "编号不能为空") @RequestParam("id") @RequestBody Integer id) {
        return R.operate(waterSystemCodeService.delete(id)>0);
    }
}