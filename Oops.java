public class Oops {
    void print(int a){
        System.out.println(a);
    }

    void print(float a){
        System.out.println(a);
    }

    void print(char a){
        System.out.println(a);
    }

    void print(boolean a){
        System.out.println(a);
    }

    void print(short a){
        System.out.println(a);
    }

    void print(int a,char c){
        System.out.println(a+c);
    }

    // void print(int a,float b){     
    //     System.out.println(a);          ambiguous error
                                      //implicit type casting
    // }

    void print(float a, int b){
        System.out.println(a);
    }

    void print(double a, double b){
        System.out.println(a);
    }

    void print(double a, double b,int c){
        System.out.println(a+b+c);
    }

    void print(char a, double b){
        System.out.println(a);
    }                                  // method overloading

    public static void main(String[] args) {
        // int a = 10;
        // int b = 20;
        // int c = 30;
        // char ch = 'a';
        // float f = 45.5f;
        // double d = 55.55;
        Oops p = new Oops();
        // p.print(ch);
        // p.print(a,a);
        p.print(2,2);
    }
}

