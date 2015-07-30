package com.soarcms.cms.manager.main.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.soarcms.cms.dao.main.ContentCheckDao;
import com.soarcms.cms.entity.main.Content;
import com.soarcms.cms.entity.main.ContentCheck;
import com.soarcms.cms.manager.main.ContentCheckMng;
import com.soarcms.common.hibernate3.Updater;

@Service
@Transactional
public class ContentCheckMngImpl implements ContentCheckMng {
	public ContentCheck save(ContentCheck check, Content content) {
		check.setContent(content);
		check.init();
		dao.save(check);
		content.setContentCheck(check);
		return check;
	}

	public ContentCheck update(ContentCheck bean) {
		Updater<ContentCheck> updater = new Updater<ContentCheck>(bean);
		bean = dao.updateByUpdater(updater);
		return bean;
	}

	private ContentCheckDao dao;

	@Autowired
	public void setDao(ContentCheckDao dao) {
		this.dao = dao;
	}
}