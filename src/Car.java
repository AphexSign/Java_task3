//    Создайте простой класс, который будет иметь поля: цвет, название, вес. Создайте метод
//    в классе через который можно будет вывести все эти данные. Добавьте два объекта, установите для них
//    значения и выведите все при помощи ранее созданного метода. Также добавьте несколько конструкторов,
//    которые будут устанавливать:
//    только цвет машины;
//    цвет и вес машины;
//    и пустой конструктор.

public class Car {
    private String color;
    private String title="car";
    private double weight;

    //только цвет машины;
    public Car(String color){
        this.color=color;
    }

    //цвет и вес машины;
    public Car(String color, double weight){
        this.color=color;
        this.weight=weight;
    }
    //Пустой конструктор
    public Car(){
    }

    public void getInfo(){
        System.out.println("Car - Title:"+this.title+" color:"+this.color+" weight:"+this.weight);
    }


}
