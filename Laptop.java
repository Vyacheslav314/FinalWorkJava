package FinalWorkJava;
// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
// Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ


// 2 - Объем ЖД

// 3 - Операционная система

// 4 - Цвет …

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.



public class Laptop {

    String brand;
    double screenDiagonal;
    String color;
    int ram;
    String hardDisk;
    String operatingSystem;
    int price;
    
    public Laptop(String brand, double screenDiagonal, String color, int ram, String hardDisk, String operatingSystem, int price) {
        this.brand = brand;
        this.screenDiagonal = screenDiagonal;
        this.color = color;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.operatingSystem = operatingSystem;
        this.price = price;
    }


    public String getBrand() {
        return brand;
    }


    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public String getColor() {
        return color;
    }

    public int getRam() {
        return ram;
    }

    public String getHarDisk() {
        return hardDisk;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("бренд: %s\nдиагональ: %s\nцвет: %s\nОЗУ: %d\nЖД: %s\nОС: %s\nцена: %d\n", 
        brand, screenDiagonal, color, ram, hardDisk, operatingSystem, price);
    }
    
    
}
