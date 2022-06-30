package com.lps.blockroad.vo;

import com.lps.blockroad.Paging.PaginationInfoVO;

import lombok.Data;

@Data
public class SrchCmsmVO extends PaginationInfoVO {

    /* 코드 */

    private String srchMemberId = "";

    private String srchCommCode;

    private String srchCmmnGroupCode = "*";

    private String srchGroupTxt;
    /* 코드 END */

    /* 메뉴 */
    private String srchSysSpchcknCode = "07"; // 메뉴 구분 코드

    private String srchMenuCode;

    private String srchExtnlYn;
    /* 메뉴 END */

    /* 권한 */
    private String srchAuthorGrpNm;
    private String srchAuthorGrpCode;
    private String srchAuthorPopNm;
    private String srchAuthorGradCode;

    /* 권한 END */

    /* 부서 */
    private String srchDeptId;

    private String srchUpperDeptId;
    /* 부서 END */

    /* 코드 */
    private String srchCombo;
    /* 코드 END */

    private String srchUseYn = "Y";

    private String srchNics;

    private String srchDeptNm;

    private String srchType;

    private String srchValue;

    private String srchUserId;

    private String srchLocale;
}