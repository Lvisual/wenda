package com.lvisual.wenda.service;

import org.springframework.stereotype.Service;

@Service
public class WenDaService {
    public String getMessage(int userId){
        return "HELLO WORLD" + String.valueOf(userId);
    }
}
