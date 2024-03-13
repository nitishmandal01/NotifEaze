package com.NotifEaze.NotifEaze.service.impl;

import com.NotifEaze.NotifEaze.dto.BasePushNotificationResponse;
import com.NotifEaze.NotifEaze.mock.GupshupMock;
import com.NotifEaze.NotifEaze.service.PushNotificationService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PushNotificationServiceImplementation implements PushNotificationService {


    @Autowired
    private GupshupMock gupshupMock;



    @Override
    public BasePushNotificationResponse sendNotification(String fcmToken, String message) {

        String jsonString = gupshupMock.getPnMockedResponses().get(fcmToken);
        boolean returnStatus = true;
        String returnMsg = "";


        System.out.println(jsonString);

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(jsonString);

            String status = jsonNode.get("status").asText();
            String responseMsg = jsonNode.get("message").asText();
            
            
            returnStatus = (status.equals(("success"))) ? true : false;
            returnMsg = responseMsg;
            

        } catch (Exception e) {
            e.printStackTrace();
        }




        return new BasePushNotificationResponse(returnStatus, returnMsg);
    }
}
