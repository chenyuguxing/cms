package com.soarcms.cms.manager.assist;

import java.util.List;
import java.util.Map;

import com.soarcms.common.page.Pagination;
import com.soarcms.cms.entity.assist.CmsTask;

public interface CmsTaskMng {
	public Pagination getPage(Integer siteId,int pageNo, int pageSize);

	public List<CmsTask> getList();
	
	public CmsTask findById(Integer id);

	public CmsTask save(CmsTask bean);

	public CmsTask update(CmsTask bean,Map<String, String> attr);

	public CmsTask deleteById(Integer id);
	
	public CmsTask[] deleteByIds(Integer[] ids);

	public String getCronExpressionFromDB(Integer taskId);
}