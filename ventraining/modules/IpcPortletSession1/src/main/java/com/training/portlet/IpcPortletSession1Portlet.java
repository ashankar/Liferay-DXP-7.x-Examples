package com.training.portlet;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletSession;

import org.osgi.service.component.annotations.Component;

import com.liferay.asset.kernel.service.AssetEntryLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import com.sb2.training.model.Employee;
import com.sb2.training.model.XyzOrg;
import com.sb2.training.service.EmployeeLocalServiceUtil;
import com.sb2.training.service.XyzOrgLocalServiceUtil;
import com.sb2.training.service.persistence.EmployeeUtil;
import com.training.constants.IpcPortletSession1PortletKeys;

/**
 * @author Anand
 */
@Component(
	immediate = true,
	property = {
		"javax.portlet.version=3.0",
		"com.liferay.portlet.display-category=category.myapp",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=IpcPortletSession1",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + IpcPortletSession1PortletKeys.IPCPORTLETSESSION1,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class IpcPortletSession1Portlet extends MVCPortlet {
	
	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {

		
		System.out.println("In processAction");
		
		String s=ParamUtil.getString(actionRequest,"alpha");
		
		System.out.println(s);
		
		
		PortletSession portletSession=actionRequest.getPortletSession();
		portletSession.setAttribute("LIFERAY_SHARED_"+"alpha1", s+"sS", PortletSession.APPLICATION_SCOPE);

		
		try {
			
			
			//EmployeeLocalServiceUtil.demoRestriction();
			
			//List<Employee> employees= EmployeeLocalServiceUtil.getEmployeeWithProjectionDQ("Noida");
			//System.out.println(employees);
			
			
			List<Object[]> rows= EmployeeLocalServiceUtil.excuteMyCustomQuery("select * from vt_employee");
			
			System.out.println("Here is the query result:");
			
			System.out.println(rows);
			
			for(Object[] row: rows)
			{
				
				System.out.println(row[6]);
				System.out.println(row[1]);
				System.out.println(row[2]);
				
			}
				
			
			
			
			
			

//			long deptId=CounterLocalServiceUtil.increment(XyzOrg.class.getName());
//			
//			XyzOrg dept=XyzOrgLocalServiceUtil.createXyzOrg(deptId);
//			dept.setDepName("ABC");
//			
//			XyzOrgLocalServiceUtil.addXyzOrg(dept);
//			System.out.println("Department inserted: " + deptId);
			
//			long empId=CounterLocalServiceUtil.increment(Employee.class.getName());
//			Employee employee=EmployeeLocalServiceUtil.createEmployee(empId);
//			employee.setDepId(XyzOrgLocalServiceUtil.getXyzOrg(102).getDepId());
//			employee.setGroupId(1);
//			employee.setUserId(123);
//			employee.setUserName(s);
//			employee.setAge(30);
//			employee.setAddress("New Delhi");
//			EmployeeLocalServiceUtil.addEmployee(employee);
//			
//			System.out.println("Employee inserted: " + empId);
			
			
			
//			Employee emp= EmployeeLocalServiceUtil.getEmpByUserName(s);
//			
//			System.out.println(emp.getAddress());
//			System.out.println(emp.getAge());
			
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}