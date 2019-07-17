package tightcoupling;

public class A {

    public String name;

    public String getName() {
        if (name != null) {
            return name;

        } else {
            return "not initialized";
        }


    }

    public void setName(String s) {
        if (s == null) {
            System.out.println("you can't initialized name to a null");


        }
    }
}
     class B{
        public static void main(String[]args){
            A ob=new A();
            ob.name=null;
            System.out.println("Name is"+ob.name);
        }
    }

