package Contact;

import java.util.ArrayList;
import java.util.List;

public class Repertory {
	
	private List<Person> PersonList= new ArrayList<Person>();
	
	public void Contact(Person p) {
		PersonList.add(p);
	}

    
	public void PersoList() {
        for(int i=0;i<PersonList.size();i++) {
            System.out.println(this.PersonList.get(i).toString());
        }
    }
}