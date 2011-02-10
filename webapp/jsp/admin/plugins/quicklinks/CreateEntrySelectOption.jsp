<%@ page errorPage="../../ErrorPage.jsp" %>
<jsp:include page="../../AdminHeader.jsp" />
<jsp:useBean id="quicklinksEntrySelectOption" scope="session" class="fr.paris.lutece.plugins.quicklinks.web.QuicklinksEntrySelectJspBean" />
<% quicklinksEntrySelectOption.init( request, quicklinksEntrySelectOption.RIGHT_MANAGE_QUICKLINKS); %>
<%= quicklinksEntrySelectOption.getCreateSelectOption( request ) %>

<%@ include file="../../AdminFooter.jsp" %>