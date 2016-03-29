package com.zy.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpSession;

/**
 * Created by ab804 on 2015/10/16 0016.
 */
public class SessionRepositoryRequestWrapper extends HttpServletRequestWrapper {
    /**
     * Constructs a request object wrapping the given request.
     *
     * @param request
     * @throws IllegalArgumentException if the request is null
     */
    public SessionRepositoryRequestWrapper(HttpServletRequest request) {
        super(request);
    }


    @Override
    public HttpSession getSession(boolean create) {
        return super.getSession(create);
    }

    @Override
    public HttpSession getSession() {
        return getSession(true);
    }
}


