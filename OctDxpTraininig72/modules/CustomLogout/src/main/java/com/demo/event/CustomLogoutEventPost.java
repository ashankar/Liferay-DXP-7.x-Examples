package com.demo.event;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;

import org.osgi.service.component.annotations.Component;

/**
 * @author Anand
 */
@Component(
		immediate = true, 
		property = { 
				"key=logout.events.post" }, 
		service = LifecycleAction.class
		)
public class CustomLogoutEventPost implements LifecycleAction {

	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {

		System.out.println("In CustomLogoutEventPost.processLifecycleEvent");

	}

}
