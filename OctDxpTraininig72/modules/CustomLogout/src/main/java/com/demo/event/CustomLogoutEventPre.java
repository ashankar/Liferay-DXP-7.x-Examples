package com.demo.event;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;

/**
 * @author Anand
 */
@Component(
		immediate = true, 
property = { 
		"key=logout.events.pre" }, 
		service = LifecycleAction.class
)
public class CustomLogoutEventPre implements LifecycleAction {

	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {

		System.out.println("In CustomLogoutEventPre.processLifecycleEvent");

		HttpServletRequest httpServletRequest = lifecycleEvent.getRequest();
		HttpServletResponse httpServletResponse = lifecycleEvent.getResponse();
		
		try {

			String x1 = httpServletRequest.getParameter("myFlag");
			boolean myFlag = x1 != null && x1.equals("false") ? false : true;

			if (myFlag) {
				System.out.println(">>>>>>>>>>>>>>>>>>>> before redirect");

				httpServletResponse.sendRedirect("http://localhost:8083/web/my-site1/custom-logout2");
				throw new ActionException();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
