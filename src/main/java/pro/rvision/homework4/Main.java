package pro.rvision.homework4;

public class Main {
    public static void main(String[] args){

        Bycicles bycicles = new Bycicles();
        bycicles.name = "Faster";
        bycicles.color = "Красный";
        bycicles.company = "Stels";
        bycicles.speed = 20;
        bycicles.weight = 10;

        bycicles.sayName();
        bycicles.sayAllInfo();
        bycicles.sayCompany();
        bycicles.sayColor();

        System.out.println();

        House house = new House();
        house.area = 200;
        house.numberHouse = 1;
        house.city = "San-Remo";
        house.cost = 1000000;
        house.street = "South.St";

        house.sayAdress();
        house.sayArea();
        house.sayCost();
    }
}
