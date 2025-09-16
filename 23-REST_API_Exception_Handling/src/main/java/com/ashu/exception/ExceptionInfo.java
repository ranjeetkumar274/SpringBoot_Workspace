package com.ashu.exception;

import java.time.LocalTime;

import lombok.Data;



@Data
public class ExceptionInfo {
	
	private String exceptionCode;
	private String exceptionMessage;
	private LocalTime timeStamp;
	
	
}
