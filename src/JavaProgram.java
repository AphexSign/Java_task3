public class JavaProgram {
    public static void main(String[] args) {
        //1. Класс Study
        Study study=new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());
        System.out.println("\n");

        //2. Класс Car
        Car car=new Car();
        car.getInfo();
        //Только цвет
        Car car1=new Car(Color.GREEN);
        car1.getInfo();
        //Цвет и вес
        Car car2=new Car(Color.RED,200.0);
        car2.getInfo();
        System.out.println("\n");

        //3. Класс House
        House house1=new House();
        House house2=new House();
        house1.setInfo(16,2010,"ЖК Мечта");
        house2.setInfo(9,2015,"ЖК Якорь");
        //Вывод всех аттрибутов на экран
        house1.showInfo();
        house2.showInfo();
        //Вывод года постройки первого дома на экран
        System.out.println(house1.getYearConstr());
        System.out.println("\n");

        //     Конструктор, который устанавливает только возраст и название;
//     Конструктор, который устанавливает все переменные в классе;
//     Конструктор, который ничего не устанавливает, но выводит сообщение «Пустой конструктор без параметров сработал».
//     Создайте три объекта на основе класса и используйте по одному конструктору на каждый.
        //4. Класс Tree
        Tree tree1=new Tree(100,"Сосна");
        Tree tree2=new Tree(50,true,"Береза");
        Tree tree3=new Tree();

        tree1.showInfo();
        tree2.showInfo();
    }
}
