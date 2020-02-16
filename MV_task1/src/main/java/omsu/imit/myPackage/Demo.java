package omsu.imit.myPackage;

import omsu.imit.myPackage.Test;

public class Demo {

    public static void main(String[] args) {
        int n = 100   ;
        Test test = new Test(n);

       System.out.println("x");
        for (int i = 0; i < n+1; i++) {
            if (i == 0 || i == 3) {
                System.out.println(test.getxArray()[i]);
            } else {
                System.out.println(test.getxArray()[i] + "\t\t");
            }
        }
        System.out.println("y");
        for (int i = 0; i < n+1; i++) {
            if (i == 0 || i == 3) {
                System.out.println(test.getyArray()[i]);
            } else {
                System.out.println(test.getyArray()[i]);
            }
        }
        System.out.println("***************************dY*************************");
        for (int i = 0; i < n+1; i++) {
            System.out.println(test.newton.get_d_Y()[i]);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(test.norma());
    }
}
