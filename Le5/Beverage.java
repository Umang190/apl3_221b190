abstract class Beverage{
private void pour(int qty)
{
System.out.println("Add "+qty+" ml of beverage");
}
protected abstract void addCondiment();
protected void stir(){}
private void serve(){
System.out.println("Serve through waiter");
}
public final void templateMethod(int qty)
{
pour(qty);
addCondiment();
stir();
serve();
}
}