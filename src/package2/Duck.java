package package2;

public class Duck {
	
	
	private int size = 100;
	
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}


	public void display()
	{
	if (size<0)
	{
		System.out.println("incorrect size");
	}
	else if(size>10)
	{
	System.out.println("bigger duck!!!");
	}
	else {
		System.out.println(size);
		System.out.println("smaller duck!!");
	}
	}
	}
	
