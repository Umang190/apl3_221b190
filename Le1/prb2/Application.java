public class Application
{
  public static void main(String args[]){
        
       // Mother m=new Mother();
      // m.show();
        
       //Child c1=new Child();
      //c1.show();
        
        Mother m1=new Child();
        m1.show();
        
    }


}
//when mother class show method was static error: overridden method is static
//when child class show method was static error: overriding method is static
//when both mother and child show method are made static then output of Hello World is shown