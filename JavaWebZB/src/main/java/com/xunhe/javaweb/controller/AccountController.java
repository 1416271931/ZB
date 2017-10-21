package com.xunhe.javaweb.controller;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.xunhe.javaweb.po.AccountTable;
import com.xunhe.javaweb.service.AccountService;

@RestController
public class AccountController {

	//定义字段
	@Autowired
	private AccountService accountService;
	
	//insert
	@RequestMapping("/accountInsert")
	public String calendarInsert(HttpServletRequest req,HttpServletResponse resp) {
		try {
			req.setCharacterEncoding("utf8");
			resp.setCharacterEncoding("utf-8");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//接受值
		String userId=req.getParameter("userId");
		String shouruFlag=req.getParameter("shouruFlag");
		String item=req.getParameter("item");
		String sum=req.getParameter("sum");
		String useDate=req.getParameter("useDate");
		String beiKao=req.getParameter("beiKao");
		//处理
		AccountTable accountTable = null;
		try {
			accountTable = new AccountTable(userId, Integer.parseInt(shouruFlag),item, sum,
					new SimpleDateFormat("yyyy-MM-dd hh:mm:ss")	.parse(useDate), beiKao);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//返回值
		return String.valueOf(accountService.accountInsert(accountTable));
	};
	
	//SelectAll
	@RequestMapping("/accountSelectAll")
	public String calendarSelectAll() {
		List<AccountTable> listCalendar=accountService.accountSelectAll();
		if (listCalendar!=null) {
			return JSON.toJSONString(listCalendar);
		} else {
			return null;
		}
	}

	//delete
	@RequestMapping("/accountDelete")
	public String accountDelete(HttpServletRequest req, HttpServletResponse resp) {
		try {
			req.setCharacterEncoding("utf8");
			resp.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//接收值
		String id = req.getParameter("id");
		// 处理
		String strResult = String.valueOf(accountService.accountDelete(Integer.valueOf(id)));
		// 返回值
		return strResult;
	}
	
	//update
	@RequestMapping("/accountUpdate")
	public String accountUpdate(HttpServletRequest req, HttpServletResponse resp) {
		try {
			req.setCharacterEncoding("utf8");
			resp.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//接收值
		String id=req.getParameter("id");
		String shouruFlag = req.getParameter("shouruFlag");
		String sum = req.getParameter("sum");
		String item = req.getParameter("item");
		String useDate = req.getParameter("useDate");
		//处理
		AccountTable accountTable = new AccountTable();
		try {
			accountTable.setId(Integer.parseInt(id));
			accountTable.setShouruFlag(Integer.parseInt(shouruFlag));
			accountTable.setItem(item);
			accountTable.setSum(sum);
			accountTable.setUseDate(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss")	.parse(useDate));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		// 处理
		String strResult = String.valueOf(accountService.accountUpdate(accountTable));
		// 返回值
		return strResult;
	}
	
	//selectOne
	@RequestMapping("/accountSelectGroup")
	public String accountSelectGroup(HttpServletRequest req, HttpServletResponse resp) {
		try {
			req.setCharacterEncoding("utf8");
			resp.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String userId = req.getParameter("userId");
		String queryDate = req.getParameter("queryDate");
		AccountTable accountTable = new AccountTable();
		accountTable = accountService.accountSelectGroup(userId, queryDate);
		if (accountTable!=null) {
			return JSON.toJSONString(accountTable);
		} else {
			return null;
		}
	}
	
}
