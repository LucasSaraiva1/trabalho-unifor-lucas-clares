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

    /*public void acelerar(int incremento) {
        if (ligado) {
            velocidade += incremento;
            System.out.println("Acelerando. Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("Não é possível acelerar, o carro está desligado.");
        }
    }*/

      //
    
        public void acelerar(int incremento) {
            if (ligado) {
                if (velocidade == 0) {
                    velocidade += incremento;
                    System.out.println("Acelerando. Velocidade Inicial: " + velocidade + " km/h");
                } else {
                    velocidade += incremento;
                    System.out.println("Acelerando. Velocidade atual: " + velocidade + " km/h");
                }
            } else {
                System.out.println("Não é possível acelerar, o carro está desligado.");
            }
        
    
        
    }
    

    public double calcularConsumoGasolina(int velocidadeAtual, int marchaAtual) {
        // Suponha uma relação básica entre velocidade, potência e consumo de gasolina
        // Esta é uma lógica de exemplo, você pode ajustar conforme necessário
        double potencia = motor.potenciaMotor(velocidadeAtual, marchaAtual);

        // Suponha que o consumo é diretamente proporcional à potência e à velocidade
        // Novamente, isso é apenas um exemplo, a lógica real pode ser mais complexa
        return potencia * velocidadeAtual * 0.0001; // Fórmula de exemplo para consumo de gasolina
    }
}
