package com.bajaj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.servlet.taglib.DynamicInclude;

/**
 * @author Anand
 */
@Component(
	immediate = true,
	property = {
	},
	service = DynamicInclude.class
)
public class MyDynamicInclude1 implements DynamicInclude {

	@Override
	public void include(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, String key)
			throws IOException {

		System.out.println("MyDynamicInclude1.include():");
		PrintWriter printWriter=httpServletResponse.getWriter();
		printWriter.print("Mahalakshmi modified this adadad!");
		
	}

	@Override
	public void register(DynamicIncludeRegistry dynamicIncludeRegistry) {

		System.out.println("MyDynamicInclude1.register():");
		dynamicIncludeRegistry.register("com.liferay.login.web#/login.jsp#alertPre");
		dynamicIncludeRegistry.register("com.liferay.blogs.web#/blogs/view_entry.jsp#pre");
		
	}


}