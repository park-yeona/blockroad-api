package com.lps.blockroad.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lps.blockroad.Util.CamelMap;
import com.lps.blockroad.mapper.UserMapper;
import com.lps.blockroad.vo.SrchCmsmVO;

@Service("userService")
public class UserService {
	
	@Autowired
	UserMapper userMapper;
	
	
    public void test(){
        System.out.println("test!!!!");
    }
    
    public List<CamelMap> getUserLst(SrchCmsmVO vo){
    	System.out.println("test!!!!");
        return userMapper.getUserLst(vo);
		
    }
}