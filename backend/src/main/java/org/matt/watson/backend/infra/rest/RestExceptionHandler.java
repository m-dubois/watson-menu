package org.matt.watson.backend.controller;

import org.matt.watson.backend.exceptions.NonExistingMenuException;
import org.matt.watson.backend.exceptions.NonExistingStarterException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class RestExceptionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(RestExceptionHandler.class);

    @ExceptionHandler(NonExistingStarterException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void handleNonExistingStarter(HttpServletRequest req, Exception exception) {
        LOG.error("Starter not found : {}", req.getParameter("name"));
    }

    @ExceptionHandler(NonExistingMenuException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void handleNonExistingMenu(HttpServletRequest req, Exception exception) {
        LOG.error("Menu not found for URI : {}", req.getRequestURI());
    }

}
