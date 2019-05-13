/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion;

/**
 *
 * @author DAW
 */
public class Fecha {
    
    private int dia;
    private int mes;
    private int anyo;

         
    public Fecha(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;     
    }
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }
    
     public boolean bisiesto(){
        
        if ((this.anyo % 4 == 0) && ((this.anyo % 100 != 0) || (this.anyo % 400 == 0)))
            return true;
        else
            return false;
        
        
    }
    
    public int diasMes(int mes){
        
        int dias;
        
        switch(mes){
            
            case 1: 
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias=31;
                break;
            case 2:
                if (bisiesto()) dias=29;
                else dias=28;
                break;
            default:
                dias=30;
        }
        return dias;
    }
    
    public boolean valida(){
        
        boolean fechaOk=true;
        
        if ((this.anyo<1900) || (this.anyo>2050)) {
            this.anyo=1900;
            fechaOk=false;            
        }
        if ((this.mes<1) || (this.mes>12)) {
            this.mes=1;                
            fechaOk=false;            
        }
        
        if ((this.dia<1) || (this.dia>31)) {
            this.dia=1;
            fechaOk=false;            
         
        } else {
            
            if (this.mes==2){
                if ((bisiesto()==false) && (this.dia>28))  {
                    this.dia=1;
                    fechaOk=false;                    
                }
                else if ((bisiesto()) && (this.dia>29))  {
                    this.dia=1;
                    fechaOk=false;                    
                }                
            }
            else if ((this.mes==4) || (this.mes==6) || (this.mes==9) || (this.mes==11)) {
                if (this.dia>30){
                    this.dia=1;
                    fechaOk=false;                    
                } 
            }
        }
            
        return fechaOk;
                
    }
    
    
    public String corta(){        
        return this.dia + "-" + this.mes + "-" + this.anyo;         
    }
    
    public void siguiente(){
        if ((this.mes==12) && (this.dia==31)){
            this.anyo++;
            this.mes=1;
            this.dia=1;            
        }
        else if ((this.dia==31) && ((this.mes==1) || (this.mes==3) || (this.mes==5) || (this.mes==7) || (this.mes==8) || (this.mes==10))){        
                this.mes++;                
                this.dia=1;                    
        }
        else if ((this.dia==30) && ((this.mes==4) || (this.mes==6) || (this.mes==9) || (this.mes==11))){        
                this.mes++;                
                this.dia=1;
        }
        else if ((this.dia==28) && (this.mes==2) && (bisiesto()==false)){        
                this.mes++;                
                this.dia=1;
        }
        else if ((this.dia==29) && (this.mes==2) && (bisiesto())){        
                this.mes++;                
                this.dia=1;
        }
        else this.dia++;  
    }
    
    public void anterior(){
        if ((this.mes==1) && (this.dia==1)){
            this.anyo--;
            this.mes=12;
            this.dia=31;            
        }
        else if ((this.dia==1) && ((this.mes==2) || (this.mes==4) || (this.mes==6) || (this.mes==8) || (this.mes==9) || (this.mes==11))){        
                this.mes--;                
                this.dia=31;                    
        }
        else if ((this.dia==1) && ((this.mes==5) || (this.mes==7) || (this.mes==10) || (this.mes==12))){        
                this.mes--;                
                this.dia=30;
        }
        else if ((this.dia==1) && (this.mes==3) && (bisiesto()==false)){        
                this.mes--;                
                this.dia=28;
        }
        else if ((this.dia==1) && (this.mes==3) && (bisiesto())){        
                this.mes--;                
                this.dia=29;
        }
        else this.dia--;  
    }
    
    public boolean igualQue(Fecha fec){
        
        if ((this.anyo==fec.anyo) && (this.mes==fec.mes) && (this.dia==fec.dia)) return true;
        else return false;        
    }
    
    
    public boolean menorQue(Fecha fec){
        
        boolean menor=false;
        if (this.anyo<fec.anyo) menor=true;
        else if (this.anyo==fec.anyo){
            if (this.mes<fec.mes) menor=true;
            else if (this.mes==fec.mes){
                if (this.dia<fec.dia)menor=true;
            }
                
        }    
        return menor;
    }
    
    public boolean mayorQue(Fecha fec){
        
        boolean mayor=false;
        if (this.anyo>fec.anyo) mayor=true;
        else if (this.anyo==fec.anyo){
            if (this.mes>fec.mes) mayor=true;
            else if (this.mes==fec.mes){
                if (this.dia>fec.dia)mayor=true;
            }
                
        }    
        return mayor;
    }
    
}
