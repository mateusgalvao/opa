public class Pro7 {
    public static void main(String[] args) {
        int cont1= 0;
        int num = 1;
        while(num < 16){
            for (int i = 1 ; i <= num ; i++){
                if ((num%i) == 0){

                    cont1++;
                }
            }
            if (cont1 ==2 ){
                System.out.println("primo"+num+"primo");

            }else{
                System.out.println("primo "+num+" não primo");
            }
        }

        }

    
}
