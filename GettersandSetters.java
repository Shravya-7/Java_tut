class GETTERS_AND_SETTERS{
  int a;
  int b;
  public int getA(){
    return a;
  }
  public void setA(int a){
    this.a = a;
  }
  public int getB(){
    return b;
  }
  public void setB(int b){
    this.b = b;
  }
  boolean compare(GETTERS_AND_SETTERS ob){
    return this.a == ob.a;
  }
}

public class GFG{
  public static void main(String args[]){
    GETTERS_AND_SETTERS ob1 = new GETTERS_AND_SETTERS();
    ob1.setA(23);
    GETTERS_AND_SETTERS ob2 = new GETTERS_AND_SETTERS();
    ob1.setA(23);
    GETTERS_AND_SETTERS ob3 = new GETTERS_AND_SETTERS();
    ob1.setA(46);

    System.out.println(ob1.compare(ob2));
    System.out.println(ob2.compare(ob3));
  }
}
    
    
  
