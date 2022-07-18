package app;

import java.util.Date;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		Appareil appareil=new Appareil();
		appareil.enregistrer(new Contact(1,"C1","06612345"));
		appareil.enregistrer(new Contact(2,"C2","06612547"));
		appareil.enregistrer(new AppelEmi(1,new Date(),66),"06612547");

		appareil.enregistrer(new AppelEmi(2,new Date(),125),"06612345");
		appareil.enregistrer(new AppelEmi(3,new Date(),73),"06612345");
		appareil.enregistrer(new AppelRecu(4,new Date(),89),"06612547");
        System.out.println("----------------------");
        System.out.println("Consulter un contact sachant son numero");
		
		try {
		Contact c=appareil.consulter(1);
		System.out.println("Num="+c.getNumero());
		System.out.println("Nom="+c.getNom());
		System.out.println("Tel="+c.getNumeroTel());
			} catch (Exception e) {
				System.out.println(e.getMessage());		

			}
		System.out.println("----------------------");
        System.out.println("Consulter les contacts par mot clé");
        List<Contact> contacts=appareil.consulter("C");
        for (Contact c:contacts) {
        	System.out.println("---------------");
        	System.out.println("Nom :"+c.getNom());

        	System.out.println("Tel :"+c.getNumeroTel());
        	
        	
        }
		
	}
}
