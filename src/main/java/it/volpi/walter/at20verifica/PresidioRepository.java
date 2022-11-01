package it.volpi.walter.at20verifica;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PresidioRepository extends ReactiveMongoRepository<Presidio, Long> {
}
