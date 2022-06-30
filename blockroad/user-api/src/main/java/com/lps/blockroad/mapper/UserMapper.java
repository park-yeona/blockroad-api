package com.lps.blockroad.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lps.blockroad.Util.CamelMap;
import com.lps.blockroad.vo.SrchCmsmVO;

@Mapper
public interface UserMapper {
	
	  int test();
	  List<CamelMap> getUserLst(SrchCmsmVO vo);
	
}