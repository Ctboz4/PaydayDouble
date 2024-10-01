public class Pay {
    public static void main(String[] args){
        
        double pay = .01;
        int payDay = 1;
        

    

        do {
            System.out.println("It is day " + payDay + " and I have made " + pay + " dollars today!");
            payDay += 1;
            pay *= 2;
     
            
        } while (payDay <= 30);
    }
}
