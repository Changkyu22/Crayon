package com.nuri.s5.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.nuri.s5.model.ReviewFilesVO;
import com.nuri.s5.model.TourFilesVO;

@Repository
public class TourFilesDAO {

	@Inject
	private SqlSession sqlSession;
	private final static String NAMESPACE="tourFilesMapper.";
	
	public int fileWite(TourFilesVO tourFilesVO)throws Exception {
		return sqlSession.insert(NAMESPACE+"fileWrite", tourFilesVO);
	}
	
	public List<TourFilesVO> fileSelect(TourFilesVO tourFilesVO)throws Exception {
		return sqlSession.selectList(NAMESPACE+"fileSelect", tourFilesVO);
	}
}
