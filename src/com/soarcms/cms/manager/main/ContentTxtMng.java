package com.soarcms.cms.manager.main;

import com.soarcms.cms.entity.main.Content;
import com.soarcms.cms.entity.main.ContentTxt;

public interface ContentTxtMng {
	public ContentTxt save(ContentTxt txt, Content content);

	public ContentTxt update(ContentTxt txt, Content content);
}