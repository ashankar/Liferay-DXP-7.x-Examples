package com.training;

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
		// TODO enter required service properties
	},
	service = DynamicInclude.class
)
public class DemoDynamicInclude implements DynamicInclude
{
	@Override
	public void include(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, String key)
			throws IOException {
		
		
		PrintWriter printWriter=httpServletResponse.getWriter();
		printWriter.println("Hello Dynamic Include!");
		
		
	}

	@Override
	public void register(DynamicIncludeRegistry dynamicIncludeRegistry) {
		
		dynamicIncludeRegistry.register("com.liferay.blogs.web#/blogs/view_entry.jsp#pre");
		
		
	}


}