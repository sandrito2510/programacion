import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Programa212{
    public static void main(String[] args) {
        final var miCumple = LocalDate.of(1994, Month.OCTOBER,25);
        final var fechaActual = LocalDate.now();
        long diasDeDiferencia = ChronoUnit.DAYS.between(miCumple, fechaActual);
        long mesesDeDiferencia = ChronoUnit.MONTHS.between(miCumple, fechaActual);
        long aniosDeDiferencia = ChronoUnit.YEARS.between(miCumple, fechaActual);
        System.out.println("Días de diferencia: " + diasDeDiferencia);
        System.out.println("Meses de diferencia: " + mesesDeDiferencia);
        System.out.println("Años de diferencia: " + aniosDeDiferencia);
    }


}