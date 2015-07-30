package com.soarcms.core.dao;

import java.util.List;

import com.soarcms.common.hibernate3.Updater;
import com.soarcms.core.entity.Ftp;

public interface FtpDao {
	public List<Ftp> getList();

	public Ftp findById(Integer id);

	public Ftp save(Ftp bean);

	public Ftp updateByUpdater(Updater<Ftp> updater);

	public Ftp deleteById(Integer id);
}