package Sample;
import javax.persistence.*;
@Entity
class Details{
	@Id
	int Id;
	String Name;
	String Address;
	public Details(int id, String name, String address) {
		super();
		Id = id;
		Name = name;
		Address = address;
	} 
}
public class Mainclass {
public static void main(String[] args) {
	EntityManagerFactory p=Persistence.createEntityManagerFactory("dev");
	EntityManager c=p.createEntityManager();
	EntityTransaction t=c.getTransaction();
	Details d=new Details(3, "vikas", "Karnataka");
	t.begin();
	c.persist(d);
	t.commit();
}
}
