import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();

        // Считываем первые 5 строк и сохраняем их в список A
        System.out.println("Enter 5 names for list A: ");
        for (int i = 0; i < 5; i++) {
            String str = scanner.nextLine();
            listA.add(str);
        }

        // Выводим список A
        System.out.println("Список A: " + listA);


        // Считываем следующие 5 строк и сохраняем их в список B
        System.out.println("enter 5 names for list B: ");
        for (int i = 0; i < 5; i++) {
            String str = scanner.nextLine();
            listB.add(str);
        }
        System.out.println("List B: " + listB);


        List<String> listC = new ArrayList<>();
        int size = Math.max(listA.size(), listB.size());
        for (int i = 0; i < size; i++) {
            if (i < listA.size()) {
                listC.add(listA.get(i));
            }
            if (i < listB.size()) {
                listC.add(listB.get(listB.size() - i - 1));
            }
        }
        System.out.println("List C: " + listC);


        Collections.sort(listC, Comparator.comparing(String::length));

        System.out.println("Sorted list C: " + listC);
    }

    public static void pol() {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(80);
        list.add(10);
        list.add(180);
        Collections.sort(list);
        list.remove(2);
        for (Integer le : list) {
            System.out.println(le + " ");
        }
    }

}