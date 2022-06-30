package com.lps.blockroad.conroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lps.blockroad.Util.CamelMap;
import com.lps.blockroad.service.UserService;
import com.lps.blockroad.vo.SrchCmsmVO;

//import com.board.dao.TestMapper;
//import com.board.service.TestService;

@RestController
public class UserController {

	@Autowired 
	UserService userService;

	@GetMapping("/users")
	public List<CamelMap> users(SrchCmsmVO srchVO) {
		//	System.out.println(">>>>>>>Test"+srchVO.getLastRecordIndex());
		return  userService.getUserLst(srchVO);
	}
	
	
	
}