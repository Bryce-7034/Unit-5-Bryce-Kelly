
public class Num implements Comparable{
    private int num;



    public Num(int value){
        this.num = value;
    }
    public Num(){
        num = 0;
    }

    public int getValue(){
        return num;
    }
    public void setValue(int num){
        this.num = num;
    }
    public String toString(){
        String result = "";
        result += num;
        return result;
    }
    public boolean equals(Num otherNum){
        return this.num == otherNum.num;
    }

    public int compareTo(Object obj){
        Num compare = (Num)obj;
        return this.getValue() - compare.getValue();
    }
}
