package com.soarcms.cms.dao.assist;

import java.util.Date;

import com.soarcms.cms.entity.assist.CmsSiteAccessPages;
import com.soarcms.common.hibernate3.Updater;
import com.soarcms.common.page.Pagination;

/**
 * @author Tom
 */
public interface CmsSiteAccessPagesDao {

	public CmsSiteAccessPages findAccessPage(String sessionId, Integer pageIndex);
	
	public Pagination findPages(Integer siteId,Integer orderBy,Integer pageNo,Integer pageSize);

	public CmsSiteAccessPages save(CmsSiteAccessPages access);

	public CmsSiteAccessPages updateByUpdater(Updater<CmsSiteAccessPages> updater);

	public void clearByDate(Date date);

}
