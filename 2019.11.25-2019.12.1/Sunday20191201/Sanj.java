package Sunday20191201;

public class Sanj {
    private int a;
    private int b;
    private int d;

    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int getD(){
        return d;
    }
    public Sanj(int a, int b, int d) {
        this.a = a;
        this.b = b;
        this.d = d;
    }



    public int getC(){
        int sum=a+b+d;
        if(a+b<=d||a+d<=b||d+b<=a){
            try{
                throw new NotSanjiaoException("不能构成三角形");
            }catch(NotSanjiaoException e){
                System.out.println(e);
                return -1;
            }
        }else{
            return sum;
        }


    }
    public void showInfo(){
        if(a+b<=d||a+d<=b||d+b<=a){
            try{
                throw new NotSanjiaoException("不能构成三角形");
            }catch(NotSanjiaoException e){
                System.out.println(e);
            }
        }else{
            System.out.println("A:"+a+"  B:"+b+"  C:"+d+"  周长"+getC());
        }

    }

}
