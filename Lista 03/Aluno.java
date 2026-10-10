public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;
    private int qtdNotas; // quantas notas já foram cadastradas

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[4]; // no máximo 4 notas
        this.qtdNotas = 0;
    }

    // Cadastra uma nota (de 0 a 10).
    // Retorna false se já existem 4 notas ou se a nota é inválida.
    public boolean cadastrarNota(double nota) {
        if (qtdNotas >= notas.length || nota < 0 || nota > 10) {
            return false;
        }
        notas[qtdNotas] = nota;
        qtdNotas++;
        return true;
    }

    // Média das notas cadastradas (0 se ainda não há nenhuma)
    public double calcularMedia() {
        if (qtdNotas == 0) {
            return 0;
        }
        double soma = 0;
        for (int i = 0; i < qtdNotas; i++) {
            soma += notas[i];
        }
        return soma / qtdNotas;
    }

    // Aprovado se a média for maior ou igual a 7.0
    public boolean estaAprovado() {
        return calcularMedia() >= 7.0;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
}
