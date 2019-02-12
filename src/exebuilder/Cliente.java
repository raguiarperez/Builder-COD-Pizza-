
package exebuilder;

/**
 *
 * @author raguiarperez
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        pizza miPizzaHawaiana;
        miPizzaHawaiana= new pizzaBuilder(300,500)
                             .setGrPinha(100)
                             .createpizza();
        System.out.println(miPizzaHawaiana.toString());


    }
}