package com.nagaza.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

/**
 * CORSFilter
 */
@WebFilter(urlPatterns = "/*")
public class CORSFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
        HttpServletResponse httpresponse = (HttpServletResponse) response;
        httpresponse.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        httpresponse.setHeader("Access-Control-Max-Age", "3600");
        httpresponse.setHeader("Access-Control-Allow-Headers", "x-requested-with");
        httpresponse.setHeader("Access-Control-Allow-Origin", "*");

        chain.doFilter(request, response);
        System.out.println("do CORS Filter !!");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}