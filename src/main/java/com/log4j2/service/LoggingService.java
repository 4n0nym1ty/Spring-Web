package com.log4j2.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface LoggingService {
    
    void logRequest(HttpServletRequest httpServletRequest, Object body);

}
