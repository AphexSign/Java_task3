//Создайте класс Дом. Добавьте в него следующие данные:
//        поля: количество этажей, год постройки, наименование;
//        метод для установки всех значений;
//        метод для вывода всех значений;
//        метод, возвращающий количество лет с момента постройки.
//
//        На основе класса создайте два объекта и пропишите для каждого характеристики. Добавление характеристик реализуйте через метод класса.
//
//        Выведите информацию про каждый объект.

public class House {
    private int countFloor;
    private int yearConstr;
    private String title;

    //Метод для установки всех значений;
    public void setInfo(int countFloor,int yearConstr, String title){
        this.countFloor=countFloor;
        this.yearConstr=yearConstr;
        this.title=title;
    }

    //Метод для вывода всех значений;
    public void showInfo(){
        System.out.println("Кол-во этажей:"+this.countFloor+" год постройки: "+this.yearConstr+" название: "+this.title);
    }

    //Метод, возвращающий количество лет с момента постройки.
    public int getYearConstr(){
        return this.yearConstr;
    }

}
