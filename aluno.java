package aula5;

public class Aluno implements Aula {
    private String nome;
    private int idade;
    private String ra;
    private String cpf;
    private String curso;
    private double notaAV1;
    private double notaAV2;
    
    public Aluno(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    @Override
    public void av1() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void av2() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void entradaCatraca() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getRa() {
        return ra;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCurso() {
        return curso;
    }

    public double getNotaAV1() {
        return notaAV1;
    }

    public double getNotaAV2() {
        return notaAV2;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNotaAV1(double notaAV1) {
        this.notaAV1 = notaAV1;
    }

    public void setNotaAV2(double notaAV2) {
        this.notaAV2 = notaAV2;
    }
}
