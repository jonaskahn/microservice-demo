package com.tuyen.demo.usermanagement.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService{

    @Override
    public void sendConfirm() {

    }

    @KafkaListener(topics = "mytopic", groupId = "user-create")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group foo: " + message);
    }

}
