package com.guigu.restaurant.mapper;

import com.guigu.restaurant.po.Staff;
import com.guigu.restaurant.po.StaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffMapper {
    int countByExample(StaffExample example);

    int deleteByExample(StaffExample example);

    int deleteByPrimaryKey(Integer staffId);

    int insert(Staff record);

    int insertSelective(Staff record);

    List<Staff> selectByExample(StaffExample example);

    Staff selectByPrimaryKey(Integer staffId);

    int updateByExampleSelective(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByExample(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
}