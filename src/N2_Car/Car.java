//    Создайте простой класс, который будет иметь поля: цвет, название, вес. Создайте метод
//    в классе через который можно будет вывести все эти данные. Добавьте два объекта, установите для них
//    значения и выведите все при помощи ранее созданного метода. Также добавьте несколько конструкторов,
//    которые будут устанавливать:
//    только цвет машины;
//    цвет и вес машины;
//    и пустой конструктор.

package N2_Car;

public class Car {
    private Color color;
    private String title="car";
    private Double weight;
    private static Integer count=0;

    //только цвет машины;
    public Car(Color color){
        count++;
        this.color=color;
        this.title+=count;

    }

    //цвет и вес машины;
    public Car(Color color, Double weight){
        count++;
        this.color=color;
        this.weight=weight;
        this.title+=count;
    }
    //Пустой конструктор
    public Car(){
        count++;
        this.title+=count;
    }

    public void getInfo(){
        System.out.println("Car.Car - Title:"+this.title+" color:"+this.color+" weight:"+this.weight);
    }


}
