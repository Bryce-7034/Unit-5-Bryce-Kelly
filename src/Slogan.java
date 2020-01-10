public class Slogan {
    private static int instance;
    private String phrase;

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
}
