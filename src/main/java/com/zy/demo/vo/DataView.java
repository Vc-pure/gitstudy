package com.zy.demo.vo;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.QueryChainWrapper;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataView  {
    @ApiModelProperty("状态(0成功1错误2未登陆3刷新4重复提交)")
    private Integer Status=0;
    private String  msg = "操作成功";
    private Object  data;


}
