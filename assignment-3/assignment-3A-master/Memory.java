public class Memory
{
	private String referenceName;
	private int referenceBit;
	
	public Memory()
	{
		this("",0);
	}
	
	public Memory(String refN , int refB)
	{
		setReferenceName(refN);
		setReferenceBit(refB);
	}
	
	public void setReferenceBit(int refB)
	{
		referenceBit = refB;
	}
	
	public void setReferenceName(String refN )
	{
		referenceName = refN;
	}
	
	public int getReferenceBit()
	{
		return referenceBit;
	}
	
	public String getReferenceName()
	{
		return referenceName;
	}
	
	public String toString()
	{
		return "page Name: "+getReferenceName()+ "Reference Bit: "+getReferenceBit();
	}
}