public class Sapato {

    private String marca;
    private int tamanho;

    public Sapato() {
    }

    public Sapato(String marca, int tamanho) {
        this.marca = marca;
        this.tamanho = tamanho;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public int getTamanho(){
        return tamanho;
    }

    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }


    public double calcularPrecoComDesconto(double precoBase, double porcentagemDesconto){
        double valorDesconto = precoBase * (porcentagemDesconto / 100);
        return precoBase - valorDesconto;
    }

    public boolean verificarDisponibilidade(){
        return this.tamanho % 2 == 0; 
    }

    @Override
    public String toString(){
        return "Sapato: \n" +
                "Marca: " + marca + "\n" +
                "Tamanho: " + tamanho;

    }
}
