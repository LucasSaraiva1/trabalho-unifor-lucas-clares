public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
       
        meuCarro.ligarCarro();
        meuCarro.acelerar(20);
        meuCarro.acelerar(50);
        System.out.println("");
        
        System.out.println("-- EXECUÇÃO DA CLASSE MOTOR.JAVA --");
        Motor motorCarro = new Motor();
        motorCarro.ligarMotor();

        // Supondo que a velocidade atual é 70 e a marcha atual é 3 (apenas para exemplo)
        int velocidadeAtual = 70;
        int marchaAtual = 3;

        int potencia = motorCarro.potenciaMotor(velocidadeAtual, marchaAtual);
        System.out.println("A potência do motor é: " + potencia + " unidades."); // Exibindo a potência calculada
        
        motorCarro.desligarMotor();
        motorCarro.ligarMotor();
        
        motorCarro.chamarMetodoCarro(meuCarro); // Chamando o método da classe Carro a partir da classe Motor

        System.out.println("");
        System.out.println("-- Criação de novo método na Classe Carro - Executado pela Clares criadora da Classe Motor --");
        double consumoGasolina = meuCarro.calcularConsumoGasolina(velocidadeAtual, marchaAtual);
        System.out.println("O consumo de gasolina é: " + consumoGasolina + " litros/h."); // Exibe o consumo de gasolina
    }
}
