public class CD extends Product {
    private String artist;
    private int totalSong;
    private String label;

    public CD() {
            
        number = 10;
        name = "CD Album";
        quantity = 400;
        price = 50000.0;
        artist = "Hyo";
        totalSong = 17;
        label = "Sony Music";
    }

    public void CDprint() {
        System.out.println("");
        System.out.println("CD");
        System.out.println("Number: "+ number);
        System.out.println("Name: " + name);
        System.out.println("Quantity: "+quantity);
        System.out.println("Price: "+price);
        System.out.println("Artist: "+artist);
        System.out.println("Total Song: "+totalSong);
        System.out.println("Label: "+label);
    }
}
