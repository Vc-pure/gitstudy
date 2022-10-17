package com.zy.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zy.demo.vo.DataView;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface HealthMapper extends BaseMapper<DataView> {

    @Select("select id from test where id = #{id}")
    int demo(int id);


    @Insert("insert into test(id) values (#{id}) ")
    void demo2(int id);

    @Delete("delete from test where id = #{id}")
    void demo3(int id);

    @Update("update test set id=#{id2} where id=#{id}")
    void demo4(int id,int id2);

}
