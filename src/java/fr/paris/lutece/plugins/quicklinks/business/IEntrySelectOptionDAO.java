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
 * Interface IEntrySelectOptionDAO
 */
public interface IEntrySelectOptionDAO
{
    /**
     * Insert the {@link EntrySelectOption}
     *
     * @param option
     *            The {@link EntrySelectOption} to insert
     * @param plugin
     *            The {@link Plugin}
     * @return The {@link EntrySelectOption}
     */
    EntrySelectOption insert( EntrySelectOption option, Plugin plugin );

    /**
     * Delete the {@link EntrySelectOption} whose identifier is specified in parameter
     *
     * @param nId
     *            The identifier of the {@link EntrySelectOption}
     * @param nIdEntry
     *            The Entry identifier
     * @param plugin
     *            The {@link Plugin}
     */
    void delete( int nId, int nIdEntry, Plugin plugin );

    /**
     * Update the {@link EntrySelectOption}
     *
     * @param option
     *            The {@link EntrySelectOption} object
     * @param plugin
     *            The {@link Plugin}
     */
    void store( EntrySelectOption option, Plugin plugin );

    /**
     * Load the data of the {@link EntrySelectOption} from the table
     *
     * @param nId
     *            The identifier of the entry select option
     * @param nIdEntry
     *            The Entry identifier
     * @param plugin
     *            the plugin
     * @return the instance of the {@link EntrySelectOption}
     */
    EntrySelectOption load( int nId, int nIdEntry, Plugin plugin );

    /**
     * Load the data of all entry type returns them in a list
     * 
     * @param plugin
     *            the plugin
     * @return the {@link Collection} of entry type
     */
    Collection<EntrySelectOption> select( Plugin plugin );

    /**
     * Load the option list for an entrySelect
     * 
     * @param nIdEntry
     *            The entry Id
     * @param plugin
     *            the plugin
     * @return the {@link Collection} of {@link EntrySelectOption}
     */
    Collection<EntrySelectOption> selectByEntry( int nIdEntry, Plugin plugin );
}
