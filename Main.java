package FinalWorkJava;

public class Main {
    
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Lenovo", 16.8, "black", 1024, "HDD", "Windows", 35000);
        Laptop laptop2 = new Laptop("Acer", 18, "Gray", 2048, "SSD", "Windows", 45000);
        Laptop laptop3 = new Laptop("Dell", 14.3, "Gray", 4096, "SSD", "Windows", 100000);
        Laptop laptop4 = new Laptop("Apple", 16.8, "Silver", 2048, "SSD", "MacOs", 350000);
        Laptop laptop5 = new Laptop("Asus", 22, "black", 4096, "HDD", "Windows", 55000);
        Interface viewInterface = new Interface();
  

        viewInterface.userInterface();
    }
}
