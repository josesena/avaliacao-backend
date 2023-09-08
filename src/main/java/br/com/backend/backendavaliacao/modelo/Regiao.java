package br.com.backend.backendavaliacao.modelo;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class Regiao {

    @XmlAttribute(name = "sigla")
    private String sigla;

    private List<Geracao> geracao;

    private List<Compra> compra;

    private List<PrecoMedio> precoMedio;

}
