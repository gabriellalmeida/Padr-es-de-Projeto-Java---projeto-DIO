package one.digitalinovation.gof.facede;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facede {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);


        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
