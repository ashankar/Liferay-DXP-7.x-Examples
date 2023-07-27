package com.training;

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
	},
	service = ModelListener.class
)
public class MyModelListener extends BaseModelListener<User>{

	@Override
	public void onAfterUpdate(User model) throws ModelListenerException {

		System.out.println("Hello Model Listener: " +  model.getFullName());
		
		System.out.println("Hello Model Listener: " +  model.getPassword());
		
		
		super.onAfterUpdate(model);
	}
	

}