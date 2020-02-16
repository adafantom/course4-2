package omsu.imit.myPackage;


public class Test {

    private int n, m;
    private double[] arr_X;
    private double[] arr_Y;
    private double[] array_Res;

    Newton_method newton;

    public Test(int n) {
        this.n = n;
        set_arr_X(n+1);
        set_arr_Y(n+1);
        m = 3*n;
        set_arr_Res(m);
        newton = new Newton_method(n, arr_X, arr_Y);
    }

    public double function(double x) {
        //return 1;
        return x+1;
        //return 1/(25*x*x+1);
        //return Math.sin(x);
    }

    public void set_arr_X(int n) {
        arr_X = new double[n];
        for (int i = 0; i < n; i++) {
            arr_X[i] = (1. / (n-1)) * i;
        }
    }

    public void set_arr_Y(int n) {
        arr_Y = new double[n];
        for (int i = 0; i < n; i++) {
            arr_Y[i] = function(arr_X[i]);
        }
    }

    public double[] getxArray() {
        return arr_X;
    }

    public double[] getyArray() {
        return arr_Y;
    }

    private void set_arr_Res(int m) {
        array_Res = new double[m];
        for (int i = 0; i < m; i++) {
            array_Res[i] = (1. / m) * i;
        }
    }

    public double norma() {
        double max_elem = 0;
        for (int i = 0; i < m; i++) {
            if (Math.abs(function(array_Res[i]) - newton.Polynom(array_Res[i])) > max_elem) {
                max_elem = Math.abs(function(i) - newton.Polynom(i));
            }
        }
        return max_elem;
    }

}