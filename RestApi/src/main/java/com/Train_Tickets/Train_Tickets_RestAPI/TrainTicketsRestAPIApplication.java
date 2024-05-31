package com.Train_Tickets.Train_Tickets_RestAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.Train_Tickets.Train_Tickets_RestAPI.Entities")
public class TrainTicketsRestAPIApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrainTicketsRestAPIApplication.class, args);
    }
}
