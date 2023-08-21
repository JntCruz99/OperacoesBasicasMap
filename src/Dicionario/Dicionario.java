package Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> palavradefinicaoMap;

    public Dicionario() {
        this.palavradefinicaoMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        palavradefinicaoMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if (!palavradefinicaoMap.isEmpty()){
            palavradefinicaoMap.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(palavradefinicaoMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String definicao = null;
        if (!palavradefinicaoMap.isEmpty()){
            definicao = palavradefinicaoMap.get(palavra);
        }
        return definicao;
    }


}
