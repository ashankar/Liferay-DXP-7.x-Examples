package com.demo.my.model.listener;

import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.model.User;

import org.osgi.service.component.annotations.Component;

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

		System.out.println(">>>>>>>>>> Hello MyDemoModelListener: onAfterUpdate... ");
		
		
		super.onAfterUpdate(model);
	}
	
	@Override
	public void onBeforeCreate(User model) throws ModelListenerException {

		
		super.onBeforeCreate(model);
	}
	
	
	
}