public class overloding {


    public void add(int a, int b ) {
        System.out.println(a+b);

    }

public void add(int a, int b , int c) {
    System.out.println(a * b*c);
}

static void add(int a, int b ,int c, int d) {
    System.out.println(a/b);

}
static void add(int a , int b , int c,int d, int e){
    System.out.println(a-b);
}

public static void main(String[] args){
        overloding su=new overloding();
        su.add(2,4);
        su.add(2,4,6);
        su.add(2,3);
        su.add(2,4);




    }
}
