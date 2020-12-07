package com.sb2.training.external.data.source;

import javax.sql.DataSource;

import com.liferay.portal.kernel.dao.jdbc.DataSourceFactoryUtil;
import com.liferay.portal.kernel.dao.jdbc.DataSourceProvider;
import com.liferay.portal.kernel.util.PropsUtil;

public class DataSourceProviderImpl implements DataSourceProvider {

	@Override
	public DataSource getDataSource() {

		try {
			return DataSourceFactoryUtil.initDataSource(
				PropsUtil.getProperties("jdbc.mydb.", true));
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}

}
