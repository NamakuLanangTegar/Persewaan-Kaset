public class DVD extends Product {
    private int length;
    private String rating;
    private String studio;

    public DVD() {
        number = 10;
        name = "DVD Album";
        quantity = 0;
        price = 0.0;
        length = 0;
        rating = "18+";
        studio = "Falling Musical";
    }

    public void DVDprint() {
        System.out.println("");
        System.out.println("CD");
        System.out.println("Number: "+ number);
        System.out.println("Name: " + name);
        System.out.println("Quantity: "+quantity);
        System.out.println("Price: "+price);
        System.out.println("Length: "+length);
        System.out.println("Rating: "+rating);
        System.out.println("Studio: "+studio);
    }
}
