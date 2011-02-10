<%@ page errorPage="../../ErrorPage.jsp" %>

<jsp:useBean id="quicklinksEntrySelectOption" scope="session" class="fr.paris.lutece.plugins.quicklinks.web.QuicklinksEntrySelectJspBean" />


<% 
quicklinksEntrySelectOption.init( request, quicklinksEntrySelectOption.RIGHT_MANAGE_QUICKLINKS);
    response.sendRedirect( quicklinksEntrySelectOption.doRemoveSelectOption( request ) );
%>
