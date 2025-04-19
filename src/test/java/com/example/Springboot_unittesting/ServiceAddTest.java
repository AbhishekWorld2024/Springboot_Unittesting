package com.example.Springboot_unittesting;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ServiceAddTest {
    private ServiceADD serviceadd=new ServiceADD();

    @Test
    public void addtest(){
        int result= serviceadd.add(2,3);
        assertEquals(5,result);
    }

}
