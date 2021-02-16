package com.cg.ppmtoolapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProjectIdExceptionResponse {
	
	private String ProjectIdentifier;

	public String getProjectIdentifier() {
		return ProjectIdentifier;
	}

	public void setProjectIdentifier(String projectIdentifier) {
		ProjectIdentifier = projectIdentifier;
	}
	
	
}
