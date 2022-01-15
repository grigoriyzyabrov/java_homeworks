package pro.rvision.homework4;

public class House {
    String street;
    int numberHouse;
    int area;
    int cost;
    String city;

    public void sayAdress(){
        System.out.println(city +"/"+ street + "/" + numberHouse);
    }
    public void sayCost(){
        System.out.println(cost + "$");
    }
    public void sayArea(){
        System.out.println(area);
    }
}
