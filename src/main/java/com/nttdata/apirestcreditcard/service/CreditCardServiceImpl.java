/**
 * Implementation Interface Service CreditCard
 *
 * @author Renato Ponce
 * @version 1.0
 * @since 2022-06-24
 */

package com.nttdata.apirestcreditcard.service;

import com.nttdata.apirestcreditcard.dto.FilterDto;
import com.nttdata.apirestcreditcard.model.CreditCard;
import com.nttdata.apirestcreditcard.repository.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CreditCardServiceImpl implements CreditCardService {

    @Autowired
    private CreditCardRepository repository;

    @Override
    public Mono<CreditCard> create(CreditCard creditCard) {
        return repository.save(creditCard);
    }

    @Override
    public Mono<CreditCard> update(CreditCard creditCard) {
        return repository.save(creditCard);
    }

    @Override
    public Flux<CreditCard> listAll() {
        return repository.findAll();
    }

    @Override
    public Mono<CreditCard> getById(String id) {
        return repository.findById(id);
    }

    @Override
    public Mono<CreditCard> getByPan(String pan) {
        return repository.findByPan(pan);
    }

    @Override
    public Flux<CreditCard> getByCustomer_Id(String customerId) {
        return repository.findByCustomer_Id(customerId);
    }

    @Override
    public Flux<CreditCard> findByCreationDateBetween(FilterDto filter) {
        return repository.findByCreationDateBetween(filter.getStartDate(), filter.getEndDate());
    }
}
