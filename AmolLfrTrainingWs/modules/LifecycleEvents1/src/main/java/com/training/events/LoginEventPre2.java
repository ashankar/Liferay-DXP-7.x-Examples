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
	property = {"key=login.events.pre",
			"service.ranking:Integer=12"
	},
	service = LifecycleAction.class
)
public class LoginEventPre2 implements LifecycleAction {

	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
		
		
		System.out.println(">>>>>>>>>>>>>>> Hello LoginEvent... Pre 2 Login.........");
		
	}


}
