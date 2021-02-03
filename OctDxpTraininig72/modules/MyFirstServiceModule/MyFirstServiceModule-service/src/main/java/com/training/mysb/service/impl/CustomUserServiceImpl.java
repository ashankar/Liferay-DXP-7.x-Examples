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

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.aop.AopService;
import com.training.mysb.custom.model.CustomUser;
import com.training.mysb.service.CustomUserLocalServiceUtil;
import com.training.mysb.service.base.CustomUserServiceBaseImpl;

/**
 * The implementation of the custom user remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.training.mysb.service.CustomUserService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CustomUserServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=myfirstsbns",
		"json.web.service.context.path=CustomUser"
	},
	service = AopService.class
)
public class CustomUserServiceImpl extends CustomUserServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.training.mysb.service.CustomUserServiceUtil</code> to access the custom user remote service.
	 */
	
	public Object createLiferayUser(String firstName,String lastName, String email, String screenName, String password)
	{
		
		System.out.println("Before CustomUser remote call.....................");
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(email);
		System.out.println(screenName);
		System.out.println(password);
		
		CustomUser customUser=new CustomUser();
		customUser.setFirstName(firstName);
		customUser.setLastName(lastName);
		customUser.setEmail(email);
		customUser.setScreenName(screenName);
		customUser.setPassword(password);
		
		
		CustomUserLocalServiceUtil.addLiferayUser(firstName, lastName, email, screenName, password);
		System.out.println("After CustomUser remote call.....................");
	
		return customUser;
		
	}
	
}