package com.training.auth;

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
public class MyCustomAuthenticator implements Authenticator {

	@Override
	public int authenticateByEmailAddress(long companyId, String emailAddress, String password,
			Map<String, String[]> headerMap, Map<String, String[]> parameterMap) throws AuthException {

		
		System.out.println("In MyCustomAuthenticator: authenticateByEmailAddress...");
		
		System.out.println(emailAddress);
		System.out.println(password);
		//Make a web service call or third party integration and authenticate here.
		
		boolean flag=true;
		
		if(flag) {
			
			return SKIP_LIFERAY_CHECK;
		}else {
			
			return FAILURE;
		}
		
	}

	@Override
	public int authenticateByScreenName(long companyId, String screenName, String password,
			Map<String, String[]> headerMap, Map<String, String[]> parameterMap) throws AuthException {

		
		System.out.println("In MyCustomAuthenticator: authenticateByScreenName...");
		
		System.out.println(screenName);
		System.out.println(password);
		//Make a web service call or third party integration and authenticate here.
		
		boolean flag=true;
		
		if(flag) {
			
			return SKIP_LIFERAY_CHECK;
		}else {
			
			return FAILURE;
		}
		
		
		
	}

	@Override
	public int authenticateByUserId(long companyId, long userId, String password, Map<String, String[]> headerMap,
			Map<String, String[]> parameterMap) throws AuthException {

		System.out.println("In MyCustomAuthenticator: authenticateByUserId...");
		

		System.out.println(userId);
		System.out.println(password);
		//Make a web service call or third party integration and authenticate here.
		
		boolean flag=true;
		
		if(flag) {
			
			return SKIP_LIFERAY_CHECK;
		}else {
			
			return FAILURE;
		}
	
	}
	
	
	

}
