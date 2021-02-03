package com.training;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;

import org.osgi.service.component.annotations.Component;

/**
 * @author Anand
 */
@Component(
	immediate = true,
	property = {"key=login.events.pre",
				"service.ranking:Integer=10"
	},
	service = LifecycleAction.class
)
public class DemoPostLoginEvent implements LifecycleAction {


	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {

		System.out.println(">>>>>>>>>>>>> Hello Post Login Event <<<<<<<<<<<<<<<<<<<");
		
	}
	
	
}
