package br.com.backend.backendavaliacao.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PrecoMedio {

    private List<String> valor;

    public List<String> getValor() {
        if(!Objects.isNull(this.valor)){
            this.valor = this.valor.stream().map(v -> v != null ? "Dados Sensiveis" : v).collect(Collectors.toList());
        }
        return valor;
    }
}
