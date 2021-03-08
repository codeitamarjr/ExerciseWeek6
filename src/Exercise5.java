public class Exercise5 {
    public static void main(String args[]){
        int v1=3,v2=4;

        if (v1!=v2){ //it's true cuz they're different
            System.out.println("a) 1!=v2");
        } if (v1<=v2){ //it's true cuz 3 is less than 4
            System.out.println("b) v1<=v2");
        } if (v1==3 && v2>2){ //it's both true
            System.out.println("c) v1==3 && v2>2");
        } if (v1<5 || v2>7){ //it's true cuz v1<5 although v2 is false
            System.out.println("d) v1<5 || v2>7");
        } if (!(v1>3) || v2>4){ //It's true cuz the NOT turn the first condition which is false into true
            System.out.println("e) !(v1>3) || v2>4");
        } if (!(v1>3 || v2<7)){ //It's false cuz NOT will turn both conditions which is true into false
            System.out.println("f) !(v1>3 || v2<7)");
        }
    }
}
