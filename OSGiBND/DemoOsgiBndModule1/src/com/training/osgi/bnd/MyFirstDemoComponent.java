package com.training.osgi.bnd;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
				"osgi.command.function=mycommand",
				"osgi.command.scope=training"
		},
		
		service=MyFirstDemoComponent.class
		)

public class MyFirstDemoComponent {
	
	public void myommand()
	{
		
		System.out.println("Hello my MyFirstDemoComponent");
		
	}

}
