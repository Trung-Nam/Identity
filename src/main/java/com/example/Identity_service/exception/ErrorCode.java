package com.example.Identity_service.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@Getter
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized exception", HttpStatus.INTERNAL_SERVER_ERROR),
    KEY_INVALID(1001, "Invalid key provided", HttpStatus.BAD_REQUEST),
    USER_EXISTS(1002, "User already exists" , HttpStatus.BAD_REQUEST),
    USERNAME_INVALID(1003, "Username must be at least 3 characters long", HttpStatus.BAD_REQUEST),
    PASSWORD_INVALID(1004, "Password must be at least 8 characters long", HttpStatus.BAD_REQUEST),
    USER_NOT_FOUND(1005, "User not found", HttpStatus.NOT_FOUND),
    UNAUTHENTICATED(1006, "User is not authenticated", HttpStatus.UNAUTHORIZED),
    UNAUTHORIZED(1007, "User is not authorized to perform this action", HttpStatus.FORBIDDEN)
    ;
    private final   int code;
    private final String message;
    private final HttpStatusCode statusCode;

     ErrorCode(int code, String message, HttpStatusCode statusCode) {
        this.code = code;
        this.message = message;
        this.statusCode = statusCode;
    }
}
