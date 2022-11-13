package com.book.springboot.web;

import com.book.springboot.service.members.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("member")
public class MemberController {

    private MemberService member;

    @GetMapping("signup")
    public String singup() {
        return "member-signup";
    }
    @PostMapping("signup")
    public String signup() {
        member.signUp();
        return "redirect:/";

}
