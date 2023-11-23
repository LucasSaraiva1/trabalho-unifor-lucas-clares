public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
       
        meuCarro.ligarCarro();
        meuCarro.acelerar(20);
        meuCarro.acelerar(50);
        
        Motor motorCarro = new Motor();
        motorCarro.ligarMotor();
        motorCarro.desligarMotor();
        motorCarro.ligarMotor();
        
        motorCarro.chamarMetodoCarro(meuCarro); // Chamando o método da classe Carro a partir da classe Motor
    }
}
