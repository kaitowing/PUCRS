public class AppCar{
    public static void main(String args[]){
        Placa p1 = new Placa(args[1],args[2]);
        
        Veiculo v = new Veiculo(p1);
        int abastecida = Integer.parseInt(args[3]);  
        v.abastece(abastecida);
        int i=Integer.parseInt(args[4]);  
        v.dirige(i);
        
        System.out.println(v);
        System.out.println("O carro ainda pode percorrer um total de: " + v.getCombustivelNoTanque() * 10 + "Km");
        System.out.println();
        }
}