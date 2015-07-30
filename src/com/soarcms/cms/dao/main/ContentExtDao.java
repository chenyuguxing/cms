package com.soarcms.cms.dao.main;

import com.soarcms.cms.entity.main.ContentExt;
import com.soarcms.common.hibernate3.Updater;

public interface ContentExtDao {
	public ContentExt findById(Integer id);

	public ContentExt save(ContentExt bean);

	public ContentExt updateByUpdater(Updater<ContentExt> updater);
}