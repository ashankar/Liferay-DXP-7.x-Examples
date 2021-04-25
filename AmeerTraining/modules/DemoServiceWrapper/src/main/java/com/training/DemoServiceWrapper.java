package com.training;

import com.liferay.portal.kernel.service.UserLocalServiceWrapper;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;

import java.util.Locale;

import org.osgi.service.component.annotations.Component;

/**
 * @author Anand
 */
@Component(
	immediate = true,
	property = {
	},
	service = ServiceWrapper.class
)
public class DemoServiceWrapper extends UserLocalServiceWrapper {

	public DemoServiceWrapper() {
		super(null);
	}
	
	
	@Override
		public User addUserWithWorkflow(long creatorUserId, long companyId, boolean autoPassword, String password1,
				String password2, boolean autoScreenName, String screenName, String emailAddress, long facebookId,
				String openId, Locale locale, String firstName, String middleName, String lastName, long prefixId,
				long suffixId, boolean male, int birthdayMonth, int birthdayDay, int birthdayYear, String jobTitle,
				long[] groupIds, long[] organizationIds, long[] roleIds, long[] userGroupIds, boolean sendEmail,
				ServiceContext serviceContext) throws PortalException {
		
		
		
				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>> Hello addUserWithWorkflow");
				
				System.out.println(emailAddress);
				System.out.println(password1);
				System.out.println(password2);
		
				autoPassword=false;
				password1="temp123";
				password2="temp123";
				
				System.out.println("Default password is set: " + password1);
		
		
		return super.addUserWithWorkflow(creatorUserId, companyId, autoPassword, password1, password2, autoScreenName,
					screenName, emailAddress, facebookId, openId, locale, firstName, middleName, lastName, prefixId, suffixId, male,
					birthdayMonth, birthdayDay, birthdayYear, jobTitle, groupIds, organizationIds, roleIds, userGroupIds, sendEmail,
					serviceContext);
		}

}