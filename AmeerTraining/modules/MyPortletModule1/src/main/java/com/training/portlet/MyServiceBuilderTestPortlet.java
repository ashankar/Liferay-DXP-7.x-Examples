/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.training.portlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.training.constants.MyModuleMainPortletKeys;
import com.training.mysb.model.Address;
import com.training.mysb.service.AddressLocalServiceUtil;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.app",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.init-param.view-template=/myservicebuildertestportlet/view.jsp",
		"javax.portlet.name=" + MyModuleMainPortletKeys.MY_SERVICE_BUILDER_TEST_PORTLET
	},
	service = Portlet.class
)
public class MyServiceBuilderTestPortlet extends MVCPortlet {
	
	
	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {

			System.out.println(">>>>>>>>>>> In MyServiceBuilderTestPortlet : processAction ");
	
			try {
			
			long addrId=CounterLocalServiceUtil.increment(Address.class.getName());	
				
			Address address=AddressLocalServiceUtil.createAddress(addrId+"");
			
			address.setHouseNo("#123");
			address.setStreetNo("St 4");
			address.setCity("GB Nagar");
			address.setState("New Delhi");
			address.setCountry("India");
			
			
			AddressLocalServiceUtil.addAddress(address);
			
			System.out.println(">>>>>>>>>>> Address added... ");
			}catch (Exception e) {

			e.printStackTrace();
				
			}
			
			
	
	}
	
	
	
	
}