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
	property = {
			"key=auth.pipeline.pre"
	},
	service = Authenticator.class
)
public class MyDemoAuthenticator implements Authenticator {

	@Override
	public int authenticateByEmailAddress(long companyId, String emailAddress, String password,
			Map<String, String[]> headerMap, Map<String, String[]> parameterMap) throws AuthException {
		
		System.out.println(">>>>>>>>>>>>>>> In MyDemoAuthenticator: authenticateByEmailAddress");
		
		return 2;
	}

	@Override
	public int authenticateByScreenName(long companyId, String screenName, String password,
			Map<String, String[]> headerMap, Map<String, String[]> parameterMap) throws AuthException {

		System.out.println(">>>>>>>>>>>>>>> In MyDemoAuthenticator: authenticateByScreenName");
		
		return SUCCESS;
	}

	@Override
	public int authenticateByUserId(long companyId, long userId, String password, Map<String, String[]> headerMap,
			Map<String, String[]> parameterMap) throws AuthException {

		System.out.println(">>>>>>>>>>>>>>> In MyDemoAuthenticator: authenticateByUserId");
		
		return 0;
	}

}