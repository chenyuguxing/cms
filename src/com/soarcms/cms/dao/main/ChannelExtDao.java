package com.soarcms.cms.dao.main;

import com.soarcms.cms.entity.main.ChannelExt;
import com.soarcms.common.hibernate3.Updater;

public interface ChannelExtDao {
	public ChannelExt save(ChannelExt bean);

	public ChannelExt updateByUpdater(Updater<ChannelExt> updater);
}