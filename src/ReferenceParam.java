public class ReferenceParam {
    public static void main(String[] args) {
        Data d=new Data();
        d.x=10;
        System.out.println("x="+d.x);

        change(d);
        System.out.println("x="+d.x);
    }

    private static void change(Data d) {
        d.x=100;
        System.out.println("x="+d.x);
    }
}
