package com.soarcms.core.dao;

import com.soarcms.common.hibernate3.Updater;
import com.soarcms.core.entity.CmsUserResume;

public interface CmsUserResumeDao {
	public CmsUserResume findById(Integer id);

	public CmsUserResume save(CmsUserResume bean);

	public CmsUserResume updateByUpdater(Updater<CmsUserResume> updater);
}