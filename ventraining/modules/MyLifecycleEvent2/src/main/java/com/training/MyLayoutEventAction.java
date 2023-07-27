package com.training;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;

@Component(
		immediate = true,
		property = {"key=layout.configuration.action.update"
		},
		service = LifecycleAction.class
	)
public class MyLayoutEventAction implements LifecycleAction {

	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
		
		
		System.out.println("Hello Layout update event################################");
		
		
	}

	
	
}
