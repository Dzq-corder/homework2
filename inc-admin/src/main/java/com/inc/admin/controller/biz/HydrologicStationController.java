package com.inc.admin.controller.biz;

import com.inc.admin.context.FilterContextHandler;
import com.inc.admin.domain.biz.HydrologicStation;
import com.inc.admin.domain.biz.Log;
import com.inc.admin.service.biz.HydrologicStationService;
import com.inc.admin.service.biz.LogService;
import com.inc.admin.utils.R;
import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

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
    @Resource
    private LogService logService;

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
        if(hydrologicStationService.insert(req)>0){
            Log log=new Log();
            log.setLogTime( new Date());
            log.setUserId(FilterContextHandler.getUserID());
            log.setLogMessage("insert into hydrologic_station");
            logService.insert(log);
            return R.operate(true);

        }
        else return R.operate(false);

    }

    /**
     * 更新 信息
     */
    @PostMapping("/update")
    public R update(@RequestBody HydrologicStation req) {

        if(hydrologicStationService.update(req)>0){
            Log log=new Log();
            log.setLogTime( new Date());
            log.setUserId(FilterContextHandler.getUserID());
            log.setLogMessage("update hydrologic_station");
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
        if(hydrologicStationService.delete(id)>0){
            Log log=new Log();
            log.setLogTime( new Date());
            log.setUserId(FilterContextHandler.getUserID());
            log.setLogMessage("delete from hydrologic_station");
            logService.insert(log);
            return R.operate(true);

        }
        else return R.operate(false);

    }
}