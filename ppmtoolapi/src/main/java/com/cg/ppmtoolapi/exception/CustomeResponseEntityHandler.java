package com.cg.ppmtoolapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class CustomeResponseEntityHandler extends ResponseEntityExceptionHandler 
{

	@ExceptionHandler
	public ResponseEntity<Object> handlerProjectIdException(ProjectIdException ex, WebRequest request)
	{
		ProjectIdException projectIdExceptionResponse = new  ProjectIdException(ex.getMessage());
		return new ResponseEntity<Object>(projectIdExceptionResponse, HttpStatus.BAD_REQUEST);
	}
}
