public class ClassB

{

    private int data;

  

    public ClassB()

    {

        data = 5;

    }

  

    public int getData()

    {

        return this.data;

    }

}

  

class A extends ClassB

{

    private int data;

    public A()

    {

        data = 6;

    }

    private int getData()

    {

        return data;

    }

  

    public static void main(String[] args)

    {

        A myData = new A();

        System.out.println(myData.getData());

    }

}
