package com.soarcms.core.dao.impl;

import org.springframework.stereotype.Repository;

import com.soarcms.common.hibernate3.HibernateBaseDao;
import com.soarcms.core.dao.CmsConfigDao;
import com.soarcms.core.entity.CmsConfig;

@Repository
public class CmsConfigDaoImpl extends HibernateBaseDao<CmsConfig, Integer>
		implements CmsConfigDao {
	public CmsConfig findById(Integer id) {
		CmsConfig entity = get(id);
		return entity;
	}

	@Override
	protected Class<CmsConfig> getEntityClass() {
		return CmsConfig.class;
	}
}