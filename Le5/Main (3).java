class Main{
public static void main(String[] args){
Beverage b=new Whiskey();
b.templateMethod(100);
b=new Beer();
b.templateMethod(400);
b=new Rum();
b.templateMethod(900);
}
}