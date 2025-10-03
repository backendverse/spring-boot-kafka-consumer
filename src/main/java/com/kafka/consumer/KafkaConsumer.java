package com.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaConsumer {

    @KafkaListener(topics = {"spring_topic"},
//            groupId = "audit_group"
            topicPartitions = @TopicPartition(topic = "spring_topic", partitions = {"1"})
    )
    public void orderConsumer(String data) {
        log.info("Data Consumed For Partition: {}  With Data : {}", "1", data);
    }


}
