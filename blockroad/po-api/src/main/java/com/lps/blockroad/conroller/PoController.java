package com.lps.blockroad.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lps.blockroad.service.PoService;
import com.lps.blockroad.vo.SrchCmsmVO;

//import com.board.dao.TestMapper;
//import com.board.service.TestService;

@RestController
public class PoController {

	@Autowired 
	PoService poService;
	
	
//	@Autowired  
//	UserFeignClient userFeignClient;
//	
	
//	@GetMapping("/pos")
//	public List<CamelMap> pos(SrchCmsmVO srchVO) {
//		return  userFeignClient.getUsers();
//	}
	
	@GetMapping("/pos")
	public void pos(SrchCmsmVO srchVO) {
			System.out.println(">>>>>>>Test"+srchVO.getLastRecordIndex());
	}
	
	
	
}