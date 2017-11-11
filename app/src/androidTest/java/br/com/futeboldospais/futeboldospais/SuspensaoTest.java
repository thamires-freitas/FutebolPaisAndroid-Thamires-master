package br.com.futeboldospais.futeboldospais;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import br.com.futeboldospais.futeboldospais.model.Suspensao;


/**
 * Created by Thamires on 10/11/2017.
 */

public class SuspensaoTest extends TestCase{

    Suspensao jogador1, jogador2;

     @Before

     public void beforeTest(){

         jogador1 = new Suspensao();
         jogador1.setJogador("Andre");
         jogador1.setEquipe("Master");
         jogador1.setMotivo("Qualquer um");

         jogador2 = new Suspensao();
         jogador2.setJogador("Paulo");
         jogador2.setEquipe("Master");
         jogador2.setMotivo("Qualquer um");
     }

    @Test
    public void testeMotivoSuspensao() {
        assertEquals("Motivo da suspensão","Qualquer um",jogador1.getMotivo());

        // assertEquals("Mensagem de erro no JUnit", resultadoEsperado, metodoASerTestado(argumentos) );
    }
}
