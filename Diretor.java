public class Diretor extends FluxoDeRequisicao {
    
    @Override
    public void aprovar(String tipo, double valor){
        
        if(tipo == "Reembolso" && valor > 0){
            if(valor > 500 ){
            System.out.println("Valor aceito pelo Diretor");
            }else if(proximo != null){
            proximo.aprovar(tipo, valor);
            }
        }else{
            System.out.println("Erro no valor");
        }
        
        if(tipo == "Compras" ){
            if(valor > 1000){
                System.out.println("Compra aceita pelo Diretor");
            }else if(proximo != null){
                proximo.aprovar(tipo, valor);
            }
            
        }
        if(tipo == "Ferias"){
            System.out.println("Férias aceitas pela equipe");
        }
        
        
    }

}