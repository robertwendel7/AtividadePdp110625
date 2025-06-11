public class LiderEqp extends FluxoDeRequisicao{

    @Override
    public void aprovar(String tipo, double valor){
        if(tipo == "Reembolso" && valor > 0){
            if(valor <= 500){
                System.out.println("Valor aceito pelo Lider de equipe");
            }else if(proximo != null){
                proximo.aprovadorDespesa(valor);
            }
        }else{
             System.out.println("Erro no valor");
        }
        if(tipo == "Ferias"){
            System.out.println("Férias aceitas pela equipe");
        }
        
    }
}