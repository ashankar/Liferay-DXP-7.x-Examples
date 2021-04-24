package com.demo.my.model.listener;

import javax.servlet.http.HttpSession;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.servlet.PortalSessionThreadLocal;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.PortalUtil;

/**
 * @author Anand
 */
@Component(
	immediate = true,
	property = {
		// TODO enter required service properties
	},
	service = ModelListener.class
)
public class MyDemoModelListener extends BaseModelListener<User> {

	
	@Override
	public void onAfterUpdate(User model) throws ModelListenerException {
	
		HttpSession session=null;
		

		try {
			
			
	 session= PortalSessionThreadLocal.getHttpSession();
	
//	SessionMessages.add(session, model.getClass().getName());
	
	throw new  ModelListenerException();
	
		}catch (Exception e) {

			SessionErrors.add(session, e.getClass().getName());
			SessionErrors.add(session, model.getClass().getName());
			SessionMessages.add(session, e.getClass().getName());
			
		}
	
	
	
		
		
		super.onAfterUpdate(model);
	}
	
	
	

	/*
	 * @Override public void onAfterUpdate(User model) throws ModelListenerException
	 * {
	 * 
	 * System.out.println(">>>>>>>>>> Hello MyDemoModelListener: onAfterUpdate... "
	 * );
	 * 
	 * 
	 * 
	 * super.onAfterUpdate(model); }
	 * 
	 * @Override public void onBeforeCreate(Doctor model) throws
	 * ModelListenerException {
	 * 
	 * 
	 * super.onBeforeCreate(model); }
	 */
	
	
	
}