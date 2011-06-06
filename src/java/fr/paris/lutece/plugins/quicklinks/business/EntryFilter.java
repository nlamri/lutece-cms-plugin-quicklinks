/*
 * Copyright (c) 2002-2011, Mairie de Paris
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
 * This class represent the Entry filter
 *
 */
public class EntryFilter
{
    public static final int UNUSED_ATTRIBUTE_VALUE = -1;
    private int _nId;
    private int _nIdQuicklinks;
    private int _nIdType;
    private int _nIdOrder;
    private int _nIdParent;

    /**
     * Constructor : initialize the filter attributes with the unused attribute value
     */
    public EntryFilter(  )
    {
        setId( UNUSED_ATTRIBUTE_VALUE );
        setIdQuicklinks( UNUSED_ATTRIBUTE_VALUE );
        setIdType( UNUSED_ATTRIBUTE_VALUE );
        setIdOrder( UNUSED_ATTRIBUTE_VALUE );
        setIdParent( UNUSED_ATTRIBUTE_VALUE );
    }

    /**
    * @return the id
    */
    public int getId(  )
    {
        return _nId;
    }

    /**
     * @param nId the id to set
     */
    public void setId( int nId )
    {
        _nId = nId;
    }

    /**
     * @return the idQuicklinks
     */
    public int getIdQuicklinks(  )
    {
        return _nIdQuicklinks;
    }

    /**
     * @param nIdQuicklinks the idQuicklinks to set
     */
    public void setIdQuicklinks( int nIdQuicklinks )
    {
        _nIdQuicklinks = nIdQuicklinks;
    }

    /**
     * @return the idType
     */
    public int getIdType(  )
    {
        return _nIdType;
    }

    /**
     * @param nIdType the idType to set
     */
    public void setIdType( int nIdType )
    {
        _nIdType = nIdType;
    }

    /**
     * @return the idOrder
     */
    public int getIdOrder(  )
    {
        return _nIdOrder;
    }

    /**
     * @param nIdOrder the idOrder to set
     */
    public void setIdOrder( int nIdOrder )
    {
        _nIdOrder = nIdOrder;
    }

    /**
     * @return the idParent
     */
    public int getIdParent(  )
    {
        return _nIdParent;
    }

    /**
     * @param idParent the idParent to set
     */
    public void setIdParent( int idParent )
    {
        this._nIdParent = idParent;
    }
}
