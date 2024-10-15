import java.util.ArrayList;
import java.util.List;

public class GestionAdmin extends Admin{
    private List<Administrador> administradores;

    public GestionAdmin() {
        this.administradores = new ArrayList<>();
    }
    public void agregarAdministrador(Administrador admin){
        administradores.add(admin);
        System.out.println("Administrador:" + admin.getNombre() + "añadido.");
    }
    public void eliminarAdministrador(int id){
        administradores.removeIf(admin -> admin.getId().equals(id));
        System.out.println("Administrador con ID:" + id + " eliminado.");
    }

}
