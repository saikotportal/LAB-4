public class lab4 {
    public static void main(String[] args) {
    
        Candle candle = new Candle();
        candle.setColor("Red");
        candle.setHeight(4); 

       
        ScentedCandle scented = new ScentedCandle();
        scented.setColor("Lavender");
        scented.setHeight(5); 
        scented.setScent("Vanilla");

        System.out.println("CANDLE");
        System.out.println("Color: " + candle.getColor());
        System.out.println("Height: " + candle.getHeight() + " inches");
        System.out.println("Price: RM" + candle.getPrice());

        System.out.println("\nSCENTED CANDLE");
        System.out.println("Color: " + scented.getColor());
        System.out.println("Height: " + scented.getHeight() + " inches");
        System.out.println("Scent: " + scented.getScent());
        System.out.println("Price: RM" + scented.getPrice());
    }
}

class Candle {
    private String color;
    private int height;
    protected double price;

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(int height) {
        this.height = height;
        this.price = height * 2.0; 
    }
}

class ScentedCandle extends Candle {
    private String scent;

    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        this.price = height * 3.0;
    }
}
