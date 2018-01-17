package com.lvisual.wenda;

import com.lvisual.wenda.dao.UserDAO;
import com.lvisual.wenda.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WendaApplicationTests {
	@Autowired
	UserDAO userdao;
	@Test
	public void contextLoads() {
		User user = new User();
		user.setId(1);
		user.setPassword("1234");
		userdao.upDatePassword(user);
		//userdao.addUser(user);
		//user = userdao.selectById(1);
		userdao.deleteById(4);
	}

}
