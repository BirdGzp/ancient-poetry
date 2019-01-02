package com.moon.ancientpoetry.web.config;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.FilterConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

/**
 * @Author: zhipeng gong
 * @Date: 2019/1/2 16:21
 * @Description:
 */
public class AccessFilter implements Filter {

    Logger log = LoggerFactory.getLogger(AccessFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        Date begin = new Date();
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String accessLoggerStr = "";
        int statusCode = 500;
        try
        {
            HttpServletResponse response = (HttpServletResponse) servletResponse;
            HttpServletResponseWrapper responseWrapper = new HttpServletResponseWrapper(response);
            filterChain.doFilter(servletRequest, responseWrapper);
            statusCode = responseWrapper.getStatus();
        }
        catch (RuntimeException ex)
        {
            log.error("access log filter throw exception:", ex);
            throw ex;
        }
        finally
        {
            if(!request.getRequestURI().contains("/assets/")){
                accessLoggerStr = getAccessLog(request, statusCode, begin);
                System.out.println(accessLoggerStr);
            }
        }

    }

    @Override
    public void destroy() {

    }

    private String getAccessLog(HttpServletRequest request, int stateCode, Date begin)
    {
        StringBuilder sb = new StringBuilder();
        try
        {
            //user ip
            String xff = request.getHeader("X-Forwarded-For");
            String previousHopIp = request.getRemoteAddr();
            if (xff == null || xff.trim().length() == 0 || "unknown".equals(xff))
            {
                xff = previousHopIp;
            }
            xff = xff.replaceAll(" ", "");
            sb.append(xff).append(" ").append(previousHopIp);



            //request time
            SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd:HH:mm:ss.SSS");

            String time = format.format(begin);
            sb.append("[").append(time).append(" +0800] ");

            //request method
            String method = request.getMethod();
            sb.append("\"").append(method).append(" ");

            //request url
            sb.append(request.getRequestURI());

            //request params
            sb.append("?");
            Enumeration<?> enumeration = request.getParameterNames();
            while (enumeration.hasMoreElements()) {
                String paramName = (String) enumeration.nextElement();
                String[] outerArray = request.getParameterValues(paramName);
                for (String paramValue : outerArray){
                    sb.append(paramName).append("=").append(URLEncoder.encode(paramValue, "UTF-8")).append("&");
                }
            }

            //protocol
            sb.append(request.getProtocol()).append("\" ");

            //state code
            sb.append(stateCode).append(" - ");

            //referer
            String referer = request.getHeader("Referer");
            sb.append("\"").append(StringUtils.isBlank(referer) ? "-" : referer).append("\" ");

            //user agent
            String userAgent = request.getHeader("User-Agent");
            sb.append("\"").append(StringUtils.isBlank(userAgent) ? "-" : userAgent).append("\" ");

            //响应时间
            sb.append(String.valueOf(System.currentTimeMillis() - begin.getTime())).append(" ");

            //session id
            String sessionId = request.getSession().getId();
            sb.append(sessionId + " ");

        }
        catch (Exception ex)
        {
            log.error("get access log string Exception:", ex);
        }
        return sb.toString();
    }
}
