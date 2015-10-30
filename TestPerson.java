

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		Person p2 = new Person();
				
		p1.setName("James");
		p1.setAge(25);
		p2.setName("Will");
		p2.setAge(39);
		
		System.out.println("Name of person1: "+ p1.getName());
		System.out.println("age of person1: "+ p1.getAge());
		System.out.println("Name of person2: "+ p2.getName());
		System.out.println("age of person2: "+ p2.getAge());
		System.out.println("Is both persons ages the same? : "+ p1.equalname(p2));
		System.out.println("Is both persons names the same? : "+ p1.equalage(p2));
		System.out.println("Is person1 older than person2? : "+ p1.older(p2));
		System.out.println("Is person1 younger than person2? : "+ p1.younger(p2));
		
		if((p1.equalname(p2)) == true && (p1.equalage(p2) == true)){
			System.out.println("Both persons details are the same");
		}
		else{
			System.out.println("Both persons details are NOT the same");
		}
		
	}

}
