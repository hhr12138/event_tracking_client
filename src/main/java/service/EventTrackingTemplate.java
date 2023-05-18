package service;

import entity.EventTracking;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EventTrackingTemplate {
    @Value("${event-tracking.topic}")
    private String topic;
    @Resource
    KafkaTemplate<String,EventTracking> kafkaTemplate;
    public boolean send(EventTracking eventTracking){
        kafkaTemplate.send(topic,eventTracking);
        return true;
    }
}
