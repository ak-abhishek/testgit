import java.io.*;
import java.util.*;
import java.math.*;
class program{
	int id;
	program(int i){
		id=i;
	}
}
class project{
	int id;
	program p;
	project(int i, program s){
		id=i;
		p=s;
	}
	
}
class Ex extends Exception{
	Ex(String message){super(message);}
}
public class code {
	
	public static void main(String args[]) throws Ex{
		List<program> pl= new ArrayList<>();
		List<project> l=new ArrayList<>();
		//Creating program List with unique id
		int count =0;
		for(int i=0;;i++) {
			//return;
			int router=0;
			Random r = new Random();
			int x= r.nextInt((5 - 0) + 1) + 0;
			//System.out.println(" "+x);
			for(int j=0;j<count; j++){
				program w= pl.get(j);
				//System.out.print(" "+w.id);
				if(w.id==x)
					{
					//System.out.println("  No object created");
					router=1;
					continue;
					}
			}
			if(router ==0) {
			program p=new program(x);
			//System.out.println("  Object created");
			pl.add(p);
			
			//	
			count++;}
			if(count==5)
				break;
		}
		for(int i=0;i<4;i++)
			System.out.print(pl.get(i).id+" ");
		int c=0;
		
		
		//Creating Project
		for(int i=0;;i++) {
			Random r = new Random();
			int x= r.nextInt((50 - 0) + 1) + 0;
			program pTemp;
			int flag=0;
			Iterator j = pl.iterator();
			while(j.hasNext()) {
				pTemp=(program)j.next();
				//System.out.println(pTemp.id);
				if(x==pTemp.id){
					int m= r.nextInt((50 - 5) + 1) + 5;
					project p=new project(m,pTemp); 
					l.add(p);
					//System.out.println("Project Created"+p.id );
					flag=1;c++;
					break;
					
				}
			
			//if(flag==0)
				//System.out.println("Project not created this time");
			}
			if(c==50)
				break;
			
		}
		
		System.out.println(c+"  Enter the program id to search for associated id");
		
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("This is the list of associated projects");
		
		HashMap<Integer, List<project>> m=new HashMap<Integer, List<project>>();
		for(int i=0; i<5; i++) {
			if(a==pl.get(i).id) {
				List<project> ll=new ArrayList<>();
				
			for(int j=0; j<50; j++) {
				if(a==l.get(j).p.id) {
					ll.add(l.get(j));
					System.out.println(a+" ->" +l.get(j).id);
				}
				
				m.put(a, ll);
					
				}
			}
		}
	System.out.println(m);
		
		
		
	}

}
