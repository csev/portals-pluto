/*
 * Copyright 2003,2004 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.pluto.binding;

/**
 * Implemented by the binding provider in order to represent a PortletDD
 * Binding.
 * @author <A href="mailto:ddewolf@apache.org">David H. DeWolf</A>
 * @version 1.0
 * @since Feb 24, 2004 at 7:52:06 PM
 */
public interface PortletDD {

    /** Standard Getter. */
    String getDescription();

    /** Standard Getter. */
    String getPortletName();

    /** Standard Getter. */
    String getDisplayName();

    /** Standard Getter. */
    String getPortletClass();

    /** Standard Getter. */
    InitParameterDD[] getInitParameters();

    /** Standard Getter. */
    int getExpirationCache();

    /** Standard Getter. */
    SupportedMimeTypeDD[] getSupportedMimeTypes();

    /** Standard Getter. */
    String[] getSupportedLocales();

    /** Standard Getter. */
    PortletInfoDD getPortletInfo();

    /** Standard Getter. */
    PortletPreferenceDD[] getPortletPreferences();

    /** Standard Getter. */
    String getPreferenceValidator();

    /** Standard Getter. */
    SecurityRoleRefDD[] getSecurityRoleRefs();

    /** Standard Getter. */
    String getResourceBundle();
}
