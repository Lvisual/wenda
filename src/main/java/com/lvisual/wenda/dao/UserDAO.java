package com.lvisual.wenda.dao;

import com.lvisual.wenda.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import javax.jws.soap.SOAPBinding;

@Mapper
@Component
public interface UserDAO {
   @Insert({("insert into user (name,password) values(#{name},#{password})")})
   int addUser(User user);

   @Select({"select name,password from user where id = #{id}"})
   User selectById(int id);

   @Update({"update user  set password = #{password} where id = #{id}"})
   void upDatePassword(User user);

   @Delete({"delete from user where id = #{id}"})
   void deleteById(int id);

}

