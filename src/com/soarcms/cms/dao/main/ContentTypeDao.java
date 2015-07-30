package com.soarcms.cms.dao.main;

import java.util.List;

import com.soarcms.cms.entity.main.ContentType;
import com.soarcms.common.hibernate3.Updater;

public interface ContentTypeDao {
	public List<ContentType> getList(boolean containDisabled);

	public ContentType getDef();

	public ContentType findById(Integer id);

	public ContentType save(ContentType bean);

	public ContentType updateByUpdater(Updater<ContentType> updater);

	public ContentType deleteById(Integer id);
}