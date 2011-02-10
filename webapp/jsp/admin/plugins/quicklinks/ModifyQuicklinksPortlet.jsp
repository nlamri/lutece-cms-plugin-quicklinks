<%@ page errorPage="../../ErrorPage.jsp" %>
<jsp:include page="../../PortletAdminHeader.jsp" />
<jsp:useBean id="quicklinksPortlet" scope="session" class="fr.paris.lutece.plugins.quicklinks.web.portlet.QuicklinksPortletJspBean" />
<% quicklinksPortlet.init( request,quicklinksPortlet.RIGHT_MANAGE_ADMIN_SITE ); %>
<%= quicklinksPortlet.getModify(request) %>

<%@ include file="../../AdminFooter.jsp" %>