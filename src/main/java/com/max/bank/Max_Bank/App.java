package com.max.bank.Max_Bank;

import java.util.Date;
import java.util.Scanner;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.max.bank.entities.Client;
import com.max.bank.entities.DbConnexion;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int n = 0;
    	
    	
    	String prenom;
    	
        System.out.println( "Bienvenue sur la plateforme Max Bank\nChoisissez une opération\n\n"
        		+ "1. Enregistrer un client\n"
        		+ "2. Afficher la Liste des Client " );
        
        Scanner Clavier = new Scanner(System.in);
        n = Clavier.nextInt();
        
        if ( n == 1 ) {
        	
        	Client cl = new Client();
        	
        	System.out.println("Enregistrement d'un Client\n\n"
					+ "Entrer votre nom:");
					Scanner name = new Scanner(System.in);
					cl.setNom(name.nextLine());
					
					System.out.println("Entrer votre prénom:");
					Scanner lastname = new Scanner(System.in);
					cl.setPrenom(lastname.nextLine());
					
					//2 Choix: récupérer date mois année  avec des scannner séparer ou utiliser la librairie joda
				//	System.out.println("Entrer la date de naissance:");
					/*DateTimeFormatter f=DateTimeFormat.forPattern("dd/mm/yyyy");
					DateTime d = f.parseDateTime((new Date()).toString());
					
					DateTime dt = new DateTime();
					cl.setDateNaissance(dt);
					System.out.println(cl);*/
					
					DbConnexion connect = new DbConnexion();
					connect.insertClient(cl);
					

        } else if ( n == 2 ) {
        	
        	Client cl2 = new Client();
        	
        	System.out.println("Liste des Clients MaxBank");
        	
        	System.out.println((new DbConnexion().getClient(2)));
        	
        } else {
        	System.out.println("Choix Indisponible");
        }
    }
}
