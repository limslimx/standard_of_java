package ch6;

class ProductTest {

    static int staticCount;
    int notstaticCount;

    {
        staticCount += 1;
        notstaticCount = staticCount;
    }

    public static void main(String[] args) {
        ProductTest productTest1 = new ProductTest();
        ProductTest productTest2 = new ProductTest();
        ProductTest productTest3 = new ProductTest();

        System.out.println(productTest1.notstaticCount);
        System.out.println(productTest2.notstaticCount);
        System.out.println(productTest3.notstaticCount);
    }
}
