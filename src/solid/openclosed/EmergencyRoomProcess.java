package solid.openclosed;

public class EmergencyRoomProcess 
{
	public static void main(String[] args) 
	{
		HospitalManagement erDirector=new HospitalManagement();
		
		Employee peggy=new Nurse(1, "Peggy", "emergency", true);
		erDirector.callUpon(peggy);
		
		Employee donald=new Doctor(2, "Donald", "emergency", true);
		erDirector.callUpon(donald);
	}
}
