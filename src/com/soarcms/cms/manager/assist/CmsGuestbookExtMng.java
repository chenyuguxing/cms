package com.soarcms.cms.manager.assist;

import com.soarcms.cms.entity.assist.CmsGuestbook;
import com.soarcms.cms.entity.assist.CmsGuestbookExt;

public interface CmsGuestbookExtMng {
	public CmsGuestbookExt save(CmsGuestbookExt ext, CmsGuestbook guestbook);

	public CmsGuestbookExt update(CmsGuestbookExt ext);
}