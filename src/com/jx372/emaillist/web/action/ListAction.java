package com.jx372.emaillist.web.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jx372.emaillist.dao.EmaillistDao;
import com.jx372.emaillist.vo.EmaillistVo;
import com.jx372.web.action.Action;
import com.jx372.web.util.WebUtils;

public class ListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		List<EmaillistVo> list = new EmaillistDao().getList();
		//list에 데이터 저장 이름으로 받아온다 html로 부터 ("list")받아서 list에 넣는다.
		request.setAttribute("list", list);
		WebUtils.forward("/WEB-INF/views/index.jsp", request, response);

	}

}