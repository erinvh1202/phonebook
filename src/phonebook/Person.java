package phonebook;


public class Person implements Comparable<Person>{

private String firstname;
private String middlename;
private String lastname;
private String telephone;
private Address address;


public Person(String firstname,String middlename,String lastname,String telephone,Address address) {
	this.firstname=firstname;
	this.middlename=middlename;
	this.lastname=lastname;
	this.telephone=telephone;
	this.address=address;
	

}



public String getFirstname() {
	   return this.firstname;
	   
}
 
	   public void setFirstname(String firstname) {
		   this.firstname=firstname;
	   }


        public String getMiddlename(String middlename) {
	         return this.middlename;
}  

public void setMiddlename(String middlename)  {
	    this.middlename=middlename;
}


public String getLastname() {
	   return this.lastname;
	   
}

public void setLastname(String lastname) {
	this.lastname=lastname;
}

public String getTelephone() {
	return this.telephone;
}

public void setTelephone(String telephone) {
	this.telephone=telephone;
}

public Address getAddress() {
	return this.address;
}

public void setAddress(Address address) {
	this.address=address;
}
@Override
public String toString() {
	return firstname+" "+middlename+" "+lastname+" "+address+" "+telephone+" ";
}



@Override
public int compareTo(Person arg0) {
	// TODO Auto-generated method stub
	return lastname.compareTo(arg0.getLastname());
}
}
