import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Admin {
    private String id;
    private String nombre;
    private String correo;
    private String correo;
    private String password;
    private List<Materia> listamaterias;

    public void Administrador(String id, String nombre, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
    }

    private String IdAleatorio() {
        Random random = new Random();
        int numero = random.nextInt(9999);
        return String.format("ADM%04d", numero);
    }
    public booleen agregarMaterias(String materia)
    {
        if (!listamaterias.contains(materia)){
            listamaterias.add(materia);
            System.out.println("Materia" + materia "agregada con exito");
            return true;
        }else{
            System.out.println("Materia " + materia + " ya existe");
            return false;
        }
    }
    public boolean removerMaterias(String materia){
        if (listamaterias.contains(materia)){
            listamaterias.remove(materia);
            System.out.println("Materia " + materia + " removida con exito");
            return true;
        }else {
            System.out.println("Materia " + materia + " no existe");
            return false;
        }
    }
    public boolean validarContraseña(String password){
        return this.password.equals(password);
    }
    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCorreo() {
        return correo;
    }
}
