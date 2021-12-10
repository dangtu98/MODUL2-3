package kethua.baitap.bai4;

import java.util.Scanner;

public class tesstTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào cạnh a tam giác");
        double side1 = scanner.nextDouble();
        System.out.println("nhập vào cạnh b tam giác");
        double side2 = scanner.nextDouble();
        System.out.println("nhập vào cạnh c tam giác");
        double side3 = scanner.nextDouble();
        System.out.println("nhập vào màu của tam giác");
        scanner.nextLine();
        String color = scanner.nextLine();

        Triangle triangletes = new Triangle(color , side1 , side2 , side3);
        System.out.println(triangletes);
        System.out.println("diện tích tam giác là");
        System.out.println(triangletes.getArea());
        System.out.println("chu vi tam giác là");
        System.out.println(triangletes.getPerimeter());
    }
}
