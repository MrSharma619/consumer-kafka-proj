package com.example.consumer_kafka_demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @KafkaListener(topics = "messageTopic", groupId = "group1")
    public void listen(String message){
        System.out.println("Received: " + message);

    }

}
