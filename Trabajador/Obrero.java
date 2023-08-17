package Trabajador;

public class Obrero {
    //Atributos
    private int id;
    private double salario;
    public String nombre, apellido;

    //Crear los metodos Get y Set para poder acceder a nuestros atributos de tipo privado
    void setid (int id) {
        this.id=id;
    }
    int getid(){
        return id;
    }
     //Crear el metodo para mostrar los datos
     void verDatos(){
        System.out.println("id: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Salario: " + salario);
    }
    public void sueldo() {
    }
}
