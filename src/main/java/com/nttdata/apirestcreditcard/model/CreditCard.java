/**
 * Bean Stores CreditCard Information
 *
 * @author Renato Ponce
 * @version 1.0
 * @since 2022-06-24
 */

package com.nttdata.apirestcreditcard.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.nttdata.apirestcreditcard.dto.CustomerDto;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Date;

@Data
@Document(collection = "creditCard")
public class CreditCard {
    @Id
    private String id;

    private String nameCard;

    private String pan; //Personal Account Number

    private String cardType;

    private String cvv;

    private String monthYearExp;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate creationDate = LocalDate.now();

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date paymentDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date expiredDate;

    private String cardBrand;

    private double balanceAmount;

    private double creditLimit;

    private double totalConsumption;

    private boolean active;

    private String chargeDay;

    private CustomerDto customer;
}
