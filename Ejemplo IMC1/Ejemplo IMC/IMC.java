import java.util.Date;

public class IMC extends Usuario{
    public double Peso ;
    public double Altura ;
    public Date Fecha ;

    


    public IMC(String nombre, String apellido, String cedula, String email, String genero, double peso, double altura,
            Date fecha) {
        super(nombre, apellido, cedula, email, genero);
        Peso = peso;
        Altura = altura;
        Fecha = fecha;
    }

    public double CalcularIMC(double Altura, double Peso)
    {
        return Peso / (Altura * Altura);
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

}