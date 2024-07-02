package com.inc.admin.controller.biz;

import com.inc.admin.domain.biz.Log;
import com.inc.admin.service.biz.LogService;
import com.inc.admin.utils.R;
import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 管理 控制器
 * @author tanzibiao
 * @date 2024-07-02 19:09:37
*/
@RestController
@RequestMapping("/log")
public class LogController {
    @Resource
    private LogService logService;

    /**
     * 分页查询 列表
     */
    @PostMapping("/listByPage")
    public R listByPage(@RequestBody Log req) {
        return R.ok().put("page", logService.listByPage(req));
    }

    /**
     * 添加 信息
     */
    @PostMapping("/insert")
    public R insert(@RequestBody Log req) {
        return R.operate(logService.insert(req)>0);
    }

    /**
     * 更新 信息
     */
    @PostMapping("/update")
    public R update(@RequestBody Log req) {
        return R.operate(logService.update(req)>0);
    }

    /**
     * 删除 信息
     */
    @PostMapping("/delete")
    public R delete(@Validated @NotNull(message = "编号不能为空") @RequestParam("id") @RequestBody Integer id) {
        return R.operate(logService.delete(id)>0);
    }
}