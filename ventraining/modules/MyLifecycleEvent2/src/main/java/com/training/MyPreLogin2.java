package com.training;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;

@Component(
		immediate = true,
		property = {"key=login.events.post"
					//"service.ranking:Integer=10"
		},
		service = LifecycleAction.class
	)
public class MyPreLogin2 implements LifecycleAction {

	
	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
		
		System.out.println("Hello post login event################################");
		
	}

	
	
	
}
