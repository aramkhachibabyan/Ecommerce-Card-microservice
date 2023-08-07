package com.smartcode.wallet.util;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class ApiError {

private Integer status;
private String path;
private Map<String,String> errors;

public ApiError(Integer status, String path, Map<String,String> errord){
    this.status = status;
    this.path = path;
    this.errors = errord;
}

}
