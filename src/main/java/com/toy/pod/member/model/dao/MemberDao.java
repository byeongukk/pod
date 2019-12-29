package com.toy.pod.member.model.dao;

import org.mybatis.spring.SqlSessionTemplate;

import com.toy.pod.member.model.vo.MemberVO;

public interface MemberDao {

	String selectEncPassword(SqlSessionTemplate sqlSession, MemberVO memberVO);

}
