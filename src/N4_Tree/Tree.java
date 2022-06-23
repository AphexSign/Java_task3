//     Создайте класс Tree. Добавьте в него поля: возраст, живое ли дерево и название дерева. Создайте три конструктора:
//     Конструктор, который устанавливает только возраст и название;
//     Конструктор, который устанавливает все переменные в классе;
//     Конструктор, который ничего не устанавливает, но выводит сообщение «Пустой конструктор без параметров сработал».
//     Создайте три объекта на основе класса и используйте по одному конструктору на каждый.

package N4_Tree;

public class Tree {
    private Integer age;
    private Boolean isAlive;
    private String name;

    //     Конструктор, который устанавливает только возраст и название;
    public Tree(Integer age, String name){
        this.age=age;
        this.name=name;
    }

    //     Конструктор, который устанавливает все переменные в классе;
    public Tree(Integer age, Boolean isAlive, String name){
        this.age=age;
        this.isAlive=isAlive;
        this.name=name;
    }
    //     Конструктор, который ничего не устанавливает, но выводит сообщение «Пустой конструктор без параметров сработал».
    public Tree(){
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public void showInfo(){
        System.out.println("Дерево название:"+this.name+" живое: "+isAlive+" возраст:"+this.age);
    }

}