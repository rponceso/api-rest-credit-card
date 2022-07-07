/**
 * Repository that stores CreditCard information
 *
 * @author Renato Ponce
 * @version 1.0
 * @since 2022-06-24
 */

package com.nttdata.apirestcreditcard.repository;

import com.nttdata.apirestcreditcard.model.CreditCard;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDate;

public interface CreditCardRepository extends ReactiveMongoRepository<CreditCard, String> {

    Mono<CreditCard> findByPan(String pan);

    Flux<CreditCard> findByCustomer_Id(String customerId);

    Flux<CreditCard> findByCreationDateBetween(LocalDate startDate, LocalDate endDate);
}
