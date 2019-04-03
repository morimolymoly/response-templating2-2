package com.github.morimolymoly.template;
/*
 * Copyright (C) 2011 Thomas Akehurst
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



import com.github.jknack.handlebars.Helper;
import com.github.morimolymoly.template.helpers.Now2Helper;
import com.github.tomakehurst.wiremock.common.FileSource;
import com.github.tomakehurst.wiremock.extension.Parameters;
import com.github.tomakehurst.wiremock.extension.responsetemplating.ResponseTemplateTransformer;
import com.github.tomakehurst.wiremock.http.Request;
import com.github.tomakehurst.wiremock.http.ResponseDefinition;
import com.google.common.collect.ImmutableMap;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Trans extends ResponseTemplateTransformer {
    public static final String NAME2 = "response-template2";
    static Map<String, Helper> m = ImmutableMap.of("now2", (Helper)new Now2Helper());
	public Trans() {
		super(true, m);
	}
	@Override
    public boolean applyGlobally() {
        return true;
    }
	@Override
    public String getName() {
        return NAME2;
    }
	
    @Override
    public ResponseDefinition transform(Request request, ResponseDefinition responseDefinition, FileSource files, Parameters parameters) {
    	return super.transform(request, responseDefinition, files, parameters);
    }
}

