package com.github.morimolymoly.template.helpers;

import java.io.IOException;

import com.github.jknack.handlebars.Helper;
import com.github.jknack.handlebars.Options;

public class Now2Helper implements Helper<Object>{
    private HandlebarsCurrentDateHelper2 helper = new HandlebarsCurrentDateHelper2();

    @Override
    public Object apply(final Object context, final Options options) throws IOException {
        return this.helper.apply(null, options);
    }

}
