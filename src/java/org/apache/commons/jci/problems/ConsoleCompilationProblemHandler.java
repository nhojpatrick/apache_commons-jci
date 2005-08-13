/*
 * Copyright 1999-2004 The Apache Software Foundation.
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
package org.apache.commons.jci.problems;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;



/**
 * @author tcurdt
 *
 */
public class ConsoleCompilationProblemHandler implements CompilationProblemHandler {
    
    private final static Log log = LogFactory.getLog(ConsoleCompilationProblemHandler.class);

    private int errors;
    private int warnings;
    
    public void handle( final CompilationProblem pProblem ) {
        if (pProblem.isFatal()) {
            errors++;
            System.err.println("error(" + errors + "):" + pProblem);
        } else {
            warnings++;
            System.err.println("warning(" + warnings + "):" + pProblem);
        }        
    }
    
    
    public int getErrorCount() {
        return errors;
    }
    public int getWarningCount() {
        return warnings;
    }
}