package com.example.demo.Member.service;

import com.example.demo.Member.model.entity.Member;
import com.example.demo.Member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }
}
