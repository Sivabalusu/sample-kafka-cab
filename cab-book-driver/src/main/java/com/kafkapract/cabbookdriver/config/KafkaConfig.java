package com.kafkapract.cabbookdriver.config;

import com.kafkapract.cabbookdriver.constant.AppConstant;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * Here we create Kafka config
 */
@Configuration
public class KafkaConfig {

    //Topic Builder is the class where we need to provide name of the topic
    @Bean
    public NewTopic topic() {
        return TopicBuilder
                .name(AppConstant.CAB_LOCATION)
                .build();
    }
}
