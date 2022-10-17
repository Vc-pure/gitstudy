package com.zy.demo.controller;

import com.zy.demo.entity.R;
import com.zy.demo.entity.TestSo;
import com.zy.demo.service.HealthService;
import com.zy.demo.service.IHealthService;
import com.zy.demo.vo.DataView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.crypto.Data;
@Controller
class HealthController {


    @Autowired
    private HealthService healthservice;

    @Autowired
    private IHealthService ihealthservice;

    @RequestMapping("/health")
    @ResponseBody
    public DataView selectHealth(){
//        r.ok("health");
//        r.error("not health");

        DataView dataView = new DataView();
        healthservice.query();
        dataView.setStatus(200);
        dataView.setData("health");
        dataView.setMsg("success");
        return dataView;
    }

    // TODO: 2022/10/11
    //  controller(控制层  前后端交互  1、接收参数；2、验证参数)
    //  service（业务逻辑 ）
    //  dao/mapper（数据库交互）
    //  命名规范（驼峰）、
    @GetMapping("/demo")
    @ResponseBody
    public DataView demo(Integer id){
        int demo = ihealthservice.demo(id);
        return R.ok(demo);
    }


    @GetMapping("/demo2")
    @ResponseBody
    public String demo2(Integer id){
        ihealthservice.demo2(id);
        return "插入成功";
    }

    @GetMapping("/demo3")
    @ResponseBody
    public String demo3(Integer id){
        ihealthservice.demo3(id);
        return "删除成功";
    }

    @GetMapping("/demo4")
    @ResponseBody
    public String demo4(TestSo testSo){
        ihealthservice.demo4(testSo.getId(),testSo.getId2());
        return "更新成功";
    }



}
