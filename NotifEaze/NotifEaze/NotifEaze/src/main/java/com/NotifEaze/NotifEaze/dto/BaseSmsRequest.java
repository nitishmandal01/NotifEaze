package com.NotifEaze.NotifEaze.dto;
import lombook.AllArgsConstructor;
import lombook.Data;

@AllArgsConstructor
@Data
public class BaseSmsRequest {
    private String phoneNumber;
    private String message;
    
}
