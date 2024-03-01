import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String name = "Iale Maria Santos de Almeida";
        String accountType = "Corrente";
        float balance = 245.00f;

        System.out.println(String.format("""
                ***********************************************
                Client's strat datas:
                
                Name:             %s
                Account type:     %s
                Banck balance:    %.2f
                ***********************************************
                
                Operations
                1 - Consult balance
                2 - Receive amount
                3 - Transfer amount
                4 - Exit
                """, name, accountType, balance));
            int chooseOp = s.nextInt();
    
        while (chooseOp != 4){
            switch (chooseOp){
                case 1:
                    System.out.println(String.format("""
                        Banck balance: %.2f
                    
                        Operations
                        1 - Consult balance
                        2 - Receive amount
                        3 - Transfer amount
                        4 - Exit
                        """, balance));
                    chooseOp = s.nextInt();
                    break;
                case 2:
                    System.out.println("How much do you will receive? ");
                    balance += s.nextFloat();

                    System.out.println(String.format("""
                        Update banck balance: %.2f
                    
                        Operations
                        1 - Consult balance
                        2 - Receive amount
                        3 - Transfer amount
                        4 - Exit
                        """, balance));
                    chooseOp = s.nextInt();
                    break;
                case 3: 
                    System.out.println("How much you will send? ");
                    double newValue = s.nextFloat();
                    
                        if (newValue > balance){
                            System.out.println("You can't finish this operation, banck ballance insufficient.");
                            System.out.println(String.format("""
                                Operations
                                1 - Consult balance
                                2 - Receive amount
                                3 - Transfer amount
                                4 - Exit
                                """, balance));
                            chooseOp = s.nextInt();
                        } else {
                            balance -= newValue;
                            System.out.println(String.format("""
                                Update banck balance: %.2f
                            
                                Operations
                                1 - Consult balance
                                2 - Receive amount
                                3 - Transfer amount
                                4 - Exit
                                """, balance));
                            chooseOp = s.nextInt();
                        }
                    break;
                }   

        }
        
        s.close();
      
    }
}