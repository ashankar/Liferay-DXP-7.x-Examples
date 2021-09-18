
<%@ include file="/init.jsp" %>


<!-- This will pick your modified version of JSP/jSPF -->
<%-- <liferay-util:include page="/login.origional.jsp" servletContext="<%=application%>" /> --%>


<!-- This will pick Core/default version of JSP/jSPF -->

<liferay-util:include page="/login.portal.jsp" servletContext="<%=application%>" />
