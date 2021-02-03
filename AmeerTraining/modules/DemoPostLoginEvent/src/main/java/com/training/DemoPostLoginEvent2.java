package com.training;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;

@Component(
		immediate = true,
		property = {"key=login.events.post",
					"service.ranking:Integer=11"
		},
		service = LifecycleAction.class
	)
public class DemoPostLoginEvent2 implements LifecycleAction {

	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {

		System.out.println(">>>>>>>>>>>>> Hello Post Login Event 2 <<<<<<<<<<<<<<<<<<<");
		
	}

	
	
}
