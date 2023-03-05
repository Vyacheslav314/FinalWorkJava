package FinalWorkJava;

import java.util.*;

public class CreateLaptop {

    private final List<Laptop> listLaptops;;

    public CreateLaptop() {
        this.listLaptops = new LinkedList<>();
    }

    public void addLaptop(Laptop laptop) {
        this.listLaptops.add(laptop);
    }
}
