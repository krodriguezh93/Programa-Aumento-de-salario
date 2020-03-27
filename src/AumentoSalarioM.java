import java.util.Scanner;

import java.text.DecimalFormat;

/*El departamento de recursos humanos quiere realizar un aumento general en todos sus empleados mayores a 
 * 25 ańos por lo que necesita que se realize una aplicación que solicite que se le introduzca el nombre, 
 * edad y salario del empleado para hacer hacer los cálculos.

Si el empleado es menor de 25 debe mostrar el mensaje
    "Lo sentimos [nombre del empleado] pero el aumento no aplica para ti en este momento.
A los empleados entre 26 y 50 ańos se les hará un aumento de 5.5% de su salario
A los empleados entre 51 y 60 ańos se les hará un aumento de 10.16% de su salario
A los empleados mayores a los 60 ańos se les hará un aumento de 16.26% de su salario

Al terminar de realizar los cálculos debe mostrar por consola lo siguiente:
El empleado [nombre del empleado] con edad [edad del empleado] le corresponde un aumento de
 un [el % que le corresponde]%, siendo su nuevo salario RD$ [salario + el % aumentado].
*/
public class AumentoSalarioM {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###,##0.00");
        String nombre;
        int edad;
        double salario;
        double porcentaje = 0.0;

        System.out.println("Introduzca el nombre del empleado");
        nombre = entrada.next();
        System.out.println("Introduzca la edad del empleado");
        edad = entrada.nextInt();
        System.out.println("Introduzca el sueldo del empleado");
        salario = entrada.nextDouble();

        if (edad < 25) {
            System.out.println("Lo sentimos " + nombre + " pero el aumento no aplica para ti en este momento");
            return;
        } else if (edad > 25 && edad <= 50) {
            porcentaje = 5.5;
        } else if (edad >= 51 && edad < 60) {
            porcentaje = 10.16;
        } else if (edad >= 60) {
            porcentaje = 16.26;
        }

        salario += (salario * porcentaje) / 100;
        System.out.println("El empleado " + nombre + " con edad " + edad + " le corresponde un aumento de un "
                + porcentaje + "%, siendo su nuevo salario RD$ " + df.format(salario) + ".");
    }
}
