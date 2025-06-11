class main{
    public void main(String args[]){
        FluxoDeRequisicao liderEqp = new FluxoDeRequisicao();
        FluxoDeRequisicao gerente = new FluxoDeRequisicao();
        FluxoDeRequisicao diretor = new FluxoDeRequisicao();

        liderEqp.setProximo(gerente);
        gerente.setProximo(diretor);
        
    }
}