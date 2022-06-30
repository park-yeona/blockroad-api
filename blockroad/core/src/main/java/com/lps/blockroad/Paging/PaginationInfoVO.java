package com.lps.blockroad.Paging;

import lombok.Data;

@Data
public class PaginationInfoVO extends PaginationInfo{
	private int dummyCurrentPageNo = 1;
    private int dummyRecordCountPerPage = 20;
    private int dummyPageSize = 10;

    private int currentPageNo = 1;

    private int recordCountPerPage = 30;

    private int pageSize = 10;

    private String srchMemberId;
    private String srchVal;
    private String srchUseYn;
    private String srchLocale;
}