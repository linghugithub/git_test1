package cn.ljp.ssm.dao;

import cn.ljp.ssm.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * create by ljb  on 2020/5/1617:04
 * springMvc_test--IAccountDao
 * function
 * design
 */
@Repository
public interface IAccountDao {

    @Select("select * from account")
    List<Account> findAll();

    @Insert("insert into account(name,money)values(#{name},#{money})")
    void insertAccount(Account account);


    @Update("update account set money=#{money} where id=#{id}")
    void updateMoneyById(@Param("id") int id, @Param("money") double money);


    @Select("select * from account where id=#{id}")
    Account queryAccountById(int id);

}
