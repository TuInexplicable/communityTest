package com.icss.hotel.controller;

import com.icss.hotel.component.GitComponent;
import com.icss.hotel.dto.AccessTokenDTO;
import com.icss.hotel.dto.GitHubUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class GitController extends BaseController {
    @Resource
    GitComponent gitComponent;

    @GetMapping("/callback")
    public String gitPost(AccessTokenDTO accessTokenDTO, HttpServletRequest request){
        resultMap.clear();
        String token = gitComponent.gitPost(accessTokenDTO);
        System.out.println(token);
        GitHubUser user= gitComponent.gitGet_token(token);
        if(user!=null){
            resultMap.put("gitUser",user);
            return "redirect:page/index.html";
        }
        return "redirect:login.html";
    }
    @ResponseBody
    @RequestMapping("/getUser")
    public Map<String, Object> getUser(HttpServletRequest request){
        System.out.println(resultMap.get("gitUser"));
        return resultMap;
    }
}
