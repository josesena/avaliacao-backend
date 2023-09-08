package br.com.backend.backendavaliacao.modelo;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "agentes")
@XmlAccessorType(XmlAccessType.FIELD)
public class Agentes {

    @XmlAttribute(name = "versao")
    private String versao;

    private List<Agente> agente = new ArrayList<>();

}
