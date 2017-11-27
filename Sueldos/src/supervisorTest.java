import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class supervisorTest extends TestCase {
	@Before 
	public void before()
	{
		System.out.println("hola mundo");
	}
@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
	}
@Test
	public void testCalcularSueldoBruto() {
	supervisor ven= new supervisor("juan", "Acosta", 1800, 100, 200, 100000,20);
	double total=ven.calcularSueldoBruto();
	assertEquals(total, 38.0);
	}




//	public void testCalcularSalarioNeto() {
//		fail("Not yet implemented");
//	}

}
