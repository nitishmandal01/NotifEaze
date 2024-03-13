package com.NotifEaze.NotifEaze.dto;
import lombook.AllArgsConstructor;
import lombook.Data;

@AllArgsConstructor
@Data
public class BasePushNotificationRequest {
    private String fcmToken;
    private String message;
}
