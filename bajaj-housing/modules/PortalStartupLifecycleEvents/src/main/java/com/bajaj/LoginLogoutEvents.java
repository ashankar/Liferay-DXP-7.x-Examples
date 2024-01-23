package com.bajaj;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;

/**
 * @author Anand
 */
@Component(
	immediate = true,
	property = {"key=login.events.pre"
	},
	service = LifecycleAction.class
)
public class LoginLogoutEvents implements LifecycleAction {

	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
		
		System.out.println(">>>>>>>>>>>>>>Hello LoginLogoutEvents");	
	}

}
