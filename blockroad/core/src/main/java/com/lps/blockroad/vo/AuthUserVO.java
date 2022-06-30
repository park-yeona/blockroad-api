package com.lps.blockroad.vo;

import lombok.Data;

@Data
public class AuthUserVO {

    private String   authorGrpCode;
    private String   useYn;
    private String   rowStatus;
    private String[] authorGrpCodeArr;
    private String   userId;
    private String[] memberIdArr;

}