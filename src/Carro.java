public class Carro {
    private boolean ligado;
    private int velocidade;

    public Carro() {
        this.ligado = false;
        this.velocidade = 0;
    }

    public void ligarCarro() {
        if (!ligado) {
            System.out.println("O carro foi ligado.");
            ligado = true;
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
