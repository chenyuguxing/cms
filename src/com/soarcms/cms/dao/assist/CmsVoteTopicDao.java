package com.soarcms.cms.dao.assist;

import java.util.List;

import com.soarcms.cms.entity.assist.CmsVoteTopic;
import com.soarcms.common.hibernate3.Updater;
import com.soarcms.common.page.Pagination;

public interface CmsVoteTopicDao {
	public Pagination getPage(Integer siteId, int pageNo, int pageSize);
	
	public List<CmsVoteTopic> getList(Boolean def,Integer siteId, int count);

	public CmsVoteTopic getDefTopic(Integer siteId);

	public CmsVoteTopic findById(Integer id);

	public CmsVoteTopic save(CmsVoteTopic bean);

	public CmsVoteTopic updateByUpdater(Updater<CmsVoteTopic> updater);

	public CmsVoteTopic deleteById(Integer id);
}