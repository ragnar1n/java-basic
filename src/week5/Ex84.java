package week5;

public class Ex84 {
    private int value;
    private boolean check;
    public Ex84(int startingValue, boolean check) {
        this.value=startingValue;
        this.check=check;
    }
    public Ex84(int startingValue) {
        this.value=startingValue;
        this.check=false;
    }
    public Ex84(boolean check){
        this.value=0;
        this.check=check;
    }
    public Ex84(){
        this.value=0;
        this.check=false;
    }
    public int value(){
        return value;
    }
    public void increase(){
        increase();
    }
    public void decrease(){
        decrease();
    }
    public void increase(int increaseAmount){
        if (increaseAmount>0){
            value=value+increaseAmount;
        }
    }
    public void decrease(int decreaseAmount){
        if (decreaseAmount>0){
            if (check){
                value=Math.max(0,value-decreaseAmount);
            }else {
                value=value-decreaseAmount;
            }
        }
    }
    public static void main(String[] args) {
        Ex84 c1=new Ex84();
        System.out.println("c1 "+c1.value);
        c1.increase(5);
        System.out.println(c1.value);
        c1.decrease(-1);
        System.out.println(c1.value);

        Ex84 c2=new Ex84(3,true);
        System.out.println("c2 "+c2.value);
        c2.decrease(10);
        System.out.println(c2.value);

        Ex84 c3=new Ex84(3,false);
        System.out.println("c3 "+c3.value);
        c3.increase(-5);
        System.out.println(c3.value);
        c3.decrease(10);
        System.out.println(c3.value);
    }
}
