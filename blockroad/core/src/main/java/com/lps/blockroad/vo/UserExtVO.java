package com.lps.blockroad.vo;

import lombok.Data;

@Data
public class UserExtVO {

    private String memberId = "";

    private String deptId;

    private String userId ;

    private String userNm;

    private String loginId;

    private String registId;

    private String registDt;

    private String updtId;
    
    private String fileId;
    private String saveFilePath;
    private String changeFileNm;

    private String updtDt;
}