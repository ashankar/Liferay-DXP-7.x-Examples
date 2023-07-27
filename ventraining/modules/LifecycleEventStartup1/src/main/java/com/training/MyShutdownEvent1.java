package com.training;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;

@Component(
		immediate = true,
		property = {"key=application.shutdown.events"
		},
		service = LifecycleAction.class
	)
public class MyShutdownEvent1 implements LifecycleAction {

	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
		
		System.out.println("Hello Shutdown event################################");
		
	}

	
	
}
