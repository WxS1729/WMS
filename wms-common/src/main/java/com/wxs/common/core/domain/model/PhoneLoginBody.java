package com.wxs.common.core.domain.model;

import lombok.Data;



@Data
public class PhoneLoginBody {
    private String phone;
    private String code;
    private String uuid;
}
