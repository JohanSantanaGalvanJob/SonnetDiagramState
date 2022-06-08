
package soneto;
public class S4  extends Estado{
    public S4() {
        nombreEstado="S4";
    }
    @Override
    public void a(){
        nombreEstado="S5";
        System.out.println("CUARTETO");
    }
}
