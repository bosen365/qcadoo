/**
 * ***************************************************************************
 * Copyright (c) 2010 Qcadoo Limited
 * Project: Qcadoo Framework
 * Version: 0.4.1
 *
 * This file is part of Qcadoo.
 *
 * Qcadoo is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation; either version 3 of the License,
 * or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 * ***************************************************************************
 */
package com.qcadoo.view.internal.api;

import java.util.Locale;

import org.json.JSONException;
import org.json.JSONObject;

import com.qcadoo.view.api.ComponentState;

public interface InternalComponentState extends ComponentState {

    /**
     * Initialize this component state using data from client. <b>For internal usage only</b>
     * 
     * @param json
     *            data from client
     * @param locale
     *            current localization
     * @throws JSONException
     *             when data from client contains errors
     */
    void initialize(JSONObject json, Locale locale) throws JSONException;

    /**
     * Renders this component state back to client. <b>For internal usage only</b>
     * 
     * @return data to client
     * @throws JSONException
     *             when data for client contains errors
     */
    JSONObject render() throws JSONException;
}