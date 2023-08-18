package com.training;

import java.util.Map;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.security.auth.AuthException;
import com.liferay.portal.kernel.security.auth.Authenticator;

/**
 * @author Anand
 */
@Component(
	immediate = true,
	property = { "key=auth.pipeline.pre"
	},
	service = Authenticator.class
)
public class MyCustomAuth implements Authenticator {

	@Override
	public int authenticateByEmailAddress(long companyId, String emailAddress, String password,
			Map<String, String[]> headerMap, Map<String, String[]> parameterMap) throws AuthException {

				
			System.out.println("Hello authenticateByEmailAddress:");
			
			System.out.println(emailAddress);
			System.out.println(password);
			
		
		
		return SUCCESS;
	}

	@Override
	public int authenticateByScreenName(long companyId, String screenName, String password,
			Map<String, String[]> headerMap, Map<String, String[]> parameterMap) throws AuthException {

		System.out.println("Hello authenticateByScreenName:");
		
		return SUCCESS;
	}

	@Override
	public int authenticateByUserId(long companyId, long userId, String password, Map<String, String[]> headerMap,
			Map<String, String[]> parameterMap) throws AuthException {

		System.out.println("Hello authenticateByUserId:");
		
		return 0;
	}


	
	
}