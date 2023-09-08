package br.com.backend.backendavaliacao.modelo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PrecoMedio {

    private List<Double> valor;
    public List<String> getValor() {
        if(valor != null){
            List<String> list = new ArrayList<>();
            valor.forEach(v ->{
                list.add("Dados Sensiveis");
            });
            return list;
        }

        return null;
    }
}
