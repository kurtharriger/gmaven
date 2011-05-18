/*
 * Copyright (C) 2006-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.codehaus.gmaven.runtime.v1_8;

import org.codehaus.gmaven.feature.Component;
import org.codehaus.gmaven.feature.support.FeatureSupport;
import org.codehaus.gmaven.runtime.TraceSanitizer;
import org.codehaus.gmaven.runtime.support.TraceSanitizerSupport;

/**
 * Provides the stack trace sanitization feature.
 *
 * @version $Id$
 * @author <a href="mailto:jason@planet57.com">Jason Dillon</a>
 */
public class TraceSanitizerFeature
    extends FeatureSupport
{
    public TraceSanitizerFeature() {
        super(TraceSanitizer.KEY);
    }

    @Override
    protected Component doCreate() throws Exception {
        return new TraceSanitizerSupport(this);
    }
}