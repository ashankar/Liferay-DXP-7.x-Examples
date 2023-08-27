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

package com.myextdb.sb.service.impl;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.myextdb.sb.service.base.ProductServiceBaseImpl;

/**
 * The implementation of the product remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.myextdb.sb.service.ProductService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProductServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=mynssb",
		"json.web.service.context.path=Product"
	},
	service = AopService.class
)
public class ProductServiceImpl extends ProductServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.myextdb.sb.service.ProductServiceUtil</code> to access the product remote service.
	 */
	
	@JSONWebService(method = "POST", value = "testMyWs")
	public String testMyWs()
	{
		
		return "Hello My WS!";
	}
	
	
}