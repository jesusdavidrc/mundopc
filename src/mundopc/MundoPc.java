package mundopc;

import com.mundopc.*;

public class MundoPc {
    public static void main(String[] args) {
        Monitor monitorHp = new Monitor("HP", 24);
        Teclado tecladoHp = new Teclado("USB", "HP");
        Raton ratonHP = new Raton("USB", "HP");

        Computadora computadoraHp = new Computadora("Computadora HP", monitorHp, tecladoHp, ratonHP);

        Monitor monitorSony = new Monitor("Bluetooth", 19);
        Teclado tecladoSony = new Teclado("Bluetooth", "Sony");
        Raton ratonSony = new Raton("Bluetooth", "Sony");

        Computadora computadoraSony = new Computadora("Computadora Sony", monitorHp, tecladoSony, ratonHP);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHp);
        orden1.agregarComputadora(computadoraSony);

        orden1.mostarOrden();
    }
}
