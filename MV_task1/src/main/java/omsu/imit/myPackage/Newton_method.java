package omsu.imit.myPackage;
public class Newton_method {
    private int n;
    private double h;
    private double[] d_Y;
    private double x_0;

    public double[] get_d_Y() {
        return d_Y;
    }
    public Newton_method(int n, double [] arr_X, double []arr_Y ) {
        this.n = n;
        h = 1. / n;
        x_0 = arr_X[0];
        d_Y = new double[n + 1];
        for (int i = 0; i < n+1; i++) { d_Y[i] = arr_Y[i];}

        for (int j = 1; j < n; j++) {
            double next = d_Y[j+1];
            for (int i =  j; i < n+1; i++) {
                double prev = d_Y[i];
                d_Y[i] = next - prev;
                next = prev;
            }
        }
    }
    public double Polynom(double x) {
        double q = (x - x_0) / h;
        double y_0 = 0;
        double temp = 1.;
        for (int j = 0; j < n + 1; j++) {
            y_0+= temp * d_Y[j];
             temp *= (q - j) / (j + 1);
        }
        return y_0;
    }
}
