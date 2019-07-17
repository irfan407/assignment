package losecoupling;

public class A {
    private String name;
    public String getName(){
        if(name!=null){
            return name;

        }else {
            return "not initiaized";

        }

    }
    public void setName(String s){
        if(s==null){
            System.out.println("you can't initialized to a null");

        }
    }
}
class B{
    public static void main(String[] args){
        A ob=new A();
        ob.setName(null);
        System.out.println("name is "+ ob.getName());
    }
}