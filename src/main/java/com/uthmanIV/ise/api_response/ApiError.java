package com.uthmanIV.ise.api_response;

import java.time.LocalDateTime;

public record ApiError(String message, LocalDateTime timestamp){

    public ApiError(String message){
        this(message,LocalDateTime.now());
    }
}
