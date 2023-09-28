package week5;

public class Ex87 {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Ex87(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    public boolean larger(Ex87 otherApartment){
        return this.squareMeters > otherApartment.squareMeters;
    };
    public int priceDifference(Ex87 otherApartment){
        return Math.abs(otherApartment.squareMeters*otherApartment.pricePerSquareMeter-this.squareMeters*this.pricePerSquareMeter);
    };
    public boolean moreExpensiveThan(Ex87 otherApartment){
      return this.squareMeters*this.pricePerSquareMeter>otherApartment.squareMeters*otherApartment.pricePerSquareMeter;
    };
    public static void main(String[] args) {
        Ex87 a1=new Ex87(2,60,3000);
        Ex87 a2=new Ex87(3,72,3200);

        System.out.println( a1.larger(a2) );
        System.out.println( a2.larger(a1) );

        System.out.println( a1.priceDifference(a2) );
        System.out.println( a2.priceDifference(a1) );

        System.out.println(a1.moreExpensiveThan(a2));
        System.out.println(a2.moreExpensiveThan(a1));
    }
}
