package com.toy.pod;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:root-context.xml"
})
public class SqlSessionTest {
	@Autowired
	private SqlSession sqlSession;
	@Autowired
	private BasicDataSource dataSource;
	@Test
	public void test() {
		System.out.println(sqlSession);
		System.out.println(dataSource);
	}

}
