import java.util.*;

class Main {
  
    public static void main(String[] args) {
    Fibonacci fib = new Fibonacci();
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Informe um número: ");
    int n = sc.nextInt();
    
    for(int i=0; i<n;i++){
      System.out.println( fib.fib(i));// chamando função recursiva  
    }
  }
  public static class Fibonacci{
  // função de fibonacci
  public  int fib(int n){
    if(n<2){
        return n;
      }
    else{
        return fib(n-1)+ fib(n-2);
      }
      
    } 
  }
}