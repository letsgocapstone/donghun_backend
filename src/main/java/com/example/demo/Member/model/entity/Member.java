package com.example.demo.Member.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
@Setter

public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long index;

    private String id;

    private String name;

    private String PhoneNumber;

}
