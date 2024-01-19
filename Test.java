package com.Java;

//public class Test {
//    public static void main(String[] args) {
//        System.out.println("Test.main");
//    }
//}

//class Test
//{
//    int a, b;
//    Test()
//    {
//        a = 10;
//        b = 20;
//    }
//}
//
//class Runner
//{
//    public static void main(String[] args)
//    {
//        Test obj1 = new Test();
//        Test obj2 = obj1;
//
//        obj1.a += 1;
//        obj1.b += 1;
//
//        obj2.a += 1;
//        obj2.b += 1;
//        System.out.println(obj1.a);
//        System.out.println(obj1.b);
//    }
//}

class Test extends Exception { }

class Main {
    public static void main(String args[]) {
        try {
            throw new Test();
        }
        catch(Test t) {
            System.out.print("A");
        }
        finally {
            System.out.print("B");
        }
    }
}
