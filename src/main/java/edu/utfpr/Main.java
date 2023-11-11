package edu.utfpr;

abstract class Usuario {
    private String nome;
    private long matricula;
    private String contato;

    public Usuario(String nome, long matricula, String contato) {
        this.nome = nome;
        this.matricula = matricula;
        this.contato = contato;
    }

    public abstract void exibirDados();

    public abstract void matricular(String alvo);

    public abstract void trancar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}

class Aluno extends Usuario{

    public Aluno(String nome, long matricula, String contato) {
        super(nome, matricula, contato);
    }

    @Override
    public void exibirDados() {
        System.out.println("Aluno: " + getNome());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Contato: " + getContato());
    }

    @Override
    public void matricular(String alvo) {
        System.out.println("Aluno: " + getNome() + " inscrito na disciplina: " + alvo);
    }

    @Override
    public void trancar() {
        System.out.println("Aluno: " + getNome() + " Matrícula: " + getMatricula() + " trancou o curso");
    }
}

class Professor extends Usuario{

    public Professor(String nome, long matricula, String contato) {
        super(nome, matricula, contato);
    }

    @Override
    public void exibirDados() {
        System.out.println("Professor: " + getNome());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Contato: " + getContato());
    }

    @Override
    public void matricular(String alvo) {
        System.out.println("Professor: " + getNome() + " lecionando disciplina: " + alvo);
    }

    @Override
    public void trancar() {
        System.out.println("Professor: " + getNome() + " Matrícula: " + getMatricula() + " Pediu afastamento");
    }
}

class Servidor extends Usuario{

        public Servidor(String nome, long matricula, String contato) {
            super(nome, matricula, contato);
        }

        @Override
        public void exibirDados() {
            System.out.println("Servidor: " + getNome());
            System.out.println("Matrícula: " + getMatricula());
            System.out.println("Contato: " + getContato());
        }

        @Override
        public void matricular(String alvo) {
            System.out.println("Servidor: " + getNome() + " Inscrito no setor: " + alvo);
        }

        @Override
        public void trancar() {
            System.out.println("Servidor: " + getNome() + " Matrícula: " + getMatricula() + " Pediu exoneracão");
        }

}

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", 123456, "joao@email.com");
        Professor professor = new Professor("Maria", 654321, "maria@email.com");
        Servidor servidor = new Servidor("José", 987654, "jose@email.com");

        aluno.exibirDados();
        aluno.matricular("POO");
        aluno.trancar();
        System.out.println();
        professor.exibirDados();
        professor.matricular("POO");
        professor.trancar();
        System.out.println();
        servidor.exibirDados();
        servidor.matricular("Jardinagem");
        servidor.trancar();
    }
}