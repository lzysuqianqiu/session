package com.zy.config;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by ab804 on 2015/10/16 0016.
 */
public class SessionRepositoryFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        SessionRepositoryRequestWrapper customerRequest = new SessionRepositoryRequestWrapper(req);

        chain.doFilter(customerRequest, response);


    }

    @Override
    public void destroy() {

    }
}
