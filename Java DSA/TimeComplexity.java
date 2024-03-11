public class TimeComplexity {

    static int factorial(int k){
        // if(k==0){
        //     return 1;
        // }
        // return k*factorial(k-1); 
        int result=1;
        while(k>1){
           
           
            for(int i=1;i<=k;i++){
                result = result*i;
            }
            return result;
        }
        return 0;
    }

    static void function1(){
        
    }
    public static void main(String[] args) {
        int k=5;
        int result = factorial(k);
        System.out.println("The Factorial of the given number is : "+result);
        
    }
    
}
