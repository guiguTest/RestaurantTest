package com.guigu.restaurant.data.service;

import java.util.List;

import com.guigu.restaurant.po.DataDictorytion;

public interface DataDictorytionService {
	
	public List<DataDictorytion> findDataDictorytion(DataDictorytion dataDictorytion);
	
	public boolean addDataDictorytion(DataDictorytion dataDictorytion);
	
	public boolean updateDataDictorytion(DataDictorytion dataDictorytion);
	
	public boolean deleteDataDictorytion(Integer dataDictorytionId);
	
	public DataDictorytion findDataDictorytionById(Integer dataDictorytionId);
}
