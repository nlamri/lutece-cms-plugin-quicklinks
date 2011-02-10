<%@ page errorPage="../../ErrorPage.jsp" %>
<jsp:include page="../../AdminHeader.jsp" />
<jsp:useBean id="quicklinksQuicklinks" scope="session" class="fr.paris.lutece.plugins.quicklinks.web.QuicklinksJspBean" />
<% quicklinksQuicklinks.init( request, quicklinksQuicklinks.RIGHT_MANAGE_QUICKLINKS); %>
<%= quicklinksQuicklinks.getCreateEntry( request ) %>

<%@ include file="../../AdminFooter.jsp" %>