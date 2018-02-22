package com.lvisual.wenda.service;

import com.lvisual.wenda.dao.QuestionDAO;
import com.lvisual.wenda.dao.UserDAO;
import com.lvisual.wenda.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WenDaService {

    @Autowired
    UserDAO userDAO;
    @Autowired
    QuestionDAO questionDAO;
    public String getMessage(int userId){
        return "HELLO WORLD " + userDAO.selectById(userId).getName();
    }

}
