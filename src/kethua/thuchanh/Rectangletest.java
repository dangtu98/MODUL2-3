package kethua.thuchanh;

public class Rectangletest {
    public static void main(String[] args) {
        Retangle retangle1 = new Retangle();
        System.out.println(retangle1);

        retangle1 = new Retangle(2.3 , 5.8);
        System.out.println(retangle1);

        retangle1 = new Retangle("origen",true,2.5,1.3);
        System.out.println(retangle1);


    }
}
