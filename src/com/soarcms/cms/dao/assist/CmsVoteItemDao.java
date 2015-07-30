package com.soarcms.cms.dao.assist;

import com.soarcms.cms.entity.assist.CmsVoteItem;
import com.soarcms.common.hibernate3.Updater;
import com.soarcms.common.page.Pagination;

public interface CmsVoteItemDao {
	public Pagination getPage(int pageNo, int pageSize);

	public CmsVoteItem findById(Integer id);

	public CmsVoteItem save(CmsVoteItem bean);

	public CmsVoteItem updateByUpdater(Updater<CmsVoteItem> updater);

	public CmsVoteItem deleteById(Integer id);
}