package segundoParcial;

public class Empleado {
    private String nombre;
    private String apellidos;
    private String departamento;
    private String antiguedad;

    public Empleado(String nombre, String apellidos, String departamento, String antiguedad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.departamento = departamento;
        this.antiguedad = antiguedad;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getApellidos() { return apellidos; }
    public String getDepartamento() { return departamento; }
    public String getAntiguedad() { return antiguedad; }
}