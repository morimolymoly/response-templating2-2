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
package com.github.morimolymoly.template.helpers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class RenderableDate2 {

    private final Date date;
    private final String format;
    private final String timezoneName;

    public RenderableDate2(Date date, String format, String timezone) {
        this.date = date;
        this.format = format;
        this.timezoneName = timezone;
    }

    @Override
    public String toString() {
        if (format != null) {
        	if(format.equals("epoch-sec")) {
        		return String.valueOf(date.getTime()/1000);
        	} else if (format.equals("epoch")) {
        		return String.valueOf(date.getTime());
        	}
            return formatCustom();
        }

        return "";
    }

    private String formatCustom() {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        if (timezoneName != null) {
            TimeZone zone = TimeZone.getTimeZone(timezoneName);
            dateFormat.setTimeZone(zone);
        }
        return dateFormat.format(date);
    }
}
