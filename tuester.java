public class tuester {
    public static void main(String[] args) {
        
        Product[] produk = new Product[10];
        CD[] c = new CD[5];
        DVD[] d = new DVD[5];
        produk[0] = new Product();
        produk[0].print();
        c[4] = new CD(1, "Friend", 12, 200, "Bruno Mars", 10,"Sony Music");
        c[4].print();
        produk[1] = new Product(1, "Table", 2, 20.5);
        produk[1].print();
        d[4] = new DVD(0, "produk 0", 1, 200, 18, "18+", "Falling studio");
        d[4].print();

    }
}
