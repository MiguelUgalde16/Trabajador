package Trabajador;

public class principal {
    public static  void main(String[] args) {
        Obrero tra1=new Obrero();
        Supervisor tra2=new Supervisor();
        Gerente tra3=new Gerente();
     
        tra1.sueldo();
        tra2.sueldo();
        tra3.sueldo();
     
        Trabajador [] tra=new Trabajador[3];
        tra[0]=new Gerente();
        tra[1]=new Supervisor();
        tra[2]=new Obrero();
   
    }
   

    
}
