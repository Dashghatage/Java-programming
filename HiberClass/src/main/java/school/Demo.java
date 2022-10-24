package school;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Demo {
    @Id
    int id;
    String Name;
    String CompanyName;
    String Location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	@Override
	public String toString() {
		return "(id=" + id + ", Name=" + Name + ", CompanyName=" + CompanyName + ", Location=" + Location + ")";
	}
    
}
