package com.zy.demo.entity;

import com.zy.demo.vo.DataView;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@ApiModel
public class R implements Serializable {

    private static final long serialVersionUID = 5928381829784554781L;

    public static DataView ok(Object obj){
        return ok(obj,"success");
    }
    public static  DataView ok(Object obj,String msg){
        return  new DataView(0,msg,obj);
    }

    public static DataView error(Object obj){
        return error(obj,"error");
    }
    public static DataView error(Object obj,String msg){
        return new DataView(1,msg,obj);
    }


}

//@AllArgsConstructor
//@Data
//class Message {
//    @ApiModelProperty("状态(0成功1错误2未登陆3刷新4重复提交)")
//    private Integer status;
//    @ApiModelProperty("错误信息")
//    private String msg = "操作成功";
//
//    private Object data;
//}
