/**
 * Main Class
 *
 * @author Renato Ponce
 * @version 1.0
 * @since 2022-06-24
 */

package com.nttdata.apirestcreditcard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ApiRestCreditCardApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestCreditCardApplication.class, args);
	}

}
