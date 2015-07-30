package com.soarcms.cms.dao.assist;

import com.soarcms.cms.entity.assist.CmsVoteReply;
import com.soarcms.common.hibernate3.Updater;
import com.soarcms.common.page.Pagination;

public interface CmsVoteReplyDao {

	public Pagination getPage(Integer  subTopicId, int pageNo, int pageSize);
	
	public CmsVoteReply findById(Integer id);

	public CmsVoteReply save(CmsVoteReply bean);

	public CmsVoteReply updateByUpdater(Updater<CmsVoteReply> updater);

	public CmsVoteReply deleteById(Integer id);
}