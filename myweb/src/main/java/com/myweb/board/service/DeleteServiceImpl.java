package com.myweb.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myweb.board.model.BoardDAO;

public class DeleteServiceImpl implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		/*
		 * 	1. DeleteServiceImpl을 생성한다.
		 * 	2. 서비스 영역에서는 num을 받아서 delete()메서드를 실행
		 * 	3. DAO의 delete()에서는 delete 구문으로 삭제
		 * 	4. 페이지 이동을 목록으로
		 * 
		 * 	sql = "delete from board where num =?";
		 *
		 */
		
		String num = request.getParameter("num");
		
		BoardDAO dao = BoardDAO.getInstance();
		dao.delete(num);

	}

}
