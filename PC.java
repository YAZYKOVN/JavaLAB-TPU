public class PC extends computer {
    private String body;
    private int bodyPrice;
    private int VideoCardPrice;
    private int motherPrice;
    private int ProcesorPrice;
    private int RamPrice;



    public PC(String VideoCard, String mother,
              String Procesor, String Ram) {
        super(VideoCard,mother,Procesor, Ram);

    }
    public void setBody(String body){
        this.body = body;
    }
    public void setBodyPrice(int bodyPrice){
        this.bodyPrice = bodyPrice;
    }


    public void setMotherPrice(int motherPrice) {
        this.motherPrice = motherPrice;
    }

    public void setProcesorPrice(int procesorPrice) {
        ProcesorPrice = procesorPrice;
    }

    public void setRamPrice(int ramPrice) {
        RamPrice = ramPrice;
    }

    public void setVideoCardPrice(int videoCardPrice) {
        VideoCardPrice = videoCardPrice;
    }
    public void getInfo(){
        System.out.println(body);
        System.out.println(mother);
        System.out.println(Procesor);
        System.out.println(Ram);
        System.out.println(VideoCard);
    }

    @Override
    public int getPrice() {
        return bodyPrice + motherPrice + ProcesorPrice + RamPrice + VideoCardPrice;
    }
}
