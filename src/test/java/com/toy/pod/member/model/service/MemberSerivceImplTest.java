package com.toy.pod.member.model.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.toy.pod.member.model.dao.MemberDao;
import com.toy.pod.member.model.dao.MemberDaoImplTest;
import com.toy.pod.member.model.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/spring-security.xml"
})
public class MemberSerivceImplTest {
	
	@Autowired
	private MemberDao md;
	
	private MemberVO memberVO;
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Before
	public void beforeMethod() {
		MemberVO loginMemberVO = new MemberVO();
		loginMemberVO.setMemberId("uukk");
		loginMemberVO.setEmail("cbuk92@gmail.com");
		loginMemberVO.setMemberPwd("1234");
		
		memberVO = loginMemberVO;
	}
	
	@Test
	public void getLoginMember() {
		MemberVO loginMember = null;
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
