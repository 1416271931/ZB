package com.xunhe.javaweb.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xunhe.javaweb.po.AccountTable;

public interface AccountService {

	//insert
	public int accountInsert(AccountTable accountTable);
	
	//selectAll
	public List<AccountTable> accountSelectAll();
	
	//delete
	public int accountDelete(int id);
	//update
	public int accountUpdate(AccountTable accountTable);
	//selectOne
	public AccountTable accountSelectGroup(String userId, @Param("queryDate") String queryDate);
}
