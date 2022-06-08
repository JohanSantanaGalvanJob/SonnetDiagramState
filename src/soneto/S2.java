
package soneto;
public class S2 extends Estado {
    public S2() {
        nombreEstado="S2";
    }
    @Override
    public void b(){
        nombreEstado="S3";
    }
}
