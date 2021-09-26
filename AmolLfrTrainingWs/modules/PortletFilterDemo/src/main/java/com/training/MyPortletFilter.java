package com.training;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.filter.FilterChain;
import javax.portlet.filter.FilterConfig;
import javax.portlet.filter.PortletFilter;
import javax.portlet.filter.RenderFilter;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.util.PortletKeys;

/**
 * @author Anand
 */
@Component(
	immediate = true,
	property = {
			"javax.portlet.name=" + PortletKeys.BLOGS
	},
	service = PortletFilter.class
)
public class MyPortletFilter implements RenderFilter {

	@Override
	public void init(FilterConfig filterConfig) throws PortletException {

		System.out.println(">>>>>>>>>>>>>>>>>>>>> init");
		
	}

	@Override
	public void destroy() {

		
		System.out.println(">>>>>>>>>>>>>>>>>>>>> destroy");
		
	}

	@Override
	public void doFilter(RenderRequest request, RenderResponse response, FilterChain chain)
			throws IOException, PortletException {

		
		System.out.println(">>>>>>>>>>>>>>>>>>>>> Executing.....");
		response.getWriter().write("Hello Filter JSP..........");
		
		chain.doFilter(request, response);
		
	}

}