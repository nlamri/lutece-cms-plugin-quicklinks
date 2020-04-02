/*
 * Copyright (c) 2002-2020, City of Paris
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

import fr.paris.lutece.portal.service.plugin.Plugin;

import java.util.Collection;

/**
 * Interface for {@link Quicklinks} DAO
 *
 */
public interface IQuicklinksDAO
{
    /**
     * Calculate a new primary key to add a new {@link Quicklinks}
     *
     * @param plugin
     *            The {@link Plugin} using this data access service
     * @return The new key.
     */
    int newPrimaryKey( Plugin plugin );

    /**
     * Insert a new record in the table.
     *
     * @param quicklinks
     *            The Instance of the object {@link Quicklinks}
     * @param plugin
     *            The {@link Plugin} using this data access service
     * @return The new {@link Quicklinks}
     */
    Quicklinks insert( Quicklinks quicklinks, Plugin plugin );

    /**
     * Delete the {@link Quicklinks} specified by identifier
     *
     * @param nIdQuicklinks
     *            The identifier
     * @param plugin
     *            The {@link Plugin} using this data access service
     */
    void delete( int nIdQuicklinks, Plugin plugin );

    /**
     * Update The {@link Quicklinks}
     *
     * @param quicklinks
     *            The {@link Quicklinks} to update
     * @param plugin
     *            The {@link Plugin} using this data access service
     */
    void store( Quicklinks quicklinks, Plugin plugin );

    /**
     * Load the Quicklinks specified by Identifier
     *
     * @param nIdQuicklinks
     *            The identifier
     * @param plugin
     *            The {@link Plugin} using this data access service
     * @return The {@link Quicklinks}
     */
    Quicklinks load( int nIdQuicklinks, Plugin plugin );

    /**
     * Find All {@link Quicklinks}
     *
     * @param plugin
     *            The {@link Plugin} using this data access service
     * @return A {@link Collection} of {@link Quicklinks}
     */
    Collection<Quicklinks> findAll( Plugin plugin );

    /**
     * Find all {@link Quicklinks} corresponding to {@link QuicklinksFilter}
     *
     * @param quickLinksFilter
     *            The {@link QuicklinksFilter}
     * @param plugin
     *            The {@link Plugin} using this data access service
     * @return A {@link Collection} of {@link Quicklinks}
     */
    Collection<Quicklinks> findbyFilter( QuicklinksFilter quickLinksFilter, Plugin plugin );
}
