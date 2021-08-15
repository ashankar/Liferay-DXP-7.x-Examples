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
	property = {"key=servlet.session.create.events"
	},
	service = LifecycleAction.class
)
public class ServiceAction1 implements LifecycleAction {

	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
		
		
		System.out.println(">>>>>>>>>>>>>>> Hello Servlet on Session Create.......");
		
	}


}
