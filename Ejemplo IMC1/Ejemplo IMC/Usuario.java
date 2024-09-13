import java.util.ArrayList;
import java.util.List;

public class Usuario
{
    public String Nombre;
    public String Apellido;
    private String cedula;
    protected String email;
    public String Genero;
    public List<IMC> HistorialIMC;

    public Usuario(){
        
    }

    public Usuario(String nombre, String apellido, String cedula, String email, String genero)
    {
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.cedula = cedula;
        this.email = email;
        this. Genero = genero;
        this. HistorialIMC = new ArrayList<IMC>();
    }

    public String GetCedula()
    {
        return cedula;
    }

    public String GetEmail()
    {
        return email;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public List<IMC> getHistorialIMC() {
        return HistorialIMC;
    }

    public void setHistorialIMC(List<IMC> historialIMC) {
        HistorialIMC = historialIMC;
    }

    public void agregarIMC(IMC imc) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregarIMC'");
    }

    public IMC[] getImcList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getImcList'");
    }


    
}