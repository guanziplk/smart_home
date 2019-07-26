package com.qf.weektest.controller;

import com.qf.weektest.entity.User;
import com.qf.weektest.service.UserService;
import com.qf.weektest.util.HttpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
@SessionAttributes
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/exit")
    public String exit(HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if ("USERNAME".equals(c.getName())) {
                    c.setMaxAge(0);
                    c.setPath("/");
                    response.addCookie(c);
                }
            }
            // 等下要删除 session
            request.getSession().removeAttribute("USERNAME");
        }
        return "redirect:/login.html";
    }

    //    @RequestMapping("/checkUserIsLogin")
//    public String checkUserIsLogin(@CookieValue(value = "JSESSIONID") String cookieValue) {
//        System.out.println(cookieValue);
//        // 重定向
//        return "redirect:/signIn.html ";
//    }
    @ResponseBody
    @RequestMapping("/checkUserIsLogin")
    public boolean checkUserIsLogin(HttpServletRequest request, HttpServletResponse response) {
//        Cookie[] cookies = request.getCookies();
//        if (cookies != null) {
//            for (Cookie c : cookies) {
//                System.out.println("USERNAME".equals(c.getName()));
//                if ("USERNAME".equals(c.getName())) {
//                    // 与 session 中的对比
//                    System.out.println("==============================================");
//                    if (c.getValue() != null) {
//                        if (c.getValue().equals(request.getSession().getAttribute("USERNAME"))) {
//                            System.out.println("==============================================");
//                            System.out.println(request.getSession().getAttribute("USERNAME"));
//                            return true;
//                        }
//                    }
//                }
//            }
//        }

        System.out.println("-----------12------------");
        if (HttpUtil.checkUserIsLogin(request, response)) {
            return true;
        }

        Cookie c = new Cookie("JSESSIONID", request.getSession().getId());
        c.setMaxAge(60 * 60 * 24);
        c.setPath("/");
        response.addCookie(c);
        return false;
    }

    //    注册
    @ResponseBody
    @RequestMapping("/signUp")
    public int signUp(User user) {
        System.out.println(user + "==============================================");
        return userService.addUser(user);


    }

    //    登录
    @ResponseBody
    @RequestMapping("/signIn")
    public boolean signIn(User user, HttpServletRequest request, HttpServletResponse response) {

        boolean flag = userService.findByNameAndPassword(user);

        if (flag) {
            Cookie c = new Cookie("USERNAME", user.getUsername());
            c.setMaxAge(60 * 60 * 24);
            c.setPath("/");
            response.addCookie(c);
            request.getSession().setAttribute("USERNAME", user.getUsername());
        }
        return flag;
    }


    //    重名
    @ResponseBody
    @RequestMapping("/repetitiveUsername")
    public int repetitiveUsername(@RequestParam(name = "username") String username) {
        if (userService.findByName(username) != null) {
//            System.out.println(username + "==================================================");
            return 1;
        }
        return 0;
    }
}
