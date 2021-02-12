package com.training.osgi.bnd;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		property= {
				"osgi.command.funtion=telltime",
				"osgi.command.scope=training"
		},
		
		service=DateTimeConsumer.class
		)

public class DateTimeConsumer {

@Reference
DateTimeApi dateTimeApi;


public void telltime()
{
	
	System.out.println("In DateTimeConsumer: runDateTime");
	
	System.out.println(dateTimeApi.getDateTime());
	
}
	
}
