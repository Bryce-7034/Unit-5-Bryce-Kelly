public class Num {
    private int num;
    public void Num(){
        num = 0;
    }
    public void Num(int num){
        this.num = num;
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
}
