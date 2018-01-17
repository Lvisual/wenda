package com.lvisual.wenda.controller;

import com.lvisual.wenda.service.WenDaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import javax.servlet.http.*;
import java.util.Enumeration;

@Controller
public class IndexController {
    @Autowired
    WenDaService wendaService;
    @RequestMapping(path = {"/", "/index"}, method = {RequestMethod.GET})
    @ResponseBody
    public String index(HttpServletResponse resposnse, HttpServletRequest request, HttpSession session, @CookieValue("JSESSIONID") String sessionId) {
        StringBuilder sb = new StringBuilder();
        Enumeration<String> headerNames = request.getHeaderNames();
        sb.append("CookieValue:" + sessionId);
        while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            sb.append(name + ":" + request.getHeader(name) + "<br>");
        }
        sb.append(request.getMethod() + "<br>");
        sb.append(request.getQueryString() + "<br>");
        sb.append(request.getPathInfo() + "<br>");
        sb.append(request.getRequestURL() + "<br>");
        sb.append(request.getSession() + "<br>");
        //model.addAttribute("value1","hello world");
        resposnse.addCookie(new Cookie("lk", "1234"));
        return sb.toString();
    }

    @RequestMapping(path = {"/lk"}, method = {RequestMethod.GET})
    public String index2(Model model){
        model.addAttribute("name","lk");
        return "test";
        //return "lk" + wendaService.getMessage(5);
    }
}
