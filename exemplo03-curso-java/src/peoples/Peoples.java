package peoples;

public class Peoples {
    private String name;
    private int idade;
    private double altura;

    public Peoples(String name, int idade, double altura){
        this.name = name;
        this.idade = idade;
        this.altura = altura;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }






}

