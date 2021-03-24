package com.nautilus.demo.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserLedgerDto {
    private String name;
    private String lastName;
}
