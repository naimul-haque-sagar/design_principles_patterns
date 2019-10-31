
interface Discount {
    void acceptDiscount(HotelOffersDiscount hotelDiscount);
}

class ForYoung implements Discount {

    @Override
    public void acceptDiscount(HotelOffersDiscount hotelDiscount) {
        hotelDiscount.discountOffer(this);
    }

    String getDescription() {
        return "Young";
    }
}

class ForAdult implements Discount {

    @Override
    public void acceptDiscount(HotelOffersDiscount hotelDiscount) {
        hotelDiscount.discountOffer(this);
    }

    String getDescription() {
        return "Adult";
    }
}

class ForOld implements Discount {

    @Override
    public void acceptDiscount(HotelOffersDiscount hotelDiscount) {
        hotelDiscount.discountOffer(this);
    }

    String getDescription() {
        return "Old";
    }
}

interface HotelOffersDiscount {

    void discountOffer(ForYoung young);

    void discountOffer(ForAdult adult);

    void discountOffer(ForOld old);
}

class FiveStarHotel implements HotelOffersDiscount {

    @Override
    public void discountOffer(ForYoung young) {
        System.out.println("We have 20% off for" + young.getDescription());
    }

    @Override
    public void discountOffer(ForAdult adult) {
        System.out.println("We have 30% off for" + adult.getDescription());
    }

    @Override
    public void discountOffer(ForOld old) {
        System.out.println("We have 40% off for" + old.getDescription());
    }
}

class SevenStarHotel implements HotelOffersDiscount {

    @Override
    public void discountOffer(ForYoung young) {
        System.out.println("We have 5% off for" + young.getDescription());
    }

    @Override
    public void discountOffer(ForAdult adult) {
        System.out.println("We have 10% off for" + adult.getDescription());
    }

    @Override
    public void discountOffer(ForOld old) {
        System.out.println("We have 20% off for" + old.getDescription());
    }
}


public class VisitorPattern {

    public static void main(String[] args) {
        FiveStarHotel fiveStar=new FiveStarHotel();
        SevenStarHotel sevenStar=new SevenStarHotel();
        
        Discount hotelDiscount=new ForYoung();
        Discount hotelDiscount1=new ForAdult();
        Discount hotelDiscount2=new ForOld();
        
        hotelDiscount.acceptDiscount(sevenStar);
        hotelDiscount.acceptDiscount(fiveStar);
        
        hotelDiscount1.acceptDiscount(sevenStar);
        hotelDiscount1.acceptDiscount(fiveStar);
        
        hotelDiscount2.acceptDiscount(sevenStar);
        hotelDiscount2.acceptDiscount(fiveStar);
        
    }
}