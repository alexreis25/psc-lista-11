public class Caminhao extends Veiculo{

    public Caminhao(String marca , String modelo , int ano){
        super(marca,modelo,ano);
    }

    @Override
    public void acelerar(){
        System.out.println(getModelo() +" "+ getMarca() + "  está engrenando a próxima marcha e acelerando lentamente.");
    }
    
}
