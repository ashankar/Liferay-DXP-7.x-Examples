package com.training.osgi.share1;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

import com.training.osgi.share1.api.MyDateTime;

/**
 * @author Anand
 */

@Component(immediate = true, 
	property = {}, 
	service = MyDateTime.class
)

public class MyOsgiShare1 implements MyDateTime {

	@Override
	public String getCurrentTime() {

		System.out.println("Hello In MyDateTimeImpl: getCurrentTime");

		return new Date().toString();
	}

}