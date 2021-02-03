package com.training.auth;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.security.auto.login.AutoLogin;
import com.liferay.portal.kernel.security.auto.login.AutoLoginException;
import com.liferay.portal.kernel.util.WebKeys;

/**
 * @author Anand
 */
/*
 * @Component( immediate = true, property = { }, service = AutoLogin.class )
 */
public class DemoAutoLogin implements AutoLogin {

	@Override
	public String[] handleException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
			Exception e) throws AutoLoginException {
		
		
		
		return null;
	}

	@Override
	public String[] login(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
			throws AutoLoginException {
		
		
		String[] s=new String[] {"user name", "password", Boolean.TRUE.toString()};
		
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>> Hello Auto Login");
		
		
		try {
			
//			User user=PortalUtil.getUser(httpServletRequest);
			
			 User user= (User)httpServletRequest.getAttribute(WebKeys.USER);
		
			 
			 System.out.println(user.getEmailAddress());
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return s;
	}


	
	
}