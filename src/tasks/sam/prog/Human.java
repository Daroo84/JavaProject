package tasks.sam.prog;

public class Human {

    private int age;
    private int weight;
    private int height;
    private String name;
    private String sex;

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getSex(){
        return sex;
    }

    public int getWeight() {
        return weight;
    }
    public boolean isMale(String sex){
        if(sex == "Male"){
            System.out.println(name + "is a man.");
        }
        return true;
    }

    public Human(int age, int weight, int height, String name, String sex){
        setAge(age);
        setHeight(height);
        setWeight(weight);
        setName(name);
        setSex(sex);


    }
    public String toString(){
        return "Age: " + getAge()+"\nWeight: " + getWeight() + "\nHeight: " + getHeight() + "\nName: " + getName() + "\nSex: " + getSex();
    }
}

