<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/init.jsp" %>

<%=ParamUtil.getString(renderRequest, "alpha1") %>

<%=renderRequest.getParameter("alpha1") %>