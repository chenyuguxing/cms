package com.soarcms.cms.manager.assist.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.soarcms.cms.dao.assist.CmsSiteAccessDao;
import com.soarcms.cms.entity.assist.CmsSiteAccess;
import com.soarcms.cms.entity.assist.CmsSiteAccessStatistic;
import com.soarcms.cms.manager.assist.CmsSiteAccessMng;
import com.soarcms.cms.manager.assist.CmsSiteAccessStatisticMng;
import com.soarcms.common.page.Pagination;
import com.soarcms.core.manager.CmsSiteMng;


import static com.soarcms.cms.entity.assist.CmsSiteAccessStatistic.STATISTIC_ALL;
import static com.soarcms.cms.entity.assist.CmsSiteAccessStatistic.STATISTIC_SOURCE;
import static com.soarcms.cms.entity.assist.CmsSiteAccessStatistic.STATISTIC_ENGINE;
import static com.soarcms.cms.entity.assist.CmsSiteAccessStatistic.STATISTIC_LINK;
import static com.soarcms.cms.entity.assist.CmsSiteAccessStatistic.STATISTIC_KEYWORD;
import static com.soarcms.cms.entity.assist.CmsSiteAccessStatistic.STATISTIC_AREA;

/**
 * @author Tom
 */
@Service
@Transactional
public class CmsSiteAccessMngImpl implements CmsSiteAccessMng {
	public void clearByDate(Date date) {
		dao.clearByDate(date);
	}

	public CmsSiteAccess saveOrUpdate(CmsSiteAccess access) {
		return dao.saveOrUpdate(access);
	}
	
	public Pagination findEnterPages(Integer siteId,Integer orderBy,Integer pageNo,Integer pageSize){
		return dao.findEnterPages(siteId, orderBy, pageNo, pageSize);
	}
	
	public CmsSiteAccess findAccessBySessionId(String sessionId) {
		return dao.findAccessBySessionId(sessionId);
	}
	
	public CmsSiteAccess findRecentAccess(Date  date,Integer siteId){
		return dao.findRecentAccess(date, siteId);
	}
	
	public void statisticByProperty(String property,Date date,Integer siteId){
		List<Object[]> resultes=new ArrayList<Object[]>();
		if(StringUtils.isBlank(property)){
			property=STATISTIC_ALL;
		}
		if(property.equals(STATISTIC_ALL)){
			resultes=dao.statisticByDay(date,siteId);
		}else if(property.equals(STATISTIC_AREA)){
			resultes=dao.statisticByArea(date,siteId);
		}else if(property.equals(STATISTIC_SOURCE)){
			resultes=dao.statisticBySource(date,siteId);
		}else if(property.equals(STATISTIC_ENGINE)){
			resultes=dao.statisticByEngine(date,siteId);
		}else if(property.equals(STATISTIC_LINK)){
			resultes=dao.statisticByLink(date,siteId);
		}else if(property.equals(STATISTIC_KEYWORD)){
			resultes=dao.statisticByKeyword(date,siteId);
		}
		for(Object object[]:resultes){
			CmsSiteAccessStatistic s=new CmsSiteAccessStatistic();
			Integer visitors=((Long)object[2]).intValue();
			s.setSite(cmsSiteMng.findById(siteId));
			s.setStatisticDate(date);
			s.setStatisitcType(property);
			s.setPv(((Long)object[0]).intValue());
			s.setIp(((Long)object[1]).intValue());
			s.setVisitors(visitors);
			s.setPagesAver(((Long)object[0]).intValue()/visitors);
			s.setVisitSecondAver(((Long)object[3]).intValue()/visitors);
			s.setStatisticColumnValue((String)object[4]);
			cmsAccessStatisticMng.save(s);
		}
	}
	
	public List<String> findPropertyValues(String property,Integer siteId){
		return dao.findPropertyValues(property, siteId);
	}
	
	public List<Object[]> statisticToday(Integer siteId,String area){
		return dao.statisticToday(siteId,area);
	}
	
	public List<Object[]> statisticVisitorCount(Date date,Integer siteId){
		return dao.statisticByPageCount(date,siteId);
	}
	
	public List<Object[]> statisticTodayByTarget(Integer siteId,Integer target,String statisticColumn,String statisticValue){
		return dao.statisticTodayByTarget(siteId, target, statisticColumn, statisticValue);
	}

	@Autowired
	private CmsSiteAccessDao dao;
	@Autowired
	private CmsSiteMng cmsSiteMng;
	@Autowired
	private CmsSiteAccessStatisticMng cmsAccessStatisticMng;
}
