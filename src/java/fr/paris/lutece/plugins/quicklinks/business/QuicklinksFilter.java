/*
 * Copyright (c) 2002-2009, Mairie de Paris
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
package fr.paris.lutece.plugins.quicklinks.business;


/**
 * Filter class for Quicklinks
 *
 */
public class QuicklinksFilter
{
    private String[] _arrayRoleKey;
    private String _strWorkgroupKey;
    private QuicklinksType _enumType;
    private Boolean _bIsEnabled;

    /**
     * @return the roleKey array
     */
    public String[] getRoleKeys(  )
    {
        return _arrayRoleKey;
    }

    /**
     * Define a filter on role key array.
     * Filter {@link Quicklinks} list with this filter will return {@link Quicklinks} who matches with one of the role key list
     * @param strRoleKeys the roleKey array to set
     */
    public void setRoleKeys( String[] arrayRoleKey )
    {
        this._arrayRoleKey = arrayRoleKey;
    }

    /**
     * @return the type
     */
    public QuicklinksType getType(  )
    {
        return _enumType;
    }

    /**
     * @param enumType the type to set
     */
    public void setType( QuicklinksType enumType )
    {
        this._enumType = enumType;
    }

    /**
     * @return the isEnabled
     */
    public Boolean isEnabled(  )
    {
        return _bIsEnabled;
    }

    /**
     * Use Boolean to set the isEnabled property of Quicklinks filter
     * Can be null if filter does not be used
     * @param bIsEnabled the isEnabled to set
     */
    public void setEnabled( Boolean bIsEnabled )
    {
        this._bIsEnabled = bIsEnabled;
    }

    /**
         * @return the _strWorkgroupKey
         */
    public String getWorkgroup(  )
    {
        return _strWorkgroupKey;
    }

    /**
     * @param strWorkgroupKey the _strWorkgroupKey to set
     */
    public void setWorkgroup( String strWorkgroupKey )
    {
        _strWorkgroupKey = strWorkgroupKey;
    }
}
