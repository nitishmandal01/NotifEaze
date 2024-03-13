package com.NotifEaze.NotifEaze.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.NotifEaze.NotifEaze.dto.BaseSmsResponse;
import com.NotifEaze.NotifEaze.dto.SmsDeliveryStatus;
import com.NotifEaze.NotifEaze.mock.GupshupMock;
import com.NotifEaze.NotifEaze.service.SmsService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SmsServiceImplementation implements SmsService {

    @Autowired
    private GupshupMock gupshupMock;

    @Override
    public BaseSmsResponse sendSms(String phoneNumber, String message) {
       String jsonString = gupshupMock.getSmsMockedResponses().get(phoneNumber);

        boolean returnStatus = true;
        String returnMsg = "";


        System.out.println(jsonString);

         try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(jsonString);

            String status = jsonNode.get("success").asText();
            String responseMsg = jsonNode.get("providerResponse").asText();
            
            returnStatus = (status.equals(("true"))) ? true : false;
            returnMsg = responseMsg;  
        } catch (Exception e) {
            e.printStackTrace();
        }

        
        return new BaseSmsResponse(returnStatus, returnMsg);
    }

    @Override
    public SmsDeliveryStatus checkDeliveryStatus(String messageId) {
        String jsonString = gupshupMock.getSmsDeliveryStatusMockedResponses().get(messageId);

        boolean isDelivered = true;
        String returnMsg = "";


        System.out.println(jsonString);

         try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(jsonString);

            String status = jsonNode.get("status").asText();
            String responseMsg = jsonNode.get("message").asText();
            
            isDelivered = (status.equals(("success"))) ? true : false;
            returnMsg = responseMsg;  
        } catch (Exception e) {
            e.printStackTrace();
        }

        
        return new SmsDeliveryStatus(isDelivered, returnMsg);
    }


}
