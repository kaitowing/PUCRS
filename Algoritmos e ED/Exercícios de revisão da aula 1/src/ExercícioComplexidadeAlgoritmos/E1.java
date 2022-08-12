package ExercícioComplexidadeAlgoritmos;

public class E1{
    public static void main(String[] args) {
        int[] teste = new int[21];
        int num = 0;
        for (int i = 0; i < teste.length; i++) {
            teste[i] = num;
            num++;
        }
        teste = separaParImpar1(teste);

        for (int i = 0; i < teste.length; i++) {
            System.out.println(teste[i]);
        }
    }

    // Apenas um laço e sem vetor auxiliar.

    public static int[] separaParImpar1(int[] vet){
        int aux, contador = 0, aux2;
        for(int i = 0; i<vet.length/2; i++){
            if(vet[i]%2!=0){
                for(aux = vet.length-1; aux>=0; aux--){
                    if(vet[aux]%2==0){
                        aux2 = vet[aux];
                        vet[aux] = vet[i];
                        vet[i] = aux2;
                        contador++;
                    } else contador++;
                } 
            }
        }
        System.out.println("contador = "+contador);
        return vet;
    }

    //Mais de um laço e com vetor auxiliar.
    
    public static int[] separaParImpar2(int[] vet){
        int[] vetAux = new int[vet.length];
        int indice = 0, contador = 0;
        for(int i = 0; i<vet.length; i++){
            if(vet[i]%2==0){
                vetAux[indice] = vet[i];
                indice++;
            }
            contador++;
        }
        for(int j =0; j<vet.length; j++){
            if(vet[j]%2!=0){
                vetAux[indice] = vet[j];
                indice++;
            }
            contador++;
        }
        System.out.println("Contador = " + contador);
        return vetAux;
    }

    
}


