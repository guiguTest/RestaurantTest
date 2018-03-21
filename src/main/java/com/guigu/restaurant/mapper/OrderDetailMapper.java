package com.guigu.restaurant.mapper;

import com.guigu.restaurant.po.OrderDetail;
import com.guigu.restaurant.po.OrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDetailMapper {
    int countByExample(OrderDetailExample example);

    int deleteByExample(OrderDetailExample example);

    int deleteByPrimaryKey(Integer detailId);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    List<OrderDetail> selectByExample(OrderDetailExample example);

    OrderDetail selectByPrimaryKey(Integer detailId);

    int updateByExampleSelective(@Param("record") OrderDetail record, @Param("example") OrderDetailExample example);

    int updateByExample(@Param("record") OrderDetail record, @Param("example") OrderDetailExample example);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
}