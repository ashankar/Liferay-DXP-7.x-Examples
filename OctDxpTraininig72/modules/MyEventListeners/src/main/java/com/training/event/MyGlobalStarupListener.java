package com.training.event;

import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.util.WebKeys;

@Component(
		immediate = true,
		property = {"key=layout.configuration.action.update"
		},
		service = LifecycleAction.class
	)
public class MyGlobalStarupListener implements LifecycleAction {

	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {

		System.out.println(">>>>>>>>>>>>>>>> Hello layout.configuration.action.update");
		HttpServletRequest httpServletRequest= lifecycleEvent.getRequest();
		try {

//		 PortalUtil.getUser(httpServletRequest);
		 
//			PortalUtil.getUserEmailAddress(123);
			
			User user=(User)httpServletRequest.getAttribute(WebKeys.USER);
		 
//		 userObj = (User) request.getAttribute(WebKeys.USER);
			
			System.out.println(">>>>>> User: " + user.getFirstName());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	
}
