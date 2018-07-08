package solid.openclosed;

public class Doctor extends Employee 
{
	public Doctor(int id, String name, String department, boolean working)
	{
        super(id, name, department, working);
        System.out.println("Doctor in action...");
    }
	
	private void prescribeMedicine()
	{
		System.out.println("Prescribing medicine.");
	}
	
	private void diagnosePatient()
	{
		System.out.println("Diagnosing.");
	}

	@Override
	public void performDuties() 
	{
		// TODO Auto-generated method stub
		prescribeMedicine();
		diagnosePatient();
	}
}
