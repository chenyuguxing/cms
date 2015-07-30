package com.soarcms.core.manager;

import com.soarcms.core.entity.CmsSite;
import com.soarcms.core.entity.CmsSiteCompany;

public interface CmsSiteCompanyMng {
	public CmsSiteCompany save(CmsSite site,CmsSiteCompany bean);

	public CmsSiteCompany update(CmsSiteCompany bean);
}