package dz3;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Kamaz kamaz = new Kamaz("Камаз","тралл", Color.red,"Классика", 8, "Дизель", "МКПП", 5.5f);
        System.out.print(kamaz + " - ");
        kamaz.refueling(kamaz.getFuel());
        Kamaz kamaz1 = new Kamaz("Камаз","тралл", Color.red,"Классика", 8, "АИ-95", "АКПП", 3.5f);
        System.out.println(kamaz1);
        kamaz1.refueling(kamaz1.getFuel());
    }
}
