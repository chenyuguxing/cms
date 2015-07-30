package com.soarcms.cms.dao.main;

import com.soarcms.cms.entity.main.ContentTxt;
import com.soarcms.common.hibernate3.Updater;

public interface ContentTxtDao {
	public ContentTxt findById(Integer id);

	public ContentTxt save(ContentTxt bean);

	public ContentTxt updateByUpdater(Updater<ContentTxt> updater);
}