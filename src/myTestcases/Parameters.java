package myTestcases;

import java.util.Random;

public class Parameters {
	
	Random rand = new Random();
	
    String[] firstNames = {"Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace", "Henry", "Ivy", "Jack"};

    String[] lastNames = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Miller", "Davis", "García", "Rodriguez", "Martinez"};

	
	
	String CommonPassword="Asd123!@#$";

	
	int randomIndex = rand.nextInt(10);
	int randomEmailId = rand.nextInt(9999);
	String emailID = firstNames[randomIndex]+lastNames[randomIndex]+randomEmailId+"@"+"gmail.com";
	
}
