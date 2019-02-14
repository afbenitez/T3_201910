package model.data_structures.test;

import junit.framework.TestCase;
import model.data_structures.ColaEstructura;
import org.junit.*;
public class TestQueue extends TestCase{

	ColaEstructura <Integer> cola;

	@Before
	public void setUp()
	{
		cola= new ColaEstructura<Integer>();
		cola.enqueue(11);
		cola.enqueue(12);
		cola.enqueue(13);
	}

	public void testEnqueue()
	{
		assertEquals("No es el elemento esperado", 13, cola.darUltimo().intValue());
	}

	
	public void testDequeue()
	{
		assertEquals("No se elimin� el primero",11,cola.dequeue().intValue());
	}

	public void testSizeQ() throws Exception
	{
		assertEquals("El tama�o no es el esperado",3,cola.size());
	}

	public void testEmpty()
	{
		cola.dequeue();
		cola.dequeue();
		cola.dequeue();
		assertTrue("No retorna si la cola est� vac�a", cola.isEmpty());
	}
}
