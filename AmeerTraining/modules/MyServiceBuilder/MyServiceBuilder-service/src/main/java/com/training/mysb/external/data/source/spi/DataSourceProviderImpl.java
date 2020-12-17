package com.training.mysb.external.data.source.spi;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.liferay.portal.kernel.dao.jdbc.DataSourceFactoryUtil;
import com.liferay.portal.kernel.dao.jdbc.DataSourceProvider;
import com.liferay.portal.kernel.util.PropsUtil;

public class DataSourceProviderImpl implements DataSourceProvider {

	
	@Override
	public DataSource getDataSource() {

		DataSource dataSource=null;
		
		try {
			
			//dataSource=DataSourceFactoryUtil.initDataSource(PropsUtil.getProperties("jdbc.mydb.", true));
		
			InitialContext context=new InitialContext();
			dataSource=(DataSource)context.lookup("java:comp/env/jdbc/myDataSource");
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return dataSource;
	}

	
	
	
}
