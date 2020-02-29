public abstract class computer {
    public String mother;
    public String Procesor;
    public String Ram;
    public String VideoCard;

    public computer( String VideoCard, String mother,String Procesor, String Ram) {
        this.VideoCard = VideoCard;
        this.mother = mother;
        this.Procesor = Procesor;
        this.Ram = Ram;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public void setProcesor(String procesor) {
        this.Procesor = procesor;
    }

    public void setRam(String ram) {
        this.Ram = ram;
    }
    public void setVideoCard(String videoCard){
        this.VideoCard = videoCard;
    }
    public abstract int getPrice();
}
