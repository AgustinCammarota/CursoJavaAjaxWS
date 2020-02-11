package dominio;

import javax.jws.WebMethod;
import javax.jws.WebService;


//Declaro que es un web service
@WebService
public interface SumarDaoService {
    //Indicamos que es un metodo
    @WebMethod
    int sumar(int a, int b);
}
