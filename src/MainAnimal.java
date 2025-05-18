import br.com.pedro.animal.Cachorro;
import br.com.pedro.animal.Gato;

public class MainAnimal {
    public static void main(String[] args) {
        Cachorro bilu = new Cachorro();
        bilu.emitirSom();
        bilu.abanorORabo();

        Gato mingau = new Gato();
        mingau.emitirSom();
        mingau.arranharMoveis();
    }
}
