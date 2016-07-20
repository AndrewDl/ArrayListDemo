/**
 * Created by Andrew on 07/19/16.
 */
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        int n;
        int k;
        double length;
        double width;
        ArrayList <Rectangle> rectangles = new ArrayList <>();
        do{
            System.out.println("1. Додати елемент");
            System.out.println("2. Видалити елемент");
            System.out.println("3. Дізнатися площу та периметр елемента");
            System.out.println("4. Вставити елемент в певну позицію списку");
            System.out.println("5. Завершити роботу програми");
            System.out.println("Введіть номер пункту, який Ви бажаєте виконати:");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            if(n==1){
                System.out.println("Введіть довжину прямокутника:");
                length = sc.nextDouble();
                System.out.println("Введіть ширину прямокутника:");
                width = sc.nextDouble();
                Rectangle rectangle1 = new Rectangle();
                rectangle1.length = length;
                rectangle1.width = width;
                rectangles.add(rectangle1);
            }
            if(n==2){
                System.out.println("Введіть номер елементу, який ви бажаєте видалити:");
                k = sc.nextInt();
                rectangles.remove(k-1);
            }
            if(n==3){
                Rectangle rectangle2 = new Rectangle();
                System.out.println("Введіть номер елементу, периметр та площу якого ви бажаєте побачити:");
                k = sc.nextInt();
                System.out.println("Периметр:" + rectangles.get(k-1).Perimeter());
                System.out.println("Площа:" + rectangles.get(k-1).Square());
            }
            if(n==4){
                System.out.println("Введіть довжину прямокутника:");
                length = sc.nextDouble();
                System.out.println("Введіть ширину прямокутника:");
                width = sc.nextDouble();
                Rectangle rectangle3 = new Rectangle();
                rectangle3.length = length;
                rectangle3.width = width;
                System.out.println("Введіть номер елементу, який ви бажаєте замінити:");
                k = sc.nextInt();
                rectangles.set(k-1, rectangle3);
            }
            System.out.println("Ваш список:");
            for (k = 0; k<rectangles.size(); k++){
                int num = k+1;
                double length1 = rectangles.get(k).length;
                double width1 = rectangles.get(k).width;
                System.out.println(num + ". довжина прямокутника:" + length1 + ", ширина прямокутника:" + width1);
            }
            System.out.println();
        }
        while(n!=5);
    }
}
