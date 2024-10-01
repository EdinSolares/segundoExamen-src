package segundoParcial;

public class CalculadoraVacaciones {
    public static int calcularDiasVacaciones(Empleado empleado) {
        String departamento = empleado.getDepartamento();
        String antiguedad = empleado.getAntiguedad();

        if (departamento.equals("Atención al cliente")) {
            if (antiguedad.equals("1 año")) return 6;
            if (antiguedad.equals("2-6 años")) return 14;
            if (antiguedad.equals("7+ años")) return 20;
        } else if (departamento.equals("Logística")) {
            if (antiguedad.equals("1 año")) return 7;
            if (antiguedad.equals("2-6 años")) return 15;
            if (antiguedad.equals("7+ años")) return 22;
        } else if (departamento.equals("Gerente")) {
            if (antiguedad.equals("1 año")) return 10;
            if (antiguedad.equals("2-6 años")) return 20;
            if (antiguedad.equals("7+ años")) return 30;
        }else if (departamento.equals("Limpieza")) {
            if (antiguedad.equals("1 año")) return 5;
            if (antiguedad.equals("2-6 años")) return 12;
            if (antiguedad.equals("7+ años")) return 18;
        }
        

        return 0; // Caso por defecto
    }
}
