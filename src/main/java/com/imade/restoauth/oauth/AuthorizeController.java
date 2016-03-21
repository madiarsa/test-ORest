package com.imade.restoauth.oauth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class AuthorizeController
{
    @RequestMapping("/authorize")
    public void authorize(HttpServletResponse response) throws IOException {
                response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("get test");
        response.flushBuffer();

    }
};

