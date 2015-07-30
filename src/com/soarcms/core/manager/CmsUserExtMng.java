package com.soarcms.core.manager;

import com.soarcms.core.entity.CmsUser;
import com.soarcms.core.entity.CmsUserExt;

public interface CmsUserExtMng {
	public CmsUserExt save(CmsUserExt ext, CmsUser user);

	public CmsUserExt update(CmsUserExt ext, CmsUser user);
}