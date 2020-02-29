public class monoblock extends portablecomputers {
    private int wegiht;

    public monoblock(String VideoCard, String mother,
                     String Procesor, String Ram) {
        super(VideoCard, mother, Procesor, Ram);
    }

    public void setWegiht(int wegiht) {
        this.wegiht = wegiht;
    }
}
