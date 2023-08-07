package com.training;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.security.auto.login.AutoLogin;
import com.liferay.portal.kernel.security.auto.login.AutoLoginException;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;

/**
 * @author Anand
 */

@Component(immediate = true, property = {}, service = AutoLogin.class)

public class MyAutoLogin implements AutoLogin {

	@Override
	public String[] handleException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
			Exception e) throws AutoLoginException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] login(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
			throws AutoLoginException {
		
		
		System.out.println(">>>>>>>>>>>>>>>>>>>> Hello AutoLogin");

		String[] s=null;
		
try {
	
	
//	String username=httpServletRequest.getParameter("_com_liferay_login_web_portlet_LoginPortlet_login");
//	String pass=httpServletRequest.getParameter("_com_liferay_login_web_portlet_LoginPortlet_password");
	
	String emailId=httpServletRequest.getParameter("emailId");
	String pass=httpServletRequest.getParameter("pass");
	String userId=null;
	
	
	System.out.println(emailId);
	System.out.println(pass);
	
//			System.out.println(">>>>>>>>>>>>>>>>>>>>> before");
//			//Company company=PortalUtil.getCompany(httpServletRequest);
//			System.out.println(">>>>>>>>>>>>>>>>>>>>> after");
			 
			// System.out.println(">>>>>>>>>>>>>>>>>>>>> company id:" + company.getCompanyId());
			 
	
			User user=UserLocalServiceUtil.getUserByEmailAddress(20101l, emailId);
			
			if(user !=null)
			{
				
				userId=String.valueOf(user.getUserId());
				System.out.println(">>>>>>>>>>>>>>>>>>>>> user id: " + userId);
				
				
			}else {
				
				System.out.println(">>>>>>>>>>>>>>>>>>>>> user is null:");
			}

			
			
	
//		PortalUtil.getUser
			
			// User user= (User)httpServletRequest.getAttribute(WebKeys.USER);
			 
			// System.out.println(user.getUserId()); 
		
//			 if(user != null)
//			 {
//				 System.out.println(user.getEmailAddress());
//				 
//			 }else {
//				
//				 System.out.println(">>>>>>>>>>>>>>>>>>>> User is null");
//			}
			s=new String[] {userId, pass, Boolean.FALSE.toString()};	 
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

		return s;
	}

}