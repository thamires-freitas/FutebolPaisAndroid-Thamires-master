package br.com.futeboldospais.futeboldospais;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import br.com.futeboldospais.futeboldospais.model.Cartao;

/**
 * Created by Thamires on 10/11/2017.
 */
public class CartaoTest extends TestCase {

    // Primeiro você vai declarar todos os seus objetos de teste.
    Cartao c;

    // No método before, você precisa preencher os seus objetos de teste
    @Before
    public void beforeTest(){
        c = new Cartao();
        c.setNumero(25);
    }

    // Nos métodos de teste, coloque apenas os asserts.
    // Lembre-se de que o seu dado de teste deve permitir "adivinhar" qual o dado que o método
    // deve retornar.
    // assertEquals("Mensagem de erro no JUnit", resultadoEsperado, metodoASerTestado(argumentos) );

    /* @Test
    public void testJogadoresCom3CartoesAmarelosNaoPodemJogar {
        assert
    } */
}
