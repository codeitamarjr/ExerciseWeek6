public class Exercise1{
    public static void main(String args[]){

        int n1 = 10, n2 = 5 , n3 = 0;
        if (n1>9){
            n3=n1++; //n3=10 and n1=11
        }

        if (n2<5){ //nothing happen
            n3=0;
        }

        if(n3>1){
            n3++; //n3=11
        }

        if(n2<n1){
            n3+=++n2; //n2=6+11 = 17 and n3=17
        }

        System.out.println("n1="+n1+" n2="+n2+" n3="+n3); //n1=11 n2=6 n3=17

    }
}