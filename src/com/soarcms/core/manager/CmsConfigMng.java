package com.soarcms.core.manager;

import java.util.Date;

import com.soarcms.core.entity.CmsConfig;
import com.soarcms.core.entity.CmsConfigAttr;
import com.soarcms.core.entity.MarkConfig;
import com.soarcms.core.entity.MemberConfig;

public interface CmsConfigMng {
	public CmsConfig get();

	public void updateCountCopyTime(Date d);

	public void updateCountClearTime(Date d);

	public CmsConfig update(CmsConfig bean);

	public MarkConfig updateMarkConfig(MarkConfig mark);

	public void updateMemberConfig(MemberConfig memberConfig);
	
	public void updateConfigAttr(CmsConfigAttr configAttr);
}