package phonebook;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.List;
import java.util.Scanner;

public class Phonebookapplication{
	   
	public static void main(String[]args) {
	Address address1=new Address("114 Market St", "St.Louis", "MO","63403");
    Address address2=new Address("324 Main St", "St.Charles", "MO", "63303");
    Address address3=new Address("574 Pole Ave", "St.Peters", "MO", "63333");   
    Address address4=new Address("263 Eagle Ridge,", "O'fallon", "IL", "62269" );
	Person person1=new Person("John",null, "Doe","6187224404",address1);
	Person person2=new Person("John", "E", "Doe", "6186247390", address2);
	Person person3=new Person("John", "Michael West", "Doe", "6187466141", address3);
	Person person4= new Person("Erin","Marie","Walker","6187777777",address4);
    ArrayList <Person> listings=new ArrayList <Person>();
	
	  listings.add(person1); 
	  listings.add(person2);
	  listings.add(person3);
	  listings.add(person4);
	  
	  
	Scanner entry = new Scanner(System.in); 
	Scanner in = new Scanner(System.in);
	int menu=0;
	while(menu<1) {
	System.out.println("Please choose the following options");
	System.out.println("1.Add an entry.");
	System.out.println("2.Delete an entry.");
	System.out.println("3.Search by first name.");
	System.out.println("4.Search by last name.");
	System.out.println("5.Search by full name.");
	System.out.println("6.Search by telephone number.");
	System.out.println("7.Search by city or state.");
	System.out.println("8.Update a record.");
	System.out.println("9.Show all records.");
	System.out.println("10.Exit.");
	
	int choice=in.nextInt();
	    
	    
	   
	    
		switch (choice) {
		
		
		case   1:  
			String input;
			System.out.println("Add a new person");
			System.out.println("Enter a first name: ");
			input=entry.nextLine();
			String firstname=input;
			System.out.println("Enter a middle name,if no middle name press enter: ");
			input=entry.nextLine();
			String middlename=input;
			System.out.println("Enter a last name");
		    input=entry.nextLine();
			String lastname=input;
			System.out.println("Enter a telephone number");
			input=entry.nextLine();
			String telephone=input;
			System.out.println("Enter an address starting with the street");
			input=entry.nextLine();
			String street= input;
			System.out.println("Enter the city");
			input=entry.nextLine();
			String city=input;
			System.out.println("Enter the state");
			input=entry.nextLine();
			String state=input;
			System.out.println("Enter the zip");
			input=entry.nextLine();
			String zip=input;
			Person p1=new Person(firstname, middlename, lastname, telephone, new Address(street, city, state, zip));
			listings.add(p1);
			System.out.println("Entry has been added.");
			System.out.println();
			
			Collections.sort(listings);
			for (Person x:listings) {
				System.out.println(x);
			}
	
			
			
			break;
		
		
		
		case    2:
			
			  System.out.println("Who would you like to delete from your phonebook?\n");
			  System.out.println("Enter a 10 digit of an entry you would like to delete");
			  input=entry.nextLine();
			  int indexFound=-1;
			  for(Person record:listings) {
				  if(record.getTelephone().equals(input)) {
					  indexFound = listings.indexOf(record);
					  listings.remove(indexFound);
					  System.out.println("Entry has been deleted.");
				for( Person completeEntry:listings)  {
					System.out.println(completeEntry);
				}
				break;
				  }
				 
				  
			  }
			
			
			   
			  break;
			
			
			
			
		case    3:
		
		
		      System.out.println("Search phonebook using a first name.\n");
		      System.out.println("Enter the firstname, then hit enter.");
		      input=entry.nextLine();
		      System.out.println("Your search for "+input+" produced these results.");
		      for(Person firstName:listings) {
		    	 if(firstName.getFirstname().equals(input)) {
		    	 System.out.println(firstName);
		    	    
		    	 } 
		    	  
		      }
		       
		      
		       break;
		    
		    
		    
		    
		case    4:
			
			    System.out.println("Search phonebook using a last name.\n");
			    System.out.println("Enter the lastname,then hit enter.");
			    input=entry.nextLine();
			    System.out.println("Your search for "+input+" produced these results.");
			    for(Person x:listings) {
			    	if(x.getLastname().equals(input)) {
			    	System.out.println(x);
			    }
			    }
			
			   
			    
			    break;
			
			
			
			
		case     5:
			
			
			
			    System.out.println("Search phonebook using full name.\n");
			    System.out.println("Enter the firstname then press enter.\n");
			    input=entry.nextLine();
			    String a=input;
			    System.out.println("Enter the lastname then press enter.\n");
			    input=entry.nextLine();
			     System.out.println("Your search for "+input+" produced these results.");
			     for(Person j:listings)   {
			    	 if(j.getFirstname().equals(a)&& j.getLastname().equals(input)) {
			    		 System.out.println(j);
			    		
			    			 
			    		 
			    	 }
			    	 }
			     
		
		
			    break;
			
		
			
			
		case      6:
			
			 
			    System.out.println(" Search by telephone number.\n");
			    System.out.println("Enter a telephone and then print enter.\n");
			    input=entry.nextLine();
			    System.out.println("Your search " +input+" produced these results");
			    for(Person t:listings) {
			    	if(t.getTelephone().equals(input)) {
			    		System.out.println(t);
			    	}
			    }
			    
			     
			    break;
			
			
			
			
		
		
		 case      7:
		
		
		         System.out.println("Search by city or state.\n");
		         System.out.println("Enter in a city,then press enter.\n");
		         input=entry.nextLine();
		         String c=input;
		         System.out.println("Enter in a state,then press enter.\n");
		         input=entry.nextLine();
		         for(Person g:listings){
		        	 if(g.getAddress().getCity().equals(c)&&g.getAddress().getState().equals(input)) {
		        		 System.out.println(g);
		        	 }
		         }
		       
		         
		         
		         break;
		
		
		
		
		
		case        8:
			
			
			      System.out.println("Update a record.\n");
			      System.out.println("Enter in a number of the listing you would like to update.\n");
			      input=entry.nextLine();
			      int indexFound1=-1;
			      for (Person e:listings) {
			    	  if(e.getTelephone().equals(input)) {
			    		 indexFound1=listings.indexOf(e);
			          
			      }
			           if(indexFound1>-1) {
			        	   System.out.println("We have found your listing.\n");
			        	   System.out.println("Update first name,then press enter.\n");
			        	   input=entry.nextLine();
			        	   String firstName=input;
			        	   System.out.println("Update middle name, if none then press enter.\n");
			        	   input=entry.nextLine();
			        	   String middleName=input;
			        	   System.out.println("Update last name,then press enter.\n");
			        	   input=entry.nextLine();
			        	   String lastName=input;
			        	   System.out.println("Update the 10 digit number in the listing and then hit enter.\n");
			        	   input=entry.nextLine();
			        	   String telephone1=input;
			        	   System.out.println("Update the street name of the address.\n");
			        	   input=entry.nextLine();
			        	   String street1=input;
			        	   System.out.println("Update the city of the address.\n");
			        	   input=entry.nextLine();
			        	   String city1=input;
			        	   System.out.println("Update the state of the address.\n");
			        	   input=entry.nextLine();
			        	   String state1=input;
			        	   System.out.println("Update the zip of the address.\n");
			        	   input=entry.nextLine();
			        	   String zip1=input;
			               Address Address11 = new Address(street1,city1,state1,zip1);
			        	   listings.get(indexFound1).setFirstname(firstName);
			        	   listings.get(indexFound1).setMiddlename(middleName);
			        	   listings.get(indexFound1).setLastname(lastName);
			        	   listings.get(indexFound1).setTelephone(telephone1);
			        	   listings.get(indexFound1).setAddress(Address11);
			        	   System.out.println("Your update has been successful!");
			        	  
			        	   }
			        	   
			        	   		
			        	break;
			           }
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			    	  
			      
			      
			      break;
			      
			      
			      
			      
			      
		case   9:
			          System.out.println("Here are all your listings.");
			          for(Person z:listings) {
			        	  System.out.println(z);
			          }
			      
			      
			      
			      
			      
		     break;
			      
			      
			      
			      
		case          10:
		
			
			        
			
			       System.out.println("Exit.");
			       
			       
			       
			       
			       return;
			      
		
		
		
		      
		
		
		
		
		
		
		
		}
	    
	    
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}		
	
}



