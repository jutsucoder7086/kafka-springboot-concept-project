# Spring Boot Kafka Example: Delivery Boy (Producer) & User (Consumer)

This repository contains two microservices built with Spring Boot, demonstrating how Apache Kafka can be used for real-time communication between services:

### Delivery Boy Service (Producer)
This service simulates a delivery boy generating random location coordinates and sending them to a Kafka topic.

### User Service (Consumer)
This service simulates a user consuming these location coordinates from the Kafka topic to track the delivery in real time.

## Overview
- **Apache Kafka** is used as the messaging system to enable seamless communication between these two services.
- The **Delivery Boy Service** produces messages containing location coordinates (latitude and longitude), which are generated randomly to simulate the movement of a delivery.
- The **User Service** acts as the consumer, receiving these location updates in real time to provide delivery tracking.

## Technologies Used
- Spring Boot
- Spring Kafka
- Apache Kafka
- Java 11+

## How to Use
1. Start up the Kafka broker and Zookeeper.
2. Run the Delivery Boy Service to produce random location updates.
3. Run the User Service to consume these updates.

## Objectives
This project helps in understanding:
- How to configure Kafka producers and consumers in a Spring Boot application.
- Real-time location streaming between two services.
- The basics of event-driven architecture using Kafka.

## Features
- **Delivery Boy Service** sends out random location coordinates to represent the delivery's current position.
- **User Service** listens for these updates, enabling real-time tracking.

Feel free to explore the code to understand how Kafka producers and consumers are set up using Spring Boot.
