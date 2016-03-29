package com.zy.config;

import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

/**
 * Created by ab804 on 2015/10/15 0015.
 */
public class Initializer extends AbstractHttpSessionApplicationInitializer {

    public Initializer() {
        super(HttpSessionConfig.class);
    }
}
