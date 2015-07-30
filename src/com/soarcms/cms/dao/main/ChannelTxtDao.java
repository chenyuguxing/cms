package com.soarcms.cms.dao.main;

import com.soarcms.cms.entity.main.ChannelTxt;
import com.soarcms.common.hibernate3.Updater;

public interface ChannelTxtDao {
	public ChannelTxt findById(Integer id);

	public ChannelTxt save(ChannelTxt bean);

	public ChannelTxt updateByUpdater(Updater<ChannelTxt> updater);
}