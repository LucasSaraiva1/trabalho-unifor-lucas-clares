public class Motor {
    private boolean ligado;

    public Motor() {
        this.ligado = false;
        System.out.println("");
    }

    public void ligarMotor() {
        if (!ligado) {
            System.out.println("O motor foi ligado.");
            ligado = true;
        } else {
            System.out.println("O motor já está ligado.");
        }
    }

    public void desligarMotor() {
        if (ligado) {
            System.out.println("O motor foi desligado.");
            ligado = false;
        } else {
            System.out.println("O motor já está desligado.");
        }
    }
    public void chamarMetodoCarro(Carro carro) {
        carro.acelerar(30); // Chamando o método acelerar da classe Carro
    }
}