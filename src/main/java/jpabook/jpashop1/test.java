package jpabook.jpashop1;

public class test {

    public static void main(String[] args) {

        if ((test1() || test2()) && test3()) {
            System.out.println("hello");
        }
    }

    static boolean test1() {
        System.out.println("test1");
        return true;
    }
    static boolean test2() {
        System.out.println("test2");
        return true;
    }

    static boolean test3() {
        System.out.println("test3");
        return true;
    }

}
