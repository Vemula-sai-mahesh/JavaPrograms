package kodnest_28_6;

public class teacherApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		teacher t1=new teacher();
		t1.id=143;
		t1.name="Sai Mahesh";
		t1.subject="Java";

		t1.teach();
		t1.motivate();
		t1.giveAssign();
		System.out.println(t1.id);
		System.out.println(t1.name);
		System.out.println(t1.subject);
	}

}
