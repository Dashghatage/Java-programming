package DynamicInput;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
   @Id
   String Usn;
   String Name;
   Long Phonenumber;
   String Address;
public String getUsn() {
	return Usn;
}
public void setUsn(String usn) {
	this.Usn = usn;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	this.Name = name;
}
public Long getPhonenumber() {
	return Phonenumber;
}
public void setPhonenumber(Long phonenumber) {
	this.Phonenumber = phonenumber;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	this.Address = address;
}
@Override
public String toString() {
	return "(Usn=" + Usn + ", Name=" + Name + ", Phonenumber=" + Phonenumber + ", Address=" + Address + ")";
}
}
