public class Partida {
    private int dia;
    private int mes;
    private int hora;
    private int minuto;
    private Pontuacao clube1;
    private Pontuacao clube2;
    private int escore1;
    private int escore2;
    private int codigo;
    public Partida(int d, int m, int h, int min, Pontuacao cb1, Pontuacao cb2,int cod){
        dia=0; mes=0;

        if(m>0 && m<7 && m%2==0){if(d>0 && d<31) dia = d; mes=m;} else if(d>0 && d<32){dia = d; mes=m;} 
        if(m>6 && m<13 && m%2==1){if(d>0 && d<31) dia = d; mes=m;} else if(d>0 && d<32){dia = d; mes=m;}
        if(m==2){if(d>0 && d<29) dia = d;mes=m;} else if(m==7){if(d>0 && d<32) dia = d;mes=m;}
    
        if(h>-1 && h<24) hora = h; else hora = 0;
        if(min>-1 && min<60) minuto = min; else minuto = 0;
        clube1 = cb1;
        clube2 = cb2;
        codigo = cod;
    } 

    public boolean Game(int esc1, int esc2){
        if(esc1>=0 && esc2>=0){
            clube1.Game(esc1, esc2);
            clube2.Game(esc2, esc1);
            return true;
        }
        return false;
    }

    public int getDia() {
        return dia;
    }

    public boolean setDia(int d) {
        if(mes==2){if(d>0 && d<29) dia = d; return true;} else if(mes==7){if(d>0 && d<32) dia = d;return true;}else{    
        if(mes>0 && mes<7 && mes%2==0){if(d>0 && d<31) dia = d;return true;} else if(d>0 && d<32){dia = d;return true;} 
        if(mes>6 && mes<13 && mes%2==1){if(d>0 && d<31) dia = d;return true;} else if(d>0 && d<32){dia = d;return true;}
        } 
        return false;
    }

    public int getMes() {
        return mes;
    }

    public boolean setMes(int mes) {
        if(dia==28 && this.mes==2){mes=this.mes; return true;}else{
        if(dia==31 && this.mes>0 && this.mes<13){if(this.mes<8 && this.mes%2==1){mes = this.mes;return true;}} else if(this.mes>7 && this.mes%2==0) {mes=this.mes;return true;} 
        if(dia<31 && this.mes>0 && this.mes<13){mes = this.mes;return true;}
        }
        return false;
    }

    public int getHora() {
        return hora;
    }

    public boolean setHora(int hora) {
        if(this.hora>0 && this.hora<24) {this.hora = hora;return true;}
        return false;
    }

    public int getMinuto() {
        return minuto;
    }

    public boolean setMinuto(int minuto) {
        if(this.minuto>0 && this.minuto<60) {this.minuto = minuto;return true;}
        return false;
    }

    public Pontuacao getClube1() {
        return clube1;
    }

    public Pontuacao getclube2() {
        return clube2;
    }

    public int getEscore1() {
        return escore1;
    }

    public int getEscore2() {
        return escore2;
    }

    public int getCodigo() {
        return codigo;
    }

    public String toString(){
        return "Data: "+dia+"/"+mes+"\nHorário: "+hora+":"+minuto+"\nTime da casa: "+clube1.getTime()+"\nTime de fora: "+clube2.getTime()+"\nCódigo da Partida: "+codigo;
    }
}