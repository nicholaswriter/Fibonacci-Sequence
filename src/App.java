public class App {
    public static void main(String[] args)  {
        if (args.length > 1) {
            System.out.println("Error. Please enter only one argument.");
            return;
        } else {
            try {
                int input = Integer.parseInt(args[0]);
                int value_1 = 0;
                int value_2 = 1;
                int value_3 = 0;
                if (input == 1) {
                    System.out.println(1);
                    return;
                } 
                for (int i = 0; i < input - 1; i++) {
                    value_3 = value_1 + value_2;
                    value_1 = value_2;
                    value_2 = value_3;
                }
                System.out.println(value_3);
            } catch (Exception e) {
                System.out.println("Please ensure your input is an integer, and there is only one argument.");
            }
        }
    }
}
