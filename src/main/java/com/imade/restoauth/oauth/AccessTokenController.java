package com.imade.restoauth.oauth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class AccessTokenController
{
    @RequestMapping(value="/token", method= RequestMethod.POST)
    public void token(HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("post test");
        response.flushBuffer();

    }
};

