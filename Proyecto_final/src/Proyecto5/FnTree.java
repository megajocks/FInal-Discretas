package Proyecto5;


public class FnTree {

	private int dato; private FnTree left, right;
	
	public FnTree(int dato)
	{
		this.dato = dato;
		this.left = this.right = null;
	}
	
	public int getDato()
	{
		return dato;
	}
	
	public FnTree getLeft()
	{
		return left;
	}
	
	public void setLeft(FnTree left)
	{
		this.left = left;
	}
	
	public FnTree getRight()
	{
		return right;
	}
	
	public void setRight(FnTree right)
	{
		this.right = right;
	}
	
	public void printDato()
	{
		System.out.print(this.getDato() + " - ");
	}

}


class tree
{
	private FnTree raiz;
	
	public tree()
	{
		
	}
	
	public boolean existe(int search)
	{
		return existe(this.raiz, search);
	}
	
	private boolean existe(FnTree n, int search)
	{
		if(n==null)
		{
			return false;
		}
		if(n.getDato() == search)
		{
			return true;
		}
		else if(search < n.getDato())
		{
			return existe(n.getLeft(), search);
		}
		else
		{
			return existe(n.getRight(), search);
		}
	}
	
	public void insert(int dato)
	{
		if(this.raiz==null)
		{
			this.raiz = new FnTree(dato);
		}
		else
		{
			this.insert(this.raiz, dato);
		}
	}
	
	public void insert(FnTree parent, int dato)
	{
		if(dato>parent.getDato())
		{
			if(parent.getRight() == null)
			{
				parent.setRight(new FnTree(dato));
			}
			else
			{
				this.insert(parent.getRight(), dato);
			}
		}
		else
			{
				if(parent.getLeft() == null)
				{
					parent.setLeft(new FnTree(dato));
				}
				else
				{
					this.insert(parent.getLeft(), dato);
				}
			}
		}
	
	
	private void preorden(FnTree n)
	{
		if(n!=null)
		{
			n.printDato();
			preorden(n.getLeft());
			preorden(n.getRight());
			
		}
	}
	
	
	public void inorden(FnTree n)
	{
		if(n!=null)
		{
			inorden(n.getLeft());
			n.printDato();
			inorden(n.getRight());
		}
	}
	
	private void postorden(FnTree n)
	{
		if(n!=null)
		{
			postorden(n.getLeft());
			postorden(n.getRight());
			n.printDato();
		}
	}
	
	public void preorden()
	{
		this.preorden(this.raiz);
	}
	
	public void inorden()
	{
		this.inorden(this.raiz);
	}
	
	public void postorden()
	{
		this.postorden(this.raiz);
	}

}
