package com.example.Springboot_unittesting;


import org.springframework.stereotype.Service;

@Service
public class ServiceADD {
    public int add(int a,int b){
        return a+b;
    }
}
