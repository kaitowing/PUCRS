import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        reader();
    }

    public static void renum(ArrayList<String> lista){
        Map<String,ArrayList> mapa = new HashMap<String,ArrayList>();
        String principal = "";
        String fim = "";
        String add = "";

        for (int i = 0; i < lista.size(); i++) {
            ArrayList linhas = new ArrayList<String>();
            String aux[] = lista.get(i).split(" ");
            for (int j = 1; j < aux.length; j++) {
                linhas.add(aux[j]);
            }
            mapa.put(aux[0], linhas);
        }
        
        Set<String> mapas = mapa.keySet();
        
        if(mapa.get(mapas.iterator().next()))
    }

    public static void reader(){
        Path path = Paths.get("C:\\Users\\Arthur\\Workspace\\PUCRS\\POO\\Projects\\src\\basic\\Prog1.bas");
        ArrayList linhas = new ArrayList<>();
        try (Scanner sc = new Scanner(Files.newBufferedReader(path, StandardCharsets.UTF_8))){
            while (sc.hasNext()){
                String linha = sc.nextLine();
                linhas.add(linha);
            }
            renum(linhas);
        }catch (IOException x){
            System.err.format("Erro de E/S: %s%n", x);
        }
    }
    
    public static void writeL(String linha){

        String currDir = Paths.get("").toAbsolutePath().toString();
        String nameComplete = currDir+"\\"+"C:\\Users\\Arthur\\Workspace\\PUCRS\\POO\\Projects\\src\\basic\\Prog1fim.bas";
        Path path = Paths.get(nameComplete);
        String end[] = linha.split(";");
    
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(path, StandardCharsets.UTF_8))){
            for(int i=0;i<end.length;i++){
                writer.print(end[i]+"\n");
            }
        }catch (IOException x){
        System.err.format("Erro de E/S: %s%n", x);
        }
    }
}