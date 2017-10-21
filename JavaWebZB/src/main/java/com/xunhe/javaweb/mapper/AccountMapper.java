package com.xunhe.javaweb.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.xunhe.javaweb.po.AccountTable;

@Mapper
public interface AccountMapper {

	//inserts
	@Insert("insert into account_table(userId,shouruFlag,sum,item,useDate,beiKao) values(#{userId},#{shouruFlag},#{sum},#{item},#{useDate},#{beiKao})")
	public int accountInsert(AccountTable accountTable);

	//selectAll
	@Select("select * from account_table order by id desc limit 0,10")
	public List<AccountTable> accountSelectAll();
	
	//selectOne
	// @Select("select item, sum(sum) as sum from account_table where userId=#{userId} and useDate>=to_date(concat(#{queryDate},'00:00:00'),'yyyy-mm-dd hh24:mi:ss') and useDate<=to_date(concat(#{queryDate},'24:00:00'),'yyyy-mm-dd hh24:mi:ss')  group by item")
	@Select("select item, sum(sum) as sum from account_table where userId=#{userId} and TIMESTAMPDIFF(DAY,useDate,#{queryDate})=0 group by item")
	public AccountTable accountSelectGroup(@Param("userId") String userId, @Param("queryDate") String queryDate);
	
	//delete
	@Delete("delete from account_table where id = #{id}")
	public int accountDelete(int id);

	//update
	@Update("update account_table set shouruFlag=#{shouruFlag},sum=#{sum},item=#{item},useDate=#{useDate} where id=#{id}")
	public int accountUpdate(AccountTable accountTable);
}
