package com.lps.blockroad.vo;

import lombok.Data;

@Data
public class UserVO extends UserExtVO {

    private String memberId;
    private String memberNm;
    private String userId;
    private String mailChk;
    private String[] userIdArr;
    private String loginId;
    private String certYn;
    private String fileId;
    private String saveFilePath;
    private String changeFileNm;
    private String updtDt;
    private String sysSpchcknCode;
    private String deptNm;
    private String orgNm;
    private String userNm;

    private String phone;
    private String email;
    private String useChkYn = "N";
    private String userChkKey;

    private String userPassword;
    private String rePassword;

    private String authorGradCode;
    private String lang;
    private String authorGrpCode;
    private String sortSn;
    private String extnlYn;
    private String useYn;
    private String rowStatus;
    private String tmpUserId;
    
    private String status;
    private String statusUpdtDt;
}