package com.nautilus.demo.kafka;

import com.google.gson.Gson;
import com.nautilus.demo.dto.UserLedgerDto;
import com.nautilus.demo.service.LedgerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class LedgerTopicConsumer {

    @Autowired
    private LedgerService ledgerService;

    @KafkaListener(topics = "example-topic", groupId = "group1")
    public void pollingKafkaLedgerTopic(String message) {
        System.out.println("++++++++++++");
        System.out.println(message);
        System.out.println("+++++++++++");
        Gson gson = new Gson();
        try {
            ledgerService.postUser(gson.fromJson(message, UserLedgerDto.class));
        } catch(Exception e) {
            System.out.println("Invalid message");
        }
    }
}
