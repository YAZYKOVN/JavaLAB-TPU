public class portablecomputers extends computer {
    private int Price;


    public portablecomputers(String VideoCard, String mother, String Procesor, String Ram) {
        super(VideoCard, mother, Procesor, Ram);
    }

    public void setPrice(int Price){
        this.Price = Price;
    }

    @Override
    public int getPrice() {
        return Price;
    }
}
