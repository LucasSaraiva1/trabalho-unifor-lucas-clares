public class Carro {
    private boolean ligado;
    private int velocidade;
    private Motor motor; // Adicionando um objeto Motor como atributo

    public Carro() {
        this.ligado = false;
        this.velocidade = 0;
        this.motor = new Motor(); // Inicializando o objeto Motor
    }

    public void ligarCarro() {
        if (!ligado) {
            System.out.println("");
            System.out.println("-- EXECUÇÃO DA CLASSE CARRO.JAVA --");
            System.out.println("");
            System.out.println("O carro foi ligado.");
            ligado = true;
            motor.ligarMotor(); // Chamando o método ligarMotor da classe Motor
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void acelerar(int incremento) {
        if (ligado) {
            velocidade += incremento;
            System.out.println("Acelerando. Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("Não é possível acelerar, o carro está desligado.");
        }
    }
}
