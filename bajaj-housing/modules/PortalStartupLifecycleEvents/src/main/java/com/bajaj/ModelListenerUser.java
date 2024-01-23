package com.bajaj;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.model.User;

/**
 * @author Anand
 */
@Component(
	immediate = true,
	property = {
	},
	service = ModelListener.class
)
public class ModelListenerUser extends BaseModelListener<User> {

	@Override
	public void onAfterUpdate(User model) throws ModelListenerException {

		System.out.println(">>>>>>>>>>>>>>Hello ModelListenerUser : " + model.getFirstName());
		
		super.onAfterUpdate(model);
	}

}
