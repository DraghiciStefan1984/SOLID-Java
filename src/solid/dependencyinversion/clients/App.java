package solid.dependencyinversion.clients;

import solid.dependencyinversion.proceses.GeneralManufacturingProcess;
import solid.dependencyinversion.proceses.LaptopManufacturingProcess;
import solid.dependencyinversion.proceses.SmartphoneManufacturingProcess;

public class App 
{
	public static void main(String[] args) 
	{
		GeneralManufacturingProcess smartPhone=new SmartphoneManufacturingProcess("iPhone");
		smartPhone.launchProcess();
		
		System.out.println();
		
		GeneralManufacturingProcess laptop=new LaptopManufacturingProcess("Dell");
		laptop.launchProcess();
	}
}
