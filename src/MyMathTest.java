class MyMath{
    long a,b;

    long add(){return a+b;}
    long substract(){return a-b;}
    long multiply(){return a*b;}
    double divide(){return a/b;}

    static long add(long a, long b){
        return a+b;
    }
    static long substract(long a, long b){
        return a-b;
    }
    static long multiply(long a, long b){
        return a*b;
    }
    static double divide(double a, double b){
        return a/b;
    }
}

class MyMathTest {
    public static void main(String[] args) {
        System.out.println(MyMath.add(4,2));
        System.out.println(MyMath.substract(4,2));
        System.out.println(MyMath.multiply(4,2));
        System.out.println(MyMath.divide(4,2));

        MyMath myMath=new MyMath();
        myMath.a=4;
        myMath.b=2;

        System.out.println(myMath.add());
        System.out.println(myMath.substract());
        System.out.println(myMath.multiply());
        System.out.println(myMath.divide());
    }
}

