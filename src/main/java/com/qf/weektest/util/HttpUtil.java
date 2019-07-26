package com.qf.weektest.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpUtil {


    public static boolean checkUserIsLogin(HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                System.out.println("USERNAME".equals(c.getName()));
                if ("USERNAME".equals(c.getName())) {
                    // 与 session 中的对比
                    System.out.println("==============================================");
                    if (c.getValue() != null) {
                        if (c.getValue().equals(request.getSession().getAttribute("USERNAME"))) {
                            System.out.println("==============================================");
                            System.out.println(request.getSession().getAttribute("USERNAME"));
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
