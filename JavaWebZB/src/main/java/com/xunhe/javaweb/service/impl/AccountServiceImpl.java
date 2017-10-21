package com.xunhe.javaweb.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xunhe.javaweb.mapper.AccountMapper;
import com.xunhe.javaweb.po.AccountTable;
import com.xunhe.javaweb.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountMapper accountMapper;
	@Override
	public int accountInsert(AccountTable accountTable) {
		// TODO Auto-generated method stub
		return accountMapper.accountInsert(accountTable);
	}
	@Override
	public List<AccountTable> accountSelectAll() {
		// TODO Auto-generated method stub
		return accountMapper.accountSelectAll();
	}
	@Override
	public int accountDelete(int id) {
		// TODO Auto-generated method stub
		return accountMapper.accountDelete(id);
	}
	@Override
	public int accountUpdate(AccountTable accountTable) {
		// TODO Auto-generated method stub
		return accountMapper.accountUpdate(accountTable);
	}
	@Override
	public AccountTable accountSelectGroup(String userId, @Param("queryDate") String queryDate) {
		// TODO Auto-generated method stub
		return accountMapper.accountSelectGroup(userId, queryDate);
	}
}
