package many_many_xml_bi;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t1=new Teacher();
		t1.setTsub("SciTea");
		
		Teacher t2=new Teacher();
		t2.setTsub("MathsTe");
		
		Teacher t3=new Teacher();
		t3.setTsub("EngTea");
		
		ArrayList<Teacher> t=new ArrayList<Teacher>();
		t.add(t1);
		
		School s1=new School();
		s1.setSchName("SSHS");
		s1.setTeacher(t);
		
		
		
	}

}
