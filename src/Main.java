import java.util.HashSet;
import java.util.Set;

/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
отвечающие фильтру. Критерии фильтрации можно хранить в Map.
Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, давай выберем тебе ноутбук");
        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("1", 8, 512, "Windows", "blue", "Samsung" ));
        set.add(new Notebook("2", 16, 1024, "Windows", "red", "LG" ));
        set.add(new Notebook("3", 8, 512, "Linux", "black", "HP" ));
        set.add(new Notebook("4", 16, 1024, "Mac", "white", "Apple" ));
        set.add(new Notebook("5", 32, 1024, "Windows", "black", "Lenovo" ));
        set.add(new Notebook("6", 4, 256, "Linux", "green", "Dell" ));
        set.add(new Notebook("7", 16, 1024, "Windows", "white", "HP" ));
        set.add(new Notebook("8", 32, 2048, "Windows", "blue", "Lenovo"));
        set.add(new Notebook("9", 32, 2048, "Mac", "black", "Apple"));
        set.add(new Notebook("10", 16, 512, "Linux", "red", "Samsung"));

        Operation operation = new Operation(set);
        operation.start();
        System.out.println("До свидания!");
    }
}