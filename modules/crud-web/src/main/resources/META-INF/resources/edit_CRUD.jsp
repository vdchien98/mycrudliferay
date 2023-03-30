<%@ include file="init.jsp"%>

<%
	long crudId = ParamUtil.getLong(renderRequest, "crudId");

	CRUD crud = null;
	if (crudId > 0) {
		crud = CRUDLocalServiceUtil.getCRUD(crudId);
	}

	long guestbookId = ParamUtil.getLong(renderRequest, "guestbookId");
%>
<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/view.jsp"></portlet:param>
</portlet:renderURL>
<portlet:actionURL name="addEntry" var="addEntryURL"></portlet:actionURL>




<aui:form action="<%=addEntryURL%>" name="<portlet:namespace />fm">

	<aui:model-context bean="<%=crud%>" model="<%=CRUD.class%>" />

	<aui:fieldset>
		<aui:input name="crudId" type="hidden"  />
		<aui:input name="name" />
		<aui:input name="department" />
		<aui:input name="phone" />
		<aui:input name="email" />
		<aui:input name="message" />


	</aui:fieldset>

	<aui:button-row>

		<aui:button type="submit"></aui:button>
		<aui:button type="cancel" onClick="<%=viewURL.toString()%>"></aui:button>

	</aui:button-row>
</aui:form>

<%-- 


<aui:form action="<%= addEntryURL %>" name="<portlet:namespace />fm">
        <aui:fieldset>
             <aui:input name="name"></aui:input>
             <aui:input name="department"></aui:input>
             <aui:input name="phone"></aui:input>
             <aui:input name="email"></aui:input>
             <aui:input name="message"></aui:input>
        </aui:fieldset>
        <aui:button-row>
            <aui:button type="submit"></aui:button>
        </aui:button-row>
</aui:form>

<%--             <aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>   --%>


