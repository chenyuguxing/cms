package com.soarcms.cms.dao.main;

import com.soarcms.cms.entity.main.ContentCheck;
import com.soarcms.common.hibernate3.Updater;

public interface ContentCheckDao {
	public ContentCheck findById(Long id);

	public ContentCheck save(ContentCheck bean);

	public ContentCheck updateByUpdater(Updater<ContentCheck> updater);
}