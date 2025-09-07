package com.ashu.interceptor;



import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class AppInterceptor implements HandlerInterceptor {
	
	Logger logger = org.slf4j.LoggerFactory.getLogger(AppInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		long startTime = System.currentTimeMillis();
		request.setAttribute("startTime", startTime);
		
		logger.info("➡️ PreHandle: Request URL - " + request.getRequestURI() + " | Start Time: " + startTime);
		return true;
	}
	
	
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		logger.info("Request URL: " + request.getRequestURL().toString() + " :: Post Handle");
	}
	
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		long startTime = (Long) request.getAttribute("startTime");
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        logger.info("✅ AfterCompletion: Request URL - " + request.getRequestURI()
                + " | Processing Time: " + duration + " ms");

	}
}
