package AnimalRescue.objects;

public abstract class AnimalObj {
    private String breed ;
    private String name;
    private int age;
    private String color;
    private float weight;
    private int heightInCm;
    private int happines;

    public abstract void speack();

    public int getHappines() {
        return happines;
    }

    public void setHappines(int happines) {
        this.happines = happines;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    public void setHeightInCm(int heightInCm) {
        this.heightInCm = heightInCm;
    }



    public abstract void eat(int value);

    public void play(int value){
        happines+=value;
    }




}
