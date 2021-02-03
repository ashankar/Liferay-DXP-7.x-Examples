/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.training.mysb.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.training.mysb.service.base.CustomUserLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the custom user local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.training.mysb.service.CustomUserLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CustomUserLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.training.mysb.model.CustomUser",
	service = AopService.class
)
public class CustomUserLocalServiceImpl extends CustomUserLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.training.mysb.service.CustomUserLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.training.mysb.service.CustomUserLocalServiceUtil</code>.
	 */
	
	
	public void addLiferayUser(String firstName,String lastName, String email, String screenName, String password)
	{
		try {
			
//		User user= UserLocalServiceUtil.createUser(CounterLocalServiceUtil.increment(User.class.getName()));
//		user.setEmailAddress(email);
//		user.setScreenName(screenName);
//		user.setFirstName(firstName);
//		user.setLastName(lastName);
//		user.setPassword(password);
//		
//		UserLocalServiceUtil.addUser(user);
			
			
			System.out.println("Assume user is added....................");
		
		}catch (Exception e) {

			e.printStackTrace();
		}
		
	}
	
	
}