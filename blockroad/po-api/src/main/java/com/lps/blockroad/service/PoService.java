package com.lps.blockroad.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lps.blockroad.Util.CamelMap;
import com.lps.blockroad.feign.UserFeignClient;
import com.lps.blockroad.mapper.PoMapper;
import com.lps.blockroad.vo.SrchCmsmVO;

@Service("poService")
public class PoService {
	
	@Autowired
	PoMapper poMapper;
	
	
	
    public void test(){
        System.out.println("test!!!!");
    }
    
//    public List<CamelMap> getPoLst(SrchCmsmVO vo){
//        System.out.println("test!!!!");
//        return userFeignClient.getUsers();
//		
//    }
}