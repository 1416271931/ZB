package com.xunhe.javaweb.po;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class AccountTable {
	
	//0定义字段
		private int id;
		private String userId;
		private int shouruFlag;
		private String item;
		private String sum;
		@JSONField
		private Date useDate;
		private String beiKao;
		//1定义属性、
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public int getShouruFlag() {
			return shouruFlag;
		}
		public void setShouruFlag(int shouruFlag) {
			this.shouruFlag = shouruFlag;
		}
		public String getItem() {
			return item;
		}
		public void setItem(String item) {
			this.item = item;
		}
		public String getSum() {
			return sum;
		}
		public void setSum(String sum) {
			this.sum = sum;
		}
		public Date getUseDate() {
			return useDate;
		}
		public void setUseDate(Date useDate) {
			this.useDate = useDate;
		}
		public String getBeiKao() {
			return beiKao;
		}
		public void setBeiKao(String beiKao) {
			this.beiKao = beiKao;
		}
		//2空构造

		public AccountTable() {
			super();
		}
		//3构造的重载
		public AccountTable(String userId, int shouruFlag, String item, String sum, Date useDate, String beiKao) {
		super();
		this.userId = userId;
		this.shouruFlag = shouruFlag;
		this.item = item;
		this.sum = sum;
		this.useDate = useDate;
		this.beiKao = beiKao;
		//4重写toString()方法
	}
		//4重写toString()方法
		@Override
		public String toString() {
			return "AccountTable [id=" + id + ", userId=" + userId + ", shouruFlag=" + shouruFlag + ", item=" + item
					+ ", sum=" + sum + ", useDate=" + useDate + ", beiKao=" + beiKao + "]";
		}
	

}
