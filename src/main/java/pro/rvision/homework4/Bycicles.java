package pro.rvision.homework4;

public class Bycicles {
    String company;
    byte weight;
    int speed;
    String name;
    String color;

    public void sayCompany(){
        System.out.println(company);

    }
    public void sayName(){
        System.out.println(name);

    }
    public void sayColor() {
        System.out.println(color);

    }

    public void sayAllInfo(){
        System.out.println(company +" "+ name +" "+ weight +"кг"+" "+ speed +"км/ч"+" "+ color);

    }

}
