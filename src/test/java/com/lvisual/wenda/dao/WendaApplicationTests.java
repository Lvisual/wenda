package com.lvisual.wenda.dao;

import com.lvisual.wenda.model.Question;
import com.lvisual.wenda.model.User;
import com.lvisual.wenda.service.UserService;
import jdk.nashorn.internal.runtime.QuotedStringTokenizer;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.nio.ch.KQueueSelectorProvider;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WendaApplicationTests {
	@Autowired
	UserService userService;
	@Test
	public void contextLoads() {
		userService.register("curry","30");
	}
}
