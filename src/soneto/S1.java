
package soneto;

public class S1 extends Estado {
    public S1() {
        nombreEstado="S1";
    }
    @Override
    public void a(){
        nombreEstado="S2";
    }
}
