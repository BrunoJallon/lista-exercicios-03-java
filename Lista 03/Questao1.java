public class Questao1 {
    public static void main(String[] args) {
        Turma turma = new Turma(10);

        Aluno bruno = new Aluno("Bruno", "2024001");
        bruno.cadastrarNota(8.0);
        bruno.cadastrarNota(7.5);
        bruno.cadastrarNota(9.0);
        bruno.cadastrarNota(6.5);

        Aluno ryan = new Aluno("Ryan", "2024002");
        ryan.cadastrarNota(5.0);
        ryan.cadastrarNota(6.0);
        ryan.cadastrarNota(4.5);
        ryan.cadastrarNota(7.0);

        Aluno marquinhos = new Aluno("Marquinhos", "2024003");
        marquinhos.cadastrarNota(7.0);
        marquinhos.cadastrarNota(7.0);
        marquinhos.cadastrarNota(7.0);
        marquinhos.cadastrarNota(7.0); // média exatamente 7.0 -> aprovado

        // A 5ª nota deve ser recusada (máximo de 4)
        boolean cadastrou = bruno.cadastrarNota(10.0);
        System.out.println("5ª nota do Bruno foi cadastrada? " + cadastrou);
        System.out.println();

        turma.adicionarAluno(bruno);
        turma.adicionarAluno(ryan);
        turma.adicionarAluno(marquinhos);

        turma.listarAprovados();
        System.out.println();
        turma.listarReprovados();
    }
}
