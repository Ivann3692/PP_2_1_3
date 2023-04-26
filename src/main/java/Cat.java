public class Cat {
    private String Name;
    private String Color;
    private int Age;
    private int Weight;

    public Cat(String Name, String Color, int Age, int Weight) {
        this.Name = Name;
        this.Color = Color;
        this.Age = Age;
        this.Weight = Weight;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public void setColor(String Color) {
        this.Color = Color;
    }
    public  void setAge(int Age) {
        this.Age = Age;
    }
    public void setWeight(int Weight) {
        this.Weight = Weight;
    }
    public String getName() {
        return Name;
    }
    public String getColor() {
        return Color;
    }
    public int getAge() {
        return Age;
    }
    public int getWeight() {
        return  Weight;
    }
    @Override
    public String toString() {
        return "Cat{" +
                "Name='" + Name + '\'' +
                ", Color='" + Color + '\'' +
                ", Age=" + Age +
                ", Weight=" + Weight +
                '}';
    }
}
