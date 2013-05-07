/*
 * Copyright (c) 2002-2013, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.quicklinks.service;

import fr.paris.lutece.plugins.quicklinks.business.Quicklinks;
import fr.paris.lutece.plugins.quicklinks.business.QuicklinksHome;
import fr.paris.lutece.portal.service.plugin.PluginService;
import fr.paris.lutece.portal.service.rbac.Permission;
import fr.paris.lutece.portal.service.rbac.ResourceIdService;
import fr.paris.lutece.portal.service.rbac.ResourceType;
import fr.paris.lutece.portal.service.rbac.ResourceTypeManager;
import fr.paris.lutece.portal.service.util.AppLogService;
import fr.paris.lutece.util.ReferenceList;

import java.util.Locale;


/**
 *
 * class QuicklinksResourceIdService
 *
 */
public class QuicklinksResourceIdService extends ResourceIdService
{
    /** Permission for creating a quicklinks */
    public static final String PERMISSION_CREATE = "CREATE";

    /** Permission for deleting a quicklinks */
    public static final String PERMISSION_DELETE = "DELETE";

    /** Permission for modifying a quicklinks */
    public static final String PERMISSION_MODIFY = "MODIFY";

    /** Permission for copying a quicklinks */
    public static final String PERMISSION_COPY = "COPY";

    /** Permission for enable quicklinks */
    public static final String PERMISSION_CHANGE_STATE = "CHANGE_STATE";
    private static final String PROPERTY_LABEL_RESOURCE_TYPE = "quicklinks.permission.label.resourceType";
    private static final String PROPERTY_LABEL_CREATE = "quicklinks.permission.label.create";
    private static final String PROPERTY_LABEL_DELETE = "quicklinks.permission.label.delete";
    private static final String PROPERTY_LABEL_MODIFY = "quicklinks.permission.label.modify";
    private static final String PROPERTY_LABEL_COPY = "quicklinks.permission.label.copy";
    private static final String PROPERTY_LABEL_CHANGE_STATE = "quicklinks.permission.label.changeState";

    /** Creates a new instance of DocumentTypeResourceIdService */
    public QuicklinksResourceIdService(  )
    {
        setPluginName( QuicklinksPlugin.PLUGIN_NAME );
    }

    /**
     * Initializes the service
     */
    public void register(  )
    {
        ResourceType rt = new ResourceType(  );
        rt.setResourceIdServiceClass( QuicklinksResourceIdService.class.getName(  ) );
        rt.setPluginName( QuicklinksPlugin.PLUGIN_NAME );
        rt.setResourceTypeKey( Quicklinks.RESOURCE_TYPE );
        rt.setResourceTypeLabelKey( PROPERTY_LABEL_RESOURCE_TYPE );

        Permission p = new Permission(  );
        p.setPermissionKey( PERMISSION_CREATE );
        p.setPermissionTitleKey( PROPERTY_LABEL_CREATE );
        rt.registerPermission( p );

        p = new Permission(  );
        p.setPermissionKey( PERMISSION_MODIFY );
        p.setPermissionTitleKey( PROPERTY_LABEL_MODIFY );
        rt.registerPermission( p );

        p = new Permission(  );
        p.setPermissionKey( PERMISSION_COPY );
        p.setPermissionTitleKey( PROPERTY_LABEL_COPY );
        rt.registerPermission( p );

        p = new Permission(  );
        p.setPermissionKey( PERMISSION_CHANGE_STATE );
        p.setPermissionTitleKey( PROPERTY_LABEL_CHANGE_STATE );
        rt.registerPermission( p );

        p = new Permission(  );
        p.setPermissionKey( PERMISSION_DELETE );
        p.setPermissionTitleKey( PROPERTY_LABEL_DELETE );
        rt.registerPermission( p );

        ResourceTypeManager.registerResourceType( rt );
    }

    /**
     * Returns a list of quicklinks resource ids
     * @param locale The current locale
     * @return A list of resource ids
     */
    public ReferenceList getResourceIdList( Locale locale )
    {
        return QuicklinksHome.findReferenceList( PluginService.getPlugin( QuicklinksPlugin.PLUGIN_NAME ) );
    }

    /**
     * Returns the Title of a given resource
     * @param strId The Id of the resource
     * @param locale The current locale
     * @return The Title of a given resource
     */
    public String getTitle( String strId, Locale locale )
    {
        int nIdQuicklinks = -1;

        try
        {
            nIdQuicklinks = Integer.parseInt( strId );
        }
        catch ( NumberFormatException ne )
        {
            AppLogService.error( ne );
        }

        Quicklinks quicklinks = QuicklinksHome.findByPrimaryKey( nIdQuicklinks,
                PluginService.getPlugin( QuicklinksPlugin.PLUGIN_NAME ) );

        return quicklinks.getTitle(  );
    }
}
