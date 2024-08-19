import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static List<Integer> number = new ArrayList<>();
    public static void main(String[] args) {

//     number.add(5);
//     number.add(8);
//     number.add(4);
//     number.add(3);
//     number.add(7);
        addNum(5);
        addNum(8);
        addNum(4);
        addNum(3);
        addNum(7);



       delete(1);
       updateByIndex(2,9);
       checkContains(8);
        printAll();



        }
        public static void addNum(int num ) {
        number.add(num);
            System.out.println("Элемент " + num + " успешно дабавлено ");
        }

        //первое задание я не  понял вы имели ввиду так?
//     public static void addNum() {
//        for (int i = 1; i <= 5; i++) {
//            number.add(i);
//        }
//    }

    public static void printAll(){
        for (int i =0; i < number.size(); i++) {
            System.out.println(number.get(i));
        }
    }

    public static void delete(int index) {
        if (number.size() < index) {
            System.out.println("Нет такого индекса! ");
            return;
        }
      int num = number.get(index);
        number.remove(index);
        System.out.println("Элемент " + num + " успешно удалено! ");

    }
    public static void updateByIndex( int index, int newValue) {
        if (number.size() < index) {
            System.out.println("Нет такого индекса ");
            return;
        }
        number.set(index,newValue);
        System.out.println("Элемент под индексом " + index + " изменено на новый элемент " + newValue);

    }
    public static void checkContains(int num) {
        if (number.contains(num)) {
            System.out.println("Элемент " + num + " уже есть в списке ");
            return;
        }else {
            System.out.println("Списке нет такого элемента ");
        }
    }
}