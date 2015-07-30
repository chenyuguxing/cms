package com.soarcms.cms.entity.assist;

import com.soarcms.cms.entity.assist.base.BaseCmsScoreRecord;



public class CmsScoreRecord extends BaseCmsScoreRecord {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CmsScoreRecord () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsScoreRecord (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsScoreRecord (
		java.lang.Integer id,
		com.soarcms.cms.entity.assist.CmsScoreItem item,
		com.soarcms.cms.entity.main.Content content,
		java.lang.Integer count) {

		super (
			id,
			item,
			content,
			count);
	}

/*[CONSTRUCTOR MARKER END]*/


}