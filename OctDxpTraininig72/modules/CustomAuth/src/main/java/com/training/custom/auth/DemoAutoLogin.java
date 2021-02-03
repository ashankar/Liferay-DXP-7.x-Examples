package com.training.custom.auth;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.security.auto.login.AutoLogin;
import com.liferay.portal.kernel.security.auto.login.AutoLoginException;
import com.liferay.portal.kernel.util.PortalUtil;

/**
 * @author Anand
 */
@Component(
	immediate = true,
	property = {
	},
	service = AutoLogin.class
)
public class DemoAutoLogin implements AutoLogin {

	@Override
	public String[] handleException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
			Exception e) throws AutoLoginException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] login(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
			throws AutoLoginException {
		
		System.out.println(">>>>>>>>>>>>>>> In DemoAutoLogin: login");
		
		String[] s=new String[] {"test@liferay.com", "dgdfgdzftest", Boolean.TRUE.toString()};
		
		/*
		 * try {
		 * 
		 * User user= PortalUtil.getUser(httpServletRequest);
		 * 
		 * if(user != null) { System.out.println(user.getEmailAddress()); }else {
		 * 
		 * System.out.println("User is Null"); }
		 * 
		 * 
		 * 
		 * } catch (PortalException e) { e.printStackTrace(); }
		 */
		
		
		
		
		
		return s;
	}



}