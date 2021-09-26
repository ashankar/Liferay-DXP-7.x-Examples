package com.training;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.security.auto.login.AutoLogin;
import com.liferay.portal.kernel.security.auto.login.AutoLoginException;

/**
 * @author Anand
 */
@Component(
	immediate = true,
	property = {
		// TODO enter required service properties
	},
	service = AutoLogin.class
)
public class MyDemoAutoLogin implements AutoLogin {

	@Override
	public String[] handleException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
			Exception e) throws AutoLoginException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] login(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
			throws AutoLoginException {
		

		//System.out.println(">>>>>>>>>>>>>>> In DemoAutoLogin: login");
		
		String[] s=null;
				
				//s=new String[] {"20130", "w", Boolean.TRUE.toString()};
		
		
		return s;
	}


}