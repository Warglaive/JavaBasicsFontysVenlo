
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {
        if (this.squareMeters > otherApartment.squareMeters) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment otherApartment) {
        //squareMeters * pricePerSquareMeter
        int firstApartmentPrice = this.squareMeters * this.pricePerSquareMeter;
        int secondApartmentPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        int difference = Math.abs(firstApartmentPrice - secondApartmentPrice);
        return difference;
    }

    public boolean moreExpensiveThan(Apartment otherApartment) {
        int firstApartmentPrice = this.squareMeters * this.pricePerSquareMeter;
        int secondApartmentPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        if (firstApartmentPrice > secondApartmentPrice) {
            return true;
        }
        return false;
    }
}
