package com.soarcms.cms.manager.main;

import com.soarcms.cms.entity.main.Channel;
import com.soarcms.cms.entity.main.ChannelExt;

public interface ChannelExtMng {
	public ChannelExt save(ChannelExt ext, Channel channel);

	public ChannelExt update(ChannelExt ext);
}