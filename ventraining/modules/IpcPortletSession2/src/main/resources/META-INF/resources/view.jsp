<%@page import="javax.portlet.PortletSession"%>
<%@ include file="/init.jsp" %>

<%=portletSession.getAttribute("LIFERAY_SHARED_"+"alpha1", PortletSession.APPLICATION_SCOPE) %>