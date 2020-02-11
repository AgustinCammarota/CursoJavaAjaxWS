package dominio;

import javax.ejb.Stateless;
import javax.jws.WebService;

//Indicamos que es un ejb
@Stateless
//Indicamos que es un web Service y que se implementa de la interfaz
@WebService(endpointInterface = "beans.SumarDaoService")
public class SumarServiceImpl implements SumarDaoService {
// prueba
    public int sumar(int a, int b) {
        return a + b;
    }
}
