package com.nuri.s5;

import static org.junit.Assert.*;

import java.sql.Date;

import javax.inject.Inject;

import org.junit.Test;

import com.nuri.s5.dao.MemberDAOImpl;
import com.nuri.s5.model.MemberVO;

public class MemberDAOTest extends TestAbstractCase{

	@Inject
	private MemberDAOImpl memberDAOImpl;
	
	@Test
	public void Join()throws Exception {
		MemberVO memberVO = new MemberVO();
		memberVO.setEmail("test@g.com");
		memberVO.setBirth("1999-12-13");
		memberVO.setGender("F");
		memberVO.setName("test");
		memberVO.setPw("test");
		
		int result = memberDAOImpl.memberJoin(memberVO);
		assertEquals(1, result);
	}

}