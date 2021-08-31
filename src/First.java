
public class First
{
    private int l,b,h,Ar;
    public Box()
    {
        l=4;
        b=8;
        h=2;
        Ar=4*8*2;
    }
    public Box(int L, int B, int H,int A)
    {
        l=L;
        b=B;
        h=H;
        Ar=A;
    }
    public static void main(String []args)
    {
        Box b1=new Box();
        Box b2=new Box(5,9,1);
        System.out.println("Area of rectangle is:"+Ar);
    }
}