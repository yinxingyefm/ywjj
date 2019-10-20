package com.electricity.dao;



public class Jsonservice {
	private DataDealDao dao=new DataDealDaoIml();
	//获取Json柱状图(一个季度 一个指标 所有城市的值)
	
	public String getBarChart(int timeid,int indexid){
		return dao.JsongetAllCityIndexTime(timeid, indexid);
	}
	//获取Json折线图(所有城市 一个指标 所有季度 )
	public String getLineChart(int indexid){
		
		return dao.JsonAllTimeAllCityIndex(indexid);
	}
	//获取四大模块得分的Json数据
    public String getFourModual(int timeid){
    	return dao.getJsonAllModuleVAlue(timeid);
    }
    //获取每个模块下的各个指标Json
    public String getIndexForOneModual(int moduleid,int timeid){
    	return dao.getJsonIndexFromModule(moduleid, timeid);
    }
   
    
}
