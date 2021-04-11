package com.training.osgi2;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.document.library.kernel.util.DLUtil;
import com.training.osgi.share1.api.MyDateTime;

/**
 * @author Anand
 */
@Component(
	immediate = true,
	property = {
			"osgi.command.function=myseccommand",
			"osgi.command.scope=training"
	},
	service = MySecondDemoComponent.class
)
public class MySecondDemoComponent{

	
	public void myseccommand()
	{
		
		System.out.println("Hello my MySecondDemoComponent");
		
		System.out.println(myDateTime.getCurrentTime());
//		EmployeeLocalServiceUtil.getEmployeeByName("dads");
		
//		employeeService.getEmployeeByName("");
		
	}

	@Reference
	MyDateTime myDateTime;

}