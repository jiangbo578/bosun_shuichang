/**
 * Copyright (c) www.zouqi.com
 */

package com.gouhai.baoshan.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 拦截对/manage/*路径的访问。
 * 
 * 注：session名称为adminId
 * 
 * @author zhengzhi [zheng_zhi@163.com]
 */
public class ManageFilter implements Filter {
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //~
    }
    
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        HttpSession session = request.getSession();
        Object obj = session.getAttribute("adminId");
        if(obj == null){
            response.sendRedirect("/account/manage/login");
            return;
        }
        chain.doFilter(req, resp);
    }
    
    @Override
    public void destroy() {
        //~
    }

}
