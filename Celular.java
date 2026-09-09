public class Celular {

    private String modelo;
    private double preco;
    private String sistemaOperacional;

    public Celular() {

    }

    public Celular(String modelo, double preco, String sistemaOperacional) {
        this.modelo = modelo;
        this.preco = preco;
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public void calcularTotalLote(int quantidade) {
        double valorTotal = this.preco * quantidade;
        System.out.println("Preço total para " + quantidade + " unidades: R$ " + valorTotal);
    }

    public void verificarCategoria() {
        if (this.preco > 3000) {

            System.out.println("Categoria: Top de Linha");
            System.out.println("Aparelho de alto desempenho");

        } else if (this.preco >= 1000) {

            System.out.println("Categoria: Intermediário");
            System.out.println("Aparelho com ótimo custo-benefício");

        } else {

            System.out.println("Categoria: Linha Baixa / Entrada");
            System.out.println("Aparelho focado em tarefas básicas.");
        }

    }

    public double calcularValorDeRevenda(int anosUso){
        double valorEstimado = this.preco;
        for(int i = 0; i < anosUso; i++){
            valorEstimado -= valorEstimado * 0.15;
        }
        return valorEstimado;
    }

    @Override
    public String toString() {
        return "Celular: \n" +
                "Sistema Operacional: " + sistemaOperacional + "\n" +
                "Modelo: " + modelo + "\n" +
                "Preço: " + preco;
    }
}
