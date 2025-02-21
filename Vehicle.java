public class Vehicle{
	public static void main(String args[]){
		int age =20;
		if(age<=18){
			System.out.println("The person is eligible to ride only bicycle");
		}
		else if (age>=18 && age<=40) {
			System.out.println("The person is eligible to ride Scooter");
		}
		else{
			System.out.println("The person is eligible to ride car");
		}
}
}