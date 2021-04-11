package com.training.demo;

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
public class DemoDynamicIncludeJspOverride implements DynamicInclude {

	@Override
	public void include(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, String key)
			throws IOException {

		System.out.println("In DemoDynamicIncludeJspOverride: include");
		
		PrintWriter printWriter = httpServletResponse.getWriter();

		printWriter.println("<h2>Hello Dynamic Include! It's added...</h2><br />");
		
		
	}

	@Override
	public void register(DynamicIncludeRegistry dynamicIncludeRegistry) {

		
		System.out.println("In DemoDynamicIncludeJspOverride: register");
		
		dynamicIncludeRegistry.register("com.liferay.blogs.web#/blogs/view_entry.jsp#pre");
		dynamicIncludeRegistry.register("com.liferay.blogs.web#/blogs/view_entry.jsp#post");
		
		
	}
	
	
}