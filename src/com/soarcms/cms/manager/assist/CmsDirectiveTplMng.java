package com.soarcms.cms.manager.assist;

import java.util.List;

import com.soarcms.common.page.Pagination;
import com.soarcms.cms.entity.assist.CmsDirectiveTpl;

public interface CmsDirectiveTplMng {
	public Pagination getPage(int pageNo, int pageSize);
	
	public List<CmsDirectiveTpl> getList(int count);

	public CmsDirectiveTpl findById(Integer id);

	public CmsDirectiveTpl save(CmsDirectiveTpl bean);

	public CmsDirectiveTpl update(CmsDirectiveTpl bean);

	public CmsDirectiveTpl deleteById(Integer id);
	
	public CmsDirectiveTpl[] deleteByIds(Integer[] ids);
}