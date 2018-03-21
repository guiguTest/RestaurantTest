package com.guigu.restaurant.mapper;

import com.guigu.restaurant.po.DataDictorytion;
import com.guigu.restaurant.po.DataDictorytionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataDictorytionMapper {
    int countByExample(DataDictorytionExample example);

    int deleteByExample(DataDictorytionExample example);

    int deleteByPrimaryKey(Integer dataId);

    int insert(DataDictorytion record);

    int insertSelective(DataDictorytion record);

    List<DataDictorytion> selectByExample(DataDictorytionExample example);

    DataDictorytion selectByPrimaryKey(Integer dataId);

    int updateByExampleSelective(@Param("record") DataDictorytion record, @Param("example") DataDictorytionExample example);

    int updateByExample(@Param("record") DataDictorytion record, @Param("example") DataDictorytionExample example);

    int updateByPrimaryKeySelective(DataDictorytion record);

    int updateByPrimaryKey(DataDictorytion record);
}