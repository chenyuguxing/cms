package com.soarcms.core.dao;

import com.soarcms.common.hibernate3.Updater;
import com.soarcms.core.entity.DbFile;

public interface DbFileDao {
	public DbFile findById(String id);

	public DbFile save(DbFile bean);

	public DbFile updateByUpdater(Updater<DbFile> updater);

	public DbFile deleteById(String id);
}