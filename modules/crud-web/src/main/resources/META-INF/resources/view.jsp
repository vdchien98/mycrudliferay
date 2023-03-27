<%@ include file="/init.jsp" %>
<liferay-ui:success key="entryAdded" message="entry-added" />
<liferay-ui:success key="guestbookAdded" message="guestbook-added" />
<liferay-ui:success key="entryDeleted" message="entry-deleted" />


<portlet:renderURL var="addEntryURL">
    <portlet:param name="mvcPath" value="/edit_CRUD.jsp"></portlet:param>
</portlet:renderURL>

<aui:button-row cssClass="guestbook-buttons">
    <aui:button onClick="<%= addEntryURL.toString() %>" value="Create User"></aui:button>
</aui:button-row>

<liferay-ui:search-container  total="<%=CRUDLocalServiceUtil.getEntriesCount()%>>
<liferay-ui:search-container-results />

<liferay-ui:search-container-row className="crud.backend.model.CRUD" modelVar="crud">
    <liferay-ui:search-container-column-text property="name" />
    <liferay-ui:search-container-column-text property="department" />
    <liferay-ui:search-container-column-text property="email" />
     <liferay-ui:search-container-column-text property="phone" />
      <liferay-ui:search-container-column-text property="message" />
</liferay-ui:search-container-row>

<liferay-ui:search-iterator />

</liferay-ui:search-container>