import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Func_Conv_Fecha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una fecha (YYYY-MM-DD): ");
        String entrada = sc.nextLine().trim();

        try {
            LocalDate fecha = LocalDate.parse(entrada);
            LocalDate Semana_Despues = fecha.plusWeeks(1);
            LocalDate Mes_Antes = fecha.minusMonths(1);

            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            System.out.println("Fecha que ingresate     : " + fecha.format(fmt));
            System.out.println("Una semana después : " + Semana_Despues.format(fmt));
            System.out.println("Un mes antes       : " + Mes_Antes.format(fmt));
        } catch (DateTimeParseException e) {
            System.out.println("Formato no valido, usa solamente el formato YYYY-MM-DD.");
        }
    }
}