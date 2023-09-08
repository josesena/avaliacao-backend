package br.com.backend.backendavaliacao.service;

import br.com.backend.backendavaliacao.modelo.Agente;
import br.com.backend.backendavaliacao.modelo.Agentes;
import br.com.backend.backendavaliacao.repository.AgenteRepository;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class FileService {

    private AgenteRepository agenteRepository;

    public void execute(InputStream inputStream){
        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(Agentes.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Agentes agentes = (Agentes) unmarshaller.unmarshal(inputStream);
            if(Optional.of(agentes).isPresent()){
                agentes.getAgente().forEach(a -> System.out.println(a.getCodigo()));
                agenteRepository.saveAll(agentes.getAgente());
            }
        }catch (JAXBException e ){
            e.printStackTrace();
        }
    }

    public List<Agente> findAggregationAgente(String regiao) {
        return agenteRepository.findAggregateForRegion(regiao);
    }
}

