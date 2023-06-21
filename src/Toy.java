public class Toy {
    public int id;
    public String name;
    public double frequency;

    public Toy(int id, String name, double frequency){
        this.id = id ;
        this.name = name;
        this.frequency = frequency;
    }

    public  int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getFrequency(){
        return frequency;
    }
}
