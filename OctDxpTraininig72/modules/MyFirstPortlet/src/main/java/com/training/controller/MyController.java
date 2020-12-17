package com.training.controller;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

public class MyController extends MVCPortlet {

	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		System.out.println("Hello Super Render");
		
		super.render(renderRequest, renderResponse);
	}
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
	 
	 
	 
	 
		
		super.doView(renderRequest, renderResponse);
	}
	
	
}
