public class PrimitiveDT{
    public static void main(String[] args) {
        int a1,a2;
        byte b1,b2;
        b1=126;
        a1=b1;
        System.out.println(a1); //widening  //implicit conversion

        a2=130;
        b2=(byte)a2;   //explicit conversion
        System.out.println(b2);   //narrowing as 127 is the highest value it'll go circle through -ve
        
                

        
    }
}