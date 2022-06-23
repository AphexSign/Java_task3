//        4. Создайте класс Tree.Tree.
//        Создайте три объекта на основе класса и используйте
//        по одному конструктору на каждый.

package N4_Tree;

public class MainTree {
    public static void main(String[] args) {

        Tree tree1=new Tree(100,"Сосна");
        Tree tree2=new Tree(50,true,"Береза");

        Tree tree3=new Tree();
        tree1.showInfo();
        tree2.showInfo();
    }
}
