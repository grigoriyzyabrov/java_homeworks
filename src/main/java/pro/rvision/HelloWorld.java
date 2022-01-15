package pro.rvision;
//    названия классов всегда с большо буквы и КэмелКейс
public class HelloWorld {//    public - модификатор доступа, class - класс
//    типы данных , aBoolean = поле класса (переменная в классе)
//    = это оператор присвоения. == это равно
    boolean aBoolean = false;
    char aChar = '@';//    тип символ
    byte aByte = 1;// 128 самое маленькое число byte
    short aShort = 1; //32000
    int anInt = 1;// обычное целое число Int
    long aLong = 1L;// самое большое число long
    float aFloat = 1.0F;// числа с плавающей точкой (не использовать в мат.операциях!)
    double aDouble = 1.0D;

    static class Human {//самописный тип данных(класс)
        //любой класс может хранить данные о своём названии и поведении
        int age = 0;//(0)поле класса хранит данные
        String name = "unnamed human";//null
        public void sayName(){//метод внутри класса(поведение)
            System.out.println(name);
        }
    }



    public static void main(String[] arg){//  main = название метода, всегда с маленькой буквы
//  модификатор доступа static -> возвращаемое значение -> имя ->(аргументы)
//  метод находится в {} - единица кода
//  void = результат работы метода


        String message = "HelloWorld!";//        message = локальная переменная
        Human dima = new Human();//переменная типа класса
        dima.name = "Дима";
        dima.age = 32;
        System.out.println(message);
        System.out.println(dima.age);
        dima.sayName();
    }
}
