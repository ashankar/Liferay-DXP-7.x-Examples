<%@page import="javax.portlet.PortletSession"%>
<%@ include file="/init.jsp" %>

<%=portletSession.getAttribute("alpha1", PortletSession.PORTLET_SCOPE) %>