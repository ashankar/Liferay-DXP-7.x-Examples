package MyLifecycleEvent2;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;

/**
 * @author Anand
 */

@Component(
		immediate = true,
		property = {"key=login.events.pre",
					"service.ranking:Integer=11"
		},
		service = LifecycleAction.class
	)
public class MyLifecycleEvent2 implements LifecycleAction {

	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {
		

		
		System.out.println("Hello Pre1 login event################################");
		
		
		
		
		
		
		
		
		
		
		
//		HttpServletRequest req=lifecycleEvent.getRequest();
//		
//		HttpSession httpSession=lifecycleEvent.getSession();
		
		//ABCUser myuser=new ABCUser();
		
	//	System.out.println(req.getParameter("_com_liferay_login_web_portlet_LoginPortlet_login"));
		
		
	}


}