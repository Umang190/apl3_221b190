public class Le0
{  String name;
   int age;
 
   void setName(String name)
   {
       this.name=name;
   }
   String getName(){
       return this.name;
   }
   void setAge(int age)
   {
       this.age=age;
   }
   int getAge(){
       return this.age;
   }
	public static void main(String[] args) {
		Le0 m1=new Le0();
		m1.setName("Umang");
		m1.setAge(20);
		System.out.println(m1.getName()+"  "+m1.getAge());
		
		
	}
}
