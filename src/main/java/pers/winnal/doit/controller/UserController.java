package pers.winnal.doit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("api/user")
public class UserController {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    @ResponseBody // 要返回json数据
    public Map<String, Object> login(HttpSession httpSession) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("errorCode", 0);
        map.put("message", "hello");
        return map;
    }
}