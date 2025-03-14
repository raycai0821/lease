package com.atguigu.lease.common.exception;

import com.atguigu.lease.common.result.ResultCodeEnum;
import lombok.Data;

/**
 * @author leifeng.cai
 * @version 1.0
 * @desc Create by 2025/1/22 14:32
 */
@Data
public class LeaseException extends RuntimeException{

    /**
     *ctrl+H 查看继承关系
     */

    private Integer code;

    public LeaseException(Integer code, String msg){
        super(msg);
        this.code =code;
    }

    public LeaseException(ResultCodeEnum resultCodeEnum){
        super(resultCodeEnum.getMessage());
        this.code =resultCodeEnum.getCode();

    }
}
