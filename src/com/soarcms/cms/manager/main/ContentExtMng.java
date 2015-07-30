package com.soarcms.cms.manager.main;

import com.soarcms.cms.entity.main.Content;
import com.soarcms.cms.entity.main.ContentExt;

public interface ContentExtMng {
	public ContentExt save(ContentExt ext, Content content);

	public ContentExt update(ContentExt ext);
}