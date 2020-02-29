public class notebook extends portablecomputers {
    private String diagonal;
    private int JobTime;
    public notebook(String VideoCard, String mother,
                    String Proccesor, String Ram,int Price,String diagonal,int JobTime) {
        super(VideoCard, mother, Proccesor, Ram);
    }

    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }
    public void setJobTime(int jobTime){
        this.JobTime = jobTime;
    }
}
