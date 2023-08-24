package com.training;

import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

import com.liferay.portal.deploy.hot.CustomJspBag;
import com.liferay.portal.kernel.url.URLContainer;

/**
 * @author Anand
 */
@Component(
	immediate = true,
	property = {
			"context.id=MyCustomJspBag",
			"context.name=My Custom JSP",
			"service.ranking:Integer=100"
	},
	service = CustomJspBag.class
)
public class MyCustomJspBag implements CustomJspBag {

	@Override
	public String getCustomJspDir() {
		return "META-INF/jsps/";
	}

	@Override
	public List<String> getCustomJsps() {
		return _customJsps;
	}

	@Override
	public URLContainer getURLContainer() {
		return _urlContainer;
	}

	@Override
	public boolean isCustomJspGlobal() {
		return true;
	}
	
	@Activate
	void activate(BundleContext bundleContext)
	{
		_bundle=bundleContext.getBundle();
		_customJsps=new ArrayList<String>();
		
		Enumeration<URL> entries=_bundle.findEntries(getCustomJspDir(), "*.jsp", true);
		
		while (entries.hasMoreElements()) {
			URL url = (URL) entries.nextElement();
			_customJsps.add(url.getPath());
			
		}
	}
	
	
	private final URLContainer _urlContainer=new URLContainer() {
		
		@Override
		public Set<String> getResources(String path) {

			Set<String> paths=new HashSet<String>();
			
			for(String entry:_customJsps)
			{
				if(entry.startsWith(path))
				{
					paths.add(entry);
				}
			}
			
			return paths;
		}
		
		@Override
		public URL getResource(String name) {

			return _bundle.getEntry(name);
		}
	};
	
	
	
	private Bundle _bundle;
	private List<String> _customJsps;


}