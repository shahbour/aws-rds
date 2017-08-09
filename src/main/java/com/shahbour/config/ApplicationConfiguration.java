package com.shahbour.config;


import org.springframework.cloud.aws.jdbc.config.annotation.EnableRdsInstance;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableRdsInstance(dbInstanceIdentifier = "portal",password = "Tx9P50LxnPXO", readReplicaSupport = true)
public class ApplicationConfiguration {
}
