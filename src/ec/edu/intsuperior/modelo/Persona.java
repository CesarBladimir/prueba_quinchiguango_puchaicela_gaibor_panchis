package ec.edu.intsuperior.modelo;

public class Persona {

    private String nombre1;
    private String nombre2;
    private String ci;
    private String apellido1;
    private String apellido2;
    private String celular;
    private String direccion;
    private String correo;
    private String fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre1, String nombre2, String ci, String apellido1, String apellido2, String celular, String correo, String fechaNacimiento) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.ci = ci;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.celular = celular;
        this.direccion = direccion;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre1() {
        return nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public String getCi() {
        return ci;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getCelular() {
        return celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int calcularedad() {
        int edad = 23;
        return edad;
    }

    @Override
    public String toString() {
        return "Los tipos de datos son: \n "
                + "cedula: " + getApellido1() + "\n"
                + "apellidos y nombres : " + getApellido1() + " " + getApellido2()
                + " " + getNombre1() + " " + getNombre2() + "\n"
                + "Direcion: " + getDireccion() + "\n"
                + "Celular: " + getCelular() + "\n"
                + "Correo: " + getCorreo() + "\n"
                + "Edad: " + calcularedad();

    }

    

    }


