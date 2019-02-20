public class MultiAdd {

    public static double multAdd(double a, double b, double c) {

        return ((a * b) + c);

    }

    public static double expSum(double x) {

        //return x * Math.exp(-x) + Math.sqrt(1 - Math.exp(-x));
        double y = Math.exp(-x);
        double z = Math.sqrt(1 - Math.exp(-x));
        return multAdd(x,y,z);
    }

    public static void main(String[] args) {

        double a = 1;
        double b = 2;
        double c = 3;

        System.out.println(multAdd(a,b,c));

        double d = (Math.cos(Math.PI/4));
        double e = 2;
        double f = Math.sin(Math.PI/4);

        System.out.println(multAdd(d,e,f));

        double g = Math.log(10);
        double h = 1;
        double i = Math.log(20);

        System.out.println(multAdd(g,h,i));

        double j = Math.cos(Math.PI/4);
        double k = 2;
        double l = (Math.log(10) + Math.log(20));

        System.out.println(multAdd(j,k,l));

        double x = 2;
        System.out.println(expSum(x));

    }
}
