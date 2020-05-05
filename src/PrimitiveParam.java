public class PrimitiveParam {
    public static void main(String[] args) {
        Data d=new Data();
        d.x=10;
        System.out.println("x="+d.x);

        change(d.x);
        System.out.println("x="+d.x);
    }

    private static void change(int x) {
        x=100;
        System.out.println("x="+x);
    }
}
