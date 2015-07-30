package com.soarcms.cms.dao.assist;

import com.soarcms.common.hibernate3.Updater;
import com.soarcms.common.page.Pagination;
import com.soarcms.cms.entity.assist.CmsScoreItem;

public interface CmsScoreItemDao {
	public Pagination getPage(Integer groupId,int pageNo, int pageSize);

	public CmsScoreItem findById(Integer id);

	public CmsScoreItem save(CmsScoreItem bean);

	public CmsScoreItem updateByUpdater(Updater<CmsScoreItem> updater);

	public CmsScoreItem deleteById(Integer id);
}