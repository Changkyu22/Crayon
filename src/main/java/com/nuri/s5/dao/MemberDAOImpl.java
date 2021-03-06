package com.nuri.s5.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.nuri.s5.model.MemberVO;
import com.nuri.s5.model.TourCalendarVO;
import com.nuri.s5.util.Pager;

	@Repository
	public class MemberDAOImpl implements MemberDAO {
		
	@Inject
	private SqlSession sqlSession;
	private final static String NAMESPACE = "memberMapper.";

	@Override
	public int memberJoin(MemberVO memberVO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.insert(NAMESPACE+"memberJoin", memberVO);
	}

	@Override
	public MemberVO memberLogin(MemberVO memberVO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"memberLogin", memberVO);
	}

	@Override
	public int memberUpdate(MemberVO memberVO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.update(NAMESPACE+"memberUpdate", memberVO);
	}

	@Override
	public int memberDelete(MemberVO memberVO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.delete(NAMESPACE+"memberDelete", memberVO);
	}
	@Override
	public int memberAdminDelete(MemberVO memberVO)throws Exception{
		
		return sqlSession.delete(NAMESPACE+"memberAdminDelete", memberVO);
	}
	
	@Override
	public MemberVO memberSelect(MemberVO memberVO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVO memberIdCheck(MemberVO memberVO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"memberIdCheck", memberVO);
	}
	
	@Override
	public MemberVO memberSearchID(MemberVO memberVO)throws Exception{
		
		return sqlSession.selectOne(NAMESPACE+"memberSearchID", memberVO);
	}
	@Override
	public MemberVO memberSearchPW(MemberVO memberVO)throws Exception{
		
		return sqlSession.selectOne(NAMESPACE+"memberSearchPW", memberVO);
	}

	@Override
	public int memberKakao(MemberVO memberVO) throws Exception {
		return sqlSession.insert(NAMESPACE+"memberKakao",memberVO);
	}
	
	@Override
	public MemberVO selectKakao(MemberVO memberVO)throws Exception {
		return sqlSession.selectOne(NAMESPACE+"selectKakao", memberVO);
	}

	@Override
	public List<MemberVO> memberList(Pager pager)throws Exception{
		return sqlSession.selectList(NAMESPACE+"memberList", pager);
	}
	@Override
	public int memberCount(Pager pager) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"memberCount",pager);
	}
	@Override
	public int memberCountUpdate(MemberVO memberVO)throws Exception{
		return sqlSession.update(NAMESPACE+"memberCountUpdate", memberVO);
	}
	
	@Override
	public int touradd(TourCalendarVO tourCalendarVO)throws Exception{
		return sqlSession.insert(NAMESPACE+"touradd", tourCalendarVO);
	}
	@Override
	public int tourDelete(TourCalendarVO tourCalendarVO)throws Exception{
		return sqlSession.delete(NAMESPACE+"tourDelete", tourCalendarVO);
	}
	
	}
