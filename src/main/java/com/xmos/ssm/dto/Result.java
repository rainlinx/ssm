package com.xmos.ssm.dto;

import lombok.Data;

/**
 * 统一json返回格式
 */
@Data
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;
}
