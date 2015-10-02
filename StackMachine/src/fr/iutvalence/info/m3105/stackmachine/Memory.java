package fr.iutvalence.info.m3105.stackmachine;

public class Memory {

	public Memory(int startStack, int endStack) throws InvalidParametersException { //i = startStack et j endstack 
		
		if ((startStack < 0) || (startStack > endStack) || (endStack<0)){
			throw new InvalidParametersException() ;
		}
		
		// TODO Auto-generated constructor stub
	}

	public int getStartAddress() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void write(int currentAddress, int opCode) {
		// TODO Auto-generated method stub
		
	}
	public void read(int address)
	{
		
	}

}
