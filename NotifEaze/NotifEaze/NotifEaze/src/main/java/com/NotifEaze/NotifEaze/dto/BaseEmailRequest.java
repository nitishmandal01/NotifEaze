package com.NotifEaze.NotifEaze.dto;
import lombook.AllArgsConstructor;
import lombook.Data;

@AllArgsConstructor
@Data
public class BaseEmailRequest {
    private String to;
    private String subject;
    private String body;
    
}
