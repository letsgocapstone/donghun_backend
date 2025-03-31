package com.example.demo.Member.controller;

import com.example.demo.Member.model.entity.Member;
import com.example.demo.Member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController // 유저의 데이터 수신
@RequestMapping("/api/members")
public class MemberController {

    // MemberService를 @Autowired로 주입받음
    @Autowired
    private MemberService memberService;  // 인스턴스를 통해 접근

    @GetMapping("hello")
    public String getHello() {
        return "Hello user!";
    }

    @PostMapping("/join")
    public String saveMember(@RequestBody Member member) {
        // memberService 인스턴스를 사용하여 saveMember 메서드 호출
        memberService.saveMember(member);  // 멤버를 DB에 저장
        return "Member saved successfully!";
    }
}
