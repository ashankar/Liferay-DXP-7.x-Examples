package com.training;

import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;

@Component(
		immediate = true,
		property = {"key=layout.configuration.action.update"
		},
		service = LifecycleAction.class
	)
public class DemoGlobalStartupEventListener implements LifecycleAction {

	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {

		System.out.println(">>>>>>>>>>>>> Hello layout.configuration.action.update <<<<<<<<<<<<<<<<<<<");
		
		try {
			
			HttpServletRequest httpServletRequest=lifecycleEvent.getRequest();
			
//			PortalUtil.getUser(httpServletRequest);
			
			 User user= (User)httpServletRequest.getAttribute(WebKeys.USER);
			 
			 
			 System.out.println("Here it is: >>>>>>>  " + user.getFirstName());
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		
		
		
		
		
		
	}
	
	

}
