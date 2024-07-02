package com.inc.admin.controller.biz;

import com.inc.admin.context.FilterContextHandler;
import com.inc.admin.domain.biz.Log;
import com.inc.admin.domain.biz.WaterSystemCode;
import com.inc.admin.service.biz.LogService;
import com.inc.admin.service.biz.WaterSystemCodeService;
import com.inc.admin.utils.R;
import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

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
    @Resource
    private LogService logService;
    /**
     * 根据编码查名称
     */
    @GetMapping("/getName")
    public R getName(@RequestParam String code) {
        return  R.ok((Object) waterSystemCodeService.getName(code));
    }

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
        if(waterSystemCodeService.insert(req)>0){
            Log log=new Log();
            log.setLogTime( new Date());
            log.setUserId(FilterContextHandler.getUserID());
            log.setLogMessage("insert into water_system_code");
            logService.insert(log);
            return R.operate(true);

        }
        else return R.operate(false);
    }

    /**
     * 更新 信息
     */
    @PostMapping("/update")
    public R update(@RequestBody WaterSystemCode req) {
        if(waterSystemCodeService.update(req)>0){
            Log log=new Log();
            log.setLogTime( new Date());
            log.setUserId(FilterContextHandler.getUserID());
            log.setLogMessage("update water_system_code");
            logService.insert(log);
            return R.operate(true);

        }
        else return R.operate(false);
    }

    /**
     * 删除 信息
     */
    @PostMapping("/delete")
    public R delete(@Validated @NotNull(message = "编号不能为空") @RequestParam("id") @RequestBody Integer id) {
        if(waterSystemCodeService.delete(id)>0){
            Log log=new Log();
            log.setLogTime( new Date());
            log.setUserId(FilterContextHandler.getUserID());
            log.setLogMessage("delete from water_system_code");
            logService.insert(log);
            return R.operate(true);

        }
        else return R.operate(false);
    }
}