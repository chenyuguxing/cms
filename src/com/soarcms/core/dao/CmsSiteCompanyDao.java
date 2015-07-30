package com.soarcms.core.dao;

import com.soarcms.common.hibernate3.Updater;
import com.soarcms.core.entity.CmsSiteCompany;

public interface CmsSiteCompanyDao {

	public CmsSiteCompany save(CmsSiteCompany bean);

	public CmsSiteCompany updateByUpdater(Updater<CmsSiteCompany> updater);
}