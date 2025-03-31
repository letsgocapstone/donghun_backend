package com.example.demo.Member.repository;

import com.example.demo.Member.model.entity.Member;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}

