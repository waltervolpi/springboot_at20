package it.volpi.walter.at20verifica;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AziendaRepository extends ReactiveMongoRepository<Azienda, Long> {
}