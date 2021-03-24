package com.nautilus.demo.service.impl;

import com.nautilus.demo.dto.UserLedgerDto;
import com.nautilus.demo.service.LedgerService;
import org.springframework.stereotype.Service;

@Service
public class LedgerServiceImpl implements LedgerService {
    @Override
    public void postUser(UserLedgerDto userLedgerDTO) {
        System.out.println("*******************************************");
        System.out.println(userLedgerDTO.getName());
        System.out.println("*******************************************");
        System.out.println(userLedgerDTO.getLastName());
        System.out.println("*******************************************");
    }
}
