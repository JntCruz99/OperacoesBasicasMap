package EstoqueProdutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> produtoMap;

    public EstoqueProdutos() {
        this.produtoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        produtoMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(produtoMap);
    }

    public double calcularValorTotalEstoque(){
        double preco = 0;
        for (Produto p: produtoMap.values()){
            preco = p.getPreco() * p.getQuantidade();
        }
        return preco;
    }

    public double obterProdutoMaisCaro(){
        double precoMaisCaro = Double.MIN_VALUE;
        if (!produtoMap.isEmpty()){
            for (Produto p: produtoMap.values()){
                if (precoMaisCaro < p.getPreco()){
                    precoMaisCaro = p.getPreco();
                }
            }
        }
        return precoMaisCaro;
    }




}
