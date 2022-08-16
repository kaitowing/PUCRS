public class Pontuacao{
    private int Cod;
    private String Time;
    private int P;
    private int J;
    private int V;
    private int E;
    private int D;
    private int GP;
    private int GC;
    private int SG;
    private double apro;
    public Pontuacao(int cod, String time){
        V = 0;
        E = 0;
        D = 0;
        GP = 0;
        GC = 0;
        SG = 0;
        Cod = cod;
        Time = time;
        P = 0;
        J = 0;
        apro = 0;
    }
    
    public int getCod(){
        return Cod;    
    }
    
    public String getTime(){
        return Time;
    }
    
    public int getP(){
        return P;  
    }
    
    public int getJ(){
        return J;
    }
    
    public int getV(){
        return V;
    }
    
    public int getE(){
        return E;
    }
    
    public int getD(){
        return D;
    }
    
    public int getGP(){
        return GP;
    }
    
    public int getGC(){
        return GC;
    }
    
    public int getSG(){
        return SG;
    }
    
    public double getAprov(){
        return apro;
    }
    
    public void setCod(int cod){
        if(cod>0) Cod = cod;
    }
    
    public void setTime(String time){
        if(time != "") Time = time;
    }
    
    public void Game(int gp, int gc){
        int aux1=V,aux2=E;
        if(gp>0 || gc>0){
            GP=GP+gp; GC=GC+gc; SG=GP-GC;
            if(gp>gc) V++;
                else if(gp==gc) E++;
                    else D++;
            if(V>aux1) P=P+3;
                else if(E>aux2) P++;
            J++;
            apro = (P/(J*3.0))*100;    
        }
    }
}