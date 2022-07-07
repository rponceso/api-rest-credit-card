/**
 * Interface Service CreditCard
 *
 * @author Renato Ponce
 * @version 1.0
 * @since 2022-06-24
 */

package com.nttdata.apirestcreditcard.service;

import com.nttdata.apirestcreditcard.dto.FilterDto;
import com.nttdata.apirestcreditcard.model.CreditCard;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.logging.Filter;

public interface CreditCardService {

    Mono<CreditCard> create(CreditCard creditCard);

    Mono<CreditCard> update(CreditCard creditCard);

    Flux<CreditCard> listAll();

    Mono<CreditCard> getById(String id);

    Mono<CreditCard> getByPan(String pan);

    Flux<CreditCard> getByCustomer_Id(String customerId);

    Flux<CreditCard> findByCreationDateBetween(FilterDto filter);
}
