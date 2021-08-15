package com.training.events;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;

import org.osgi.service.component.annotations.Component;

/**
 * @author Anand
 */
@Component(
	immediate = true,
	property = {"key=global.startup.events"
	},
	service = LifecycleAction.class
)
public class StarupAndShutdownEvent implements LifecycleAction {

	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
		
		
		System.out.println(">>>>>>>>>>>>>>> Hello StarupAndShutdownEvent... Server is getting started....");
		
		
	}


}
