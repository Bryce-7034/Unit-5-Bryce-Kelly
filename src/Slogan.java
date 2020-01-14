public class Slogan implements Lockable{
    private static int instance;
    private String phrase;
    private int key;
    private boolean locked;

    public Slogan(){
        instance++;
    }

    public Slogan(String phrase){
        this.phrase = phrase;
        instance++;
    }

    public static int getInstances(){
        return instance;
    }

    public String toString(){
        String result  = "";

        result += phrase;

        return result;
    }
    public void setKey(int key){
        this.key = key;
    }

    public void unlock(int key){
        if(key == this.key){
            locked = false;
        }
        else
            System.out.println("NO");
    }

    public void lock(int key){
        if(key == this.key){
            locked = true;
        }
        else
            System.out.println("NO");
    }

    public boolean locked(){
        return locked;
    }
}
