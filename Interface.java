package FinalWorkJava;

import java.util.*;

public class Interface {

    public static Scanner scan = new Scanner(System.in);

    public static void userInterface() {
        List<Laptop> listLaptops = CreateLaptop.intLaptop();
        Map<Integer, String> filterСriteria = new HashMap<>();

        while (true) {
            System.out.println(
                "1.Фильтр по бренду\n2.Фильтр по Размеру экрана\n3.Фильтр по цвету\n4.Фильтр по ОЗУ\n5.Фильтр по типу ЖД\n6.Фильтр по OS\n7.Фильтр по цене\n8.Показать все ноутбуки\n9.Завершить работу\n");
            int command = scan.nextInt();
            switch (command) {
                case 1:
                    System.out.println("ВЫберите номер фильтра ");
                    filterСriteria = GetProperties.getPropertiesBrand(listLaptops);
                    showMap(filterСriteria);
                    command = scan.nextInt();
                    Filter.filterBrand(filterСriteria, command, listLaptops);
                    break;
                case 2:
                    Filter.filterValues(listLaptops, command);
                    break;
                case 3:
                    System.out.println("ВЫберите номер фильтра ");
                    filterСriteria = GetProperties.getPropertiesColor(listLaptops);
                    showMap(filterСriteria);
                    command = scan.nextInt();
                    Filter.filterColor(filterСriteria, command, listLaptops);
                    break;
                case 4:
                    Filter.filterValues(listLaptops, command);
                    break;
                case 5:
                    System.out.println("ВЫберите номер фильтра ");
                    filterСriteria = GetProperties.getPropertiesHDD(listLaptops);
                    showMap(filterСriteria);
                    command = scan.nextInt();
                    Filter.filterHDD(filterСriteria, command, listLaptops);
                    break;
                case 6:
                    System.out.println("ВЫберите номер фильтра ");
                    filterСriteria = GetProperties.getPropertiesOS(listLaptops);
                    showMap(filterСriteria);
                    command = scan.nextInt();
                    Filter.filterOS(filterСriteria, command, listLaptops);
                    break;
                case 7:
                    Filter.filterValues(listLaptops, command);
                    break;
                case 8:
                    showLaptop(listLaptops);
                    break;
                case 9:
                    return;
                default:
                    break;
            }
        }
    }

    public static void showLaptop(List<Laptop> listLaptops) {
        int count = 0;
        for (int i = 0; i < listLaptops.size(); i++) {
            System.out.println(listLaptops.get(i));
            count++;
        }
        System.out.printf("Результат поиска %d совпадений \n\n", count);
    }

    public static void showMap(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> pair : map.entrySet()) {
            int key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + ":" + value);
        }
    }
}
