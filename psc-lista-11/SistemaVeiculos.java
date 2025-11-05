public class SistemaVeiculos{
    public static void main(String[]args){

        Carro carro1 = new Carro("Honda" , "City" , 2013);
        Moto moto1 = new Moto("Honda" , "Cg Fan 160" , 2024);
        Caminhao caminhao1 = new Caminhao("Volvo", "FH540", 2020);

        carro1.exibirDetalhes();
        carro1.acelerar();

        moto1.exibirDetalhes();
        moto1.acelerar();

        caminhao1.exibirDetalhes();
        caminhao1.acelerar();
    }
}