package com.NotifEaze.NotifEaze.service.impl;

import com.NotifEaze.NotifEaze.dto.BaseEmailResponse;
import com.NotifEaze.NotifEaze.mock.GupshupMock;
import com.NotifEaze.NotifEaze.service.EmailService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;



@Service
public class EmailServiceImplementation implements EmailService {

    @Value("${vendor.name}")
    private String vendor;

    @Autowired
    private GupshupMock gupshupMock;



    @Override
    public BaseEmailResponse sendEmail(String to, String subject, String body) {
        String jsonString = gupshupMock.getEmailMockedResponses().get(to);
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

        
        return new BaseEmailResponse(returnStatus,returnMsg);  

        }
}
