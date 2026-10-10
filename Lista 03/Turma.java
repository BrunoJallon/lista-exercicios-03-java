public class Turma {
    private Aluno[] alunos;
    private int qtdAlunos; // quantas posições do array já estão ocupadas

    public Turma(int capacidade) {
        this.alunos = new Aluno[capacidade]; // todas as posições começam null
        this.qtdAlunos = 0;
    }

    // Adiciona o aluno na próxima posição livre.
    // Retorna false se a turma está cheia.
    public boolean adicionarAluno(Aluno aluno) {
        if (aluno == null || qtdAlunos >= alunos.length) {
            return false;
        }
        alunos[qtdAlunos] = aluno;
        qtdAlunos++;
        return true;
    }

    public void listarAprovados() {
        System.out.println("=== Aprovados ===");
        // Percorre só até qtdAlunos: as demais posições ainda são null
        for (int i = 0; i < qtdAlunos; i++) {
            if (alunos[i].estaAprovado()) {
                System.out.printf("%s (mat. %s) - média: %.2f%n",
                        alunos[i].getNome(), alunos[i].getMatricula(), alunos[i].calcularMedia());
            }
        }
    }

    public void listarReprovados() {
        System.out.println("=== Reprovados ===");
        for (int i = 0; i < qtdAlunos; i++) {
            if (!alunos[i].estaAprovado()) {
                System.out.printf("%s (mat. %s) - média: %.2f%n",
                        alunos[i].getNome(), alunos[i].getMatricula(), alunos[i].calcularMedia());
            }
        }
    }
}
