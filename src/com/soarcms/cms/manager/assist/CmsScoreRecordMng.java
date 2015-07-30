package com.soarcms.cms.manager.assist;

import java.util.Map;

import com.soarcms.common.page.Pagination;
import com.soarcms.cms.entity.assist.CmsScoreRecord;

public interface CmsScoreRecordMng {
	public Pagination getPage(int pageNo, int pageSize);
	
	public Map<String,String> viewContent(Integer contentId);

	public int contentScore(Integer contentId,Integer itemId);
	
	public CmsScoreRecord findByScoreItemContent(Integer itemId,Integer contentId);

	public CmsScoreRecord findById(Integer id);

	public CmsScoreRecord save(CmsScoreRecord bean);

	public CmsScoreRecord update(CmsScoreRecord bean);

	public CmsScoreRecord deleteById(Integer id);
	
	public CmsScoreRecord[] deleteByIds(Integer[] ids);
}