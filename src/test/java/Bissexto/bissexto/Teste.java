package Bissexto.bissexto;

import org.junit.Assert;
import org.junit.Test;

public class Teste {
    
	@Test
	public void main(){
		
		AnoBissexto ano = new AnoBissexto();
		
		Assert.assertEquals(true, ano.anoBissexto(2000));
		Assert.assertEquals(true, ano.anoBissexto(380));
		Assert.assertEquals(true, ano.anoBissexto(28));
		Assert.assertEquals(false, ano.anoBissexto(2017));
	}
}
