package com.soarcms.core.manager;

import com.soarcms.core.entity.CmsUser;
import com.soarcms.core.entity.CmsUserResume;

public interface CmsUserResumeMng {
	public CmsUserResume save(CmsUserResume ext, CmsUser user);

	public CmsUserResume update(CmsUserResume ext, CmsUser user);
}