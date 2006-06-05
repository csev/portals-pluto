/*
 * Copyright 2004 The Apache Software Foundation
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
package org.apache.pluto.maven;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;

/**
 *
 */
class InstallationDependency {

	public static final String VERSION = "1.1.0-dev";

    public static final InstallationDependency PORTLET_API =
        new InstallationDependency("javax.portlet", "portlet-api", "1.0");

    public static final InstallationDependency  DESCRIPTOR_API =
        new InstallationDependency("org.apache.pluto", "pluto-descriptor-api", VERSION);

    public static final InstallationDependency  DESCRIPTOR_IMPL =
            new InstallationDependency("org.apache.pluto", "pluto-descriptor-impl", VERSION);

    public static final InstallationDependency  CONTAINER =
            new InstallationDependency("org.apache.pluto", "pluto-container", VERSION);

    public static final InstallationDependency  TAGLIB =
            new InstallationDependency("org.apache.pluto", "pluto-taglib", VERSION);

    public static final InstallationDependency  PORTAL =
            new InstallationDependency("org.apache.pluto", "pluto-portal", VERSION, "war");

    public static final InstallationDependency  TESTSUITE =
            new InstallationDependency("org.apache.pluto", "pluto-testsuite", VERSION, "war");

    public static final InstallationDependency  CASTOR =
            new InstallationDependency("castor", "castor", "0.9.6");

    public static final InstallationDependency  XERCES =
            new InstallationDependency("xerces", "xercesImpl", "2.6.2");

    public static final InstallationDependency  XML_PARSER_APIS =
            new InstallationDependency("xerces", "xmlParserAPIs", "2.6.2");

    private static final List ENDORSED = new ArrayList();
    private static final List SHARED = new ArrayList();

    static {
        ENDORSED.add(XERCES);
        ENDORSED.add(XML_PARSER_APIS);

        SHARED.add(PORTLET_API);
        SHARED.add(DESCRIPTOR_API);
        SHARED.add(DESCRIPTOR_IMPL);
        SHARED.add(CONTAINER);
        SHARED.add(TAGLIB);
        SHARED.add(CASTOR);
    }


    public static Collection getEndorsedDependencies() {
        return Collections.unmodifiableCollection(ENDORSED);
    }

    public static Collection getSharedDependencies() {
        return Collections.unmodifiableCollection(SHARED);
    }

    private String groupId;
    private String artifactId;
    private String version;
    private String type;

    public InstallationDependency(String groupId, String artifactId, String version) {
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.version = version;
        this.type = "jar";
    }

    public InstallationDependency(String groupId, String artifactId, String version, String type) {
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.version = version;
        this.type = type;
    }


    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
