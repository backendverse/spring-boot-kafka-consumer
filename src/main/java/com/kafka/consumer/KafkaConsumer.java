package com.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaConsumer {

    @KafkaListener(topics = {"order_creation"}, groupId = "payment_group")
    public void orderConsumer(String data) {
        log.info("Data Consumed For Topic: {}  With Data : {}", "order_creation", data);
    }

}
