public class Paciente {

    private String nome;
    private int idade;
    private double peso;

    public Paciente(){
    }

    public Paciente(String nome, int idade, double peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso (double peso){
        this.peso = peso;
    }

    public double calcularIMC(double altura) {
        double resultadoImc = this.peso / (altura * altura);
        return resultadoImc;
    }

    public void verificarFaixaEtaria(){
        if(this.idade < 12){
            System.out.println("É um paciente Pediátrico");
        }else if(this.idade < 60){
            System.out.println("É um paciente adulto");
        }else{
            System.out.println("É um paciente idoso");
        }
    }

    public boolean verificarNecessidadeAcompanhante(){
        if(this.idade < 18 || this.idade >= 60){
            return true;
        }else{
            return false;
        }
    }

    @Override 
    public String toString(){
        return "Paciente:\n" +
                "Nome: "     + nome + "\n" +
                "Idade: "   + idade + " anos" + "\n" +
                "Peso:"     + peso + "kg";    
    }



}
