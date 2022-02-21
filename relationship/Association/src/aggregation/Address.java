package aggregation;

public class Address {
   private String street,state,country;
   private long zip;
 Address(String street, String state, String country, long zip) {
	super();
	this.street = street;
	this.state = state;
	this.country = country;
	this.zip = zip;
}
@Override
public String toString() {
	return "Address [street=" + street + ", state=" + state + ", country=" + country + ", zip=" + zip + "]";
}
   
}
