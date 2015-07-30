package com.soarcms.cms.dao.assist;

import java.util.List;

import com.soarcms.cms.entity.assist.CmsGuestbook;
import com.soarcms.common.hibernate3.Updater;
import com.soarcms.common.page.Pagination;

public interface CmsGuestbookDao {
	public Pagination getPage(Integer siteId, Integer ctgId,Integer userId, Boolean recommend,
			Boolean checked, boolean desc, boolean cacheable, int pageNo,
			int pageSize);
	
	public List<CmsGuestbook> getList(Integer siteId, Integer ctgId,
			Boolean recommend, Boolean checked, boolean desc,
			boolean cacheable, int first, int max);

	public CmsGuestbook findById(Integer id);

	public CmsGuestbook save(CmsGuestbook bean);

	public CmsGuestbook updateByUpdater(Updater<CmsGuestbook> updater);

	public CmsGuestbook deleteById(Integer id);
}