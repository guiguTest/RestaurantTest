package com.guigu.restaurant.data.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.restaurant.data.service.DataDictorytionService;
import com.guigu.restaurant.mapper.DataDictorytionMapper;
import com.guigu.restaurant.po.DataDictorytion;
import com.guigu.restaurant.po.DataDictorytionExample;
import com.guigu.restaurant.po.DataDictorytionExample.Criteria;
@Service("dataDictorytionServiceImpl")
public class DataDictorytionServiceImpl implements DataDictorytionService{

	@Resource(name="dataDictorytionMapper")
	private DataDictorytionMapper dataDictorytionMapper;
	@Override
	public List<DataDictorytion> findDataDictorytion(DataDictorytion dataDictorytion) {
		DataDictorytionExample dataDictorytionExample=new DataDictorytionExample();
		Criteria criteria=dataDictorytionExample.createCriteria();
		if(dataDictorytion!=null) {
			if(dataDictorytion.getDataNote()!=null) {
				criteria.andDataNoteLike("%"+dataDictorytion.getDataNote()+"%");
			}
			if(dataDictorytion.getDataDetail()!=null) {
				criteria.andDataDetailLike("%"+dataDictorytion.getDataDetail()+"%");
			}
		}
		return dataDictorytionMapper.selectByExample(dataDictorytionExample);
	}

	@Override
	public boolean addDataDictorytion(DataDictorytion dataDictorytion) {
		int i=dataDictorytionMapper.insertSelective(dataDictorytion);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateDataDictorytion(DataDictorytion dataDictorytion) {
		int i=dataDictorytionMapper.updateByPrimaryKeySelective(dataDictorytion);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteDataDictorytion(Integer dataDictorytionId) {
		int i=dataDictorytionMapper.deleteByPrimaryKey(dataDictorytionId);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public DataDictorytion findDataDictorytionById(Integer dataDictorytionId) {
		return dataDictorytionMapper.selectByPrimaryKey(dataDictorytionId);
	}

}
