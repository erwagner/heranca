
package heranca;

public class Funcionarios extends Pessoa{

    String cargo;
    int prontuario;
    double salario;

    public Funcionarios(String cargo, int prontuario, double salario, String nome, int cpf, int idade) {
        super(nome, cpf, idade);
        this.cargo = cargo;
        this.prontuario = prontuario;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getProntuario() {
        return prontuario;
    }

    public void setProntuario(int prontuario) {
        this.prontuario = prontuario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
