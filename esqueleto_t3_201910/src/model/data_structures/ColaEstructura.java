package model.data_structures;

import java.util.Iterator;

public class ColaEstructura  <T> implements IQueue<T>
{

	// Nodo anterior 
	Node<T> nodoAnterior;

	// Nodo siguiente
	Node <T> nodoSiguiente;

	// Primer nodo
	Node<T> primero;

	// �ltimo nodo
	Node<T> ultimo;

	private int tama�o;



	public ColaEstructura() 
	{
		// TODO Auto-generated constructor stub
		tama�o = 0;
		primero = null;
		ultimo = null;
	}

	@Override
	public Iterator <T> iterator() 
	{
		// TODO Auto-generated method stub
		Iterator <T> i = null;

		Node<T> act = primero;

		while (act != null){
			act = (Node<T>) primero.darSiguiente();
			i = (  (Iterator<T>) act );
		}
		return i;
	}

	@Override
	public boolean isEmpty() 
	{
		// TODO Auto-generated method stub
		return primero == null;
	}


	public int size() 
	{
		return tama�o;
	}



	public void enqueue(T t)
	{
		if(primero == null)
		{
			primero = new Node<T>(t);
			ultimo = primero;

		}
		else
		{
			ultimo.cambiarSiguiente(new Node<T>(t)); 
			ultimo = ultimo.darSiguiente();
		}
		tama�o++;
	
	}

	public T darUltimo()
	{
		return ultimo.darElemento();
	}


	public T dequeue()
	{
		Node<T> sacada = primero;

		primero = primero.darSiguiente();
		tama�o--;
		return  sacada.darElemento();
	}
}