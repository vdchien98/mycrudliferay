
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@include file="./init.jsp"%>
<%
	String mvcPath = ParamUtil.getString(request, "mvcPath");
	System.out.println("xin chao mvcPath " + mvcPath);
	ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	System.out.println("xin chao row " + row);
	CRUD crud = (CRUD) row.getObject();
	System.out.println("xin chao crud " + crud);
%>
<liferay-ui:icon-menu>
	<portlet:renderURL var="editURL">
		<portlet:param name="crudId"
			value="<%=String.valueOf(crud.getCrudId())%>" />
		<portlet:param name="mvcPath" value="/edit_CRUD.jsp" />
	</portlet:renderURL>

	<liferay-ui:icon image="edit" message="Edit"
		url="<%=editURL.toString()%>" />
		
	<portlet:actionURL name="deleteCRUD" var="deleteURL">
		<portlet:param name="crudId"
			value="<%=String.valueOf(crud.getCrudId())%>" />

	</portlet:actionURL>

	<liferay-ui:icon-delete url="<%=deleteURL.toString()%>" />
	
</liferay-ui:icon-menu>