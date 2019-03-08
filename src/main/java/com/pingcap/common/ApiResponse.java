package com.pingcap.common;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
public class ApiResponse<T> implements Serializable {
    private static final long serialVersionUID = 93732L;

    private String id = UUID.randomUUID().toString();
    private int code = HttpStatus.OK.value();
    private String message = HttpStatus.OK.getReasonPhrase();
    private T data = null;

    public ApiResponse() {
        super();
    }

    public ApiResponse(T data) {
        super();
        this.data = data;
    }

    public ApiResponse(int code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    public ApiResponse(int code, String message, T data) {
        super();
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
