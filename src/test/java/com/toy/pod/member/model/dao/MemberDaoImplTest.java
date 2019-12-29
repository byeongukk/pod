package com.toy.pod.member.model.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/spring-security.xml"
})
public class MemberDaoImplTest {

	@Test
	public void getLoginMember() {
		fail("Not yet implemented");
	}

}
