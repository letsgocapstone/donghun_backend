package com.example.demo.Member.repository.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter


public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long index;

    private String id;

    private String name;

    private String phonenumber;

}
