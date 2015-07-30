package com.soarcms.core.dao;

import com.soarcms.common.hibernate3.Updater;
import com.soarcms.core.entity.CmsConfig;

public interface CmsConfigDao {
	public CmsConfig findById(Integer id);

	public CmsConfig updateByUpdater(Updater<CmsConfig> updater);
}