<%@ page errorPage="../../ErrorPage.jsp" %>

<jsp:useBean id="quicklinksQuicklinks" scope="session" class="fr.paris.lutece.plugins.quicklinks.web.QuicklinksJspBean" />


<% 
	quicklinksQuicklinks.init( request, quicklinksQuicklinks.RIGHT_MANAGE_QUICKLINKS);
    response.sendRedirect( quicklinksQuicklinks.doConfirmDisableQuicklinks( request ) );
%>
