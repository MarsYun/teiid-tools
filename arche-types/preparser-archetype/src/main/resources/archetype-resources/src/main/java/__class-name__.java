/*
 * Copyright Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags and
 * the COPYRIGHT.txt file distributed with this work.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ${package};

import org.teiid.PreParser;
import org.teiid.CommandContext;
import org.teiid.logging.LogManager;
import org.teiid.core.BundleUtil;
import org.teiid.logging.LogConstants;

/**
*  User Defined PreParser: ${class-name}
*
**/

public class ${class-name} implements PreParser {

     public static final BundleUtil UTIL = BundleUtil.getBundleUtil(${class-name}.class);

    @Override
    public String preParse(String command, CommandContext context) {
        //manipulate the command
        String rtn = command;

        LogManager.logDetail(LogConstants.CTX_QUERY_RESOLVER, "preparsing command " + command); //$NON-NLS-1$

        return rtn;
    }
}
