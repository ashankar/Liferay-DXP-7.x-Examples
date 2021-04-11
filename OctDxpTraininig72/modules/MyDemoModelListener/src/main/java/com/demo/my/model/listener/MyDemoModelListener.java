package com.demo.my.model.listener;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.sb2.training.model.Doctor;

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
public class MyDemoModelListener extends BaseModelListener<Doctor> {


	@Override
	public void onAfterUpdate(Doctor model) throws ModelListenerException {

		System.out.println(">>>>>>>>>> Hello MyDemoModelListener: onAfterUpdate... ");
		
		
		super.onAfterUpdate(model);
	}
	
	@Override
	public void onBeforeCreate(Doctor model) throws ModelListenerException {

		
		super.onBeforeCreate(model);
	}
	
	
	
}