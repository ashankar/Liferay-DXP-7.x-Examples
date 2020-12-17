package com.sb2.training.external.data.source;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.liferay.portal.kernel.dao.jdbc.DataSourceProvider;

public class DataSourceProviderImpl implements DataSourceProvider {

	@Override
	public DataSource getDataSource() {
		
		DataSource dataSource=null;
		

		try {
//			dataSource= DataSourceFactoryUtil.initDataSource(
//				PropsUtil.getProperties("jdbc.mydb.", true));
			
			
			InitialContext initialContext=new InitialContext();
			 dataSource=(DataSource)initialContext.lookup("java:comp/env/jdbc/myDataSource");
			
			
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		return dataSource;
	}

}
