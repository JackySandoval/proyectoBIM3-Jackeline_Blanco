package agendatelefonica;

public class contacto {

    private String numero_de_telefono, nombre, domicilio;

    public contacto(String numero_de_telefono, String nombre, String domicilio) {
        this.numero_de_telefono = numero_de_telefono;
        this.nombre = nombre;
        this.domicilio = domicilio;
    }

    public String verNombre() {
        return this.nombre;
    }
    public String verNumero() {
       return this.numero_de_telefono;
    }
    public String verDomicilio() {
       return this.domicilio;
    }
    public void SetNombre(String nombre) {
        this.nombre = nombre;
    }
    public void SetDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
}
