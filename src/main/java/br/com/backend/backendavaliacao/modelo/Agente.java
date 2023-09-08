package br.com.backend.backendavaliacao.modelo;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "agente")
@XmlAccessorType(XmlAccessType.PROPERTY)
@Document(collection = "agente")
public class Agente {

	@Id
	private String id;

	private String codigo;

	private Date data;

	private List<Regiao> regiao;
}
