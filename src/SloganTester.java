public class SloganTester {
    public static void main(String[]args) {
        Slogan hello = new Slogan("hi");
        System.out.println(Slogan.getInstances());
        Slogan bye = new Slogan("Good Bye");
        System.out.println(Slogan.getInstances());
        Slogan empty = new Slogan();
        System.out.println(Slogan.getInstances());
        Slogan pie = new Slogan("3.141592653589793238462643383279502884197169399375105820974944592307816406286");
        System.out.println(Slogan.getInstances());

        Slogan[] random = new Slogan[4];
        random[0] = hello;
        random[1] = bye;
        random[2] = empty;
        random[3] = pie;

        System.out.print(random[(int)(Math.random()*4)].toString());
        //System.out.print(hello.toString()+"\n"+bye.toString()+"\n"+empty.toString()+"\n"+pie.toString());
    }
}
