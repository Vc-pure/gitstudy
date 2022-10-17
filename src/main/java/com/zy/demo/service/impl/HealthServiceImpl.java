package com.zy.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zy.demo.mapper.HealthMapper;
import com.zy.demo.service.HealthService;
import com.zy.demo.service.IHealthService;
import com.zy.demo.vo.DataView;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HealthServiceImpl extends ServiceImpl<HealthMapper, DataView> implements HealthService, IHealthService {


    // TODO: 2022/10/11  Resource   Autowid  区别
    @Resource
    private HealthMapper healthMapper;


    @Override
    public int demo(int id) {
        return healthMapper.demo(id);
    }



    @Override
    public void demo2(int id) {
        healthMapper.demo2(id);

    }

    @Override
    public void demo3(int id) {
        healthMapper.demo3(id);
    }

    @Override
    public void demo4(int id,int id2) {
        healthMapper.demo4(id,id2);
    }


}
