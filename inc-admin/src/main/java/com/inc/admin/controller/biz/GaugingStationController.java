package com.inc.admin.controller.biz;

import com.inc.admin.context.FilterContextHandler;
import com.inc.admin.domain.biz.GaugingStation;
import com.inc.admin.domain.biz.Log;
import com.inc.admin.service.biz.GaugingStationService;
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
 * @date 2024-07-01 20:53:01
*/
@RestController
@RequestMapping("/gaugingStation")
public class GaugingStationController {
    @Resource
    private GaugingStationService gaugingStationService;
    @Resource
    private LogService logService;

    /**
     * 分页查询 列表
     */
    @PostMapping("/listByPage")
    public R listByPage(@RequestBody GaugingStation req) {
        return R.ok().put("page", gaugingStationService.listByPage(req));
    }

    /**
     * 添加 信息
     */
    @PostMapping("/insert")
    public R insert(@RequestBody GaugingStation req) {
        if(gaugingStationService.insert(req)>0){
            Log log=new Log();
            log.setLogTime( new Date());
            log.setUserId(FilterContextHandler.getUserID());
            log.setLogMessage("insert into gauging_station");
            logService.insert(log);
            return R.operate(true);

        }
        else return R.operate(false);

    }

    /**
     * 更新 信息
     */
    @PostMapping("/update")
    public R update(@RequestBody GaugingStation req) {
        if(gaugingStationService.update(req)>0){
            Log log=new Log();
            log.setLogTime( new Date());
            log.setUserId(FilterContextHandler.getUserID());
            log.setLogMessage("update gauging_station");
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
        if(gaugingStationService.delete(id)>0){
            Log log=new Log();
            log.setLogTime( new Date());
            log.setUserId(FilterContextHandler.getUserID());
            log.setLogMessage("delete from gauging_station");
            logService.insert(log);
            return R.operate(true);

        }
        else return R.operate(false);
    }
}