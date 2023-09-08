package br.com.backend.backendavaliacao.repository;

import br.com.backend.backendavaliacao.modelo.Agente;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AgenteRepository extends MongoRepository<Agente, String> {

    @Aggregation(pipeline = {"{$project: {'regiao.sigla' : 'SE', 'codigo': 1, 'data': 1, 'regiao.geracao': 1, 'regiao.compra': 1, 'regiao.precoMedio':1}}"})
    List<Agente> findAggregateForRegion(String regiao);

}
