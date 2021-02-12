package com.training.osgi.bnd;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

@Component(
		
		service=DateTimeApi.class
		)

public class DateTimeApiImpl implements DateTimeApi {

	@Override
	public String getDateTime() {

		System.out.println("In DateTimeApiImpl: getDateTime");
		
		return new Date().toString();
	}
	
}
