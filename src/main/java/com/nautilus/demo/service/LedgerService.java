package com.nautilus.demo.service;

import com.nautilus.demo.dto.UserLedgerDto;

public interface LedgerService {
    void postUser(UserLedgerDto userLedgerDTO);
}
