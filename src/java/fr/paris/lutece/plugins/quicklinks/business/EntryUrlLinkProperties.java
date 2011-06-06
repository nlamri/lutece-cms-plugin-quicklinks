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

import fr.paris.lutece.util.ReferenceList;

/**
 * The different types of {@link EntryUrl} link properties
 *
 */
public enum EntryUrlLinkProperties
{LINK_ON_TEXT_AND_IMAGE( 1, "quicklinks.entryUrlLinkProperties.linkTextImage.name" ),
    LINK_ON_TEXT( 2, "quicklinks.entryUrlLinkProperties.linkText.name" ),
    LINK_ON_IMAGE( 3, "quicklinks.entryUrlLinkProperties.linkImage.name" );

    private final int _nValue;
    private final String _strI18nKey;

    /**
     * Constructor : associate a value to enum
     * @param nValue The value
     */
    private EntryUrlLinkProperties( int nValue, String strI18nKey )
    {
        this._nValue = nValue;
        this._strI18nKey = strI18nKey;
    }

    /**
     * Return the enum value
     * @return The enum value
     */
    public int getValue(  )
    {
        return this._nValue;
    }

    /**
     * Return the enum i18n key
     * @return The enum i18n key
     */
    public String getI18nKey(  )
    {
        return this._strI18nKey;
    }

    /**
    * Get the {@link EntryUrlLinkProperties} by value
    * @param nValue The value
    * @return The {@link EntryUrlLinkProperties}
    */
    public static EntryUrlLinkProperties getByValue( int nValue )
    {
        for ( EntryUrlLinkProperties e : EntryUrlLinkProperties.values(  ) )
        {
            if ( e.getValue(  ) == nValue )
            {
                return e;
            }
        }

        return null;
    }

    /**
     * Get the {@link ReferenceList}
     * @return The {@link ReferenceList}
     */
    public static ReferenceList getReferenceList(  )
    {
        ReferenceList referenceList = new ReferenceList(  );

        for ( EntryUrlLinkProperties e : EntryUrlLinkProperties.values(  ) )
        {
            referenceList.addItem( e.getValue(  ), e.getI18nKey(  ) );
        }

        return referenceList;
    }
}
