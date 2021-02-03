package com.training.custom.auth;

import java.util.Map;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.security.auth.AuthException;
import com.liferay.portal.kernel.security.auth.Authenticator;


@Component(
		immediate = true,
		property = {"key=auth.pipeline.pre"
				
		},
		service = Authenticator.class
	)
public class DemoAuthenticator implements Authenticator {

	@Override
	public int authenticateByEmailAddress(long companyId, String emailAddress, String password,
			Map<String, String[]> headerMap, Map<String, String[]> parameterMap) throws AuthException {
		
		System.out.println(">>>>>>>>>>>>>>> In DemoAuthenticator: authenticateByEmailAddress");
		
		// Make a external webservice call for authentication efeaf
		
		boolean flag=true;
		
		if(flag)
		{
			return SKIP_LIFERAY_CHECK;
		}else {
			
			return FAILURE;
		}
		
	}

	@Override
	public int authenticateByScreenName(long companyId, String screenName, String password,
			Map<String, String[]> headerMap, Map<String, String[]> parameterMap) throws AuthException {

		
		
		
System.out.println(">>>>>>>>>>>>>>> In DemoAuthenticator: authenticateByScreenName");
		
		// Make a external webservice call for authentication
		
		boolean flag=true;
		
		if(flag)
		{
			return SKIP_LIFERAY_CHECK;
		}else {
			
			return FAILURE;
		}
		
	}

	@Override
	public int authenticateByUserId(long companyId, long userId, String password, Map<String, String[]> headerMap,
			Map<String, String[]> parameterMap) throws AuthException {
		
		
		
		System.out.println(">>>>>>>>>>>>>>> In DemoAuthenticator: authenticateByUserId");
		
		// Make a external webservice call for authentication
		
		boolean flag=true;
		
		if(flag)
		{
			return SKIP_LIFERAY_CHECK;
		}else {
			
			return FAILURE;
		}
		
	}
}
