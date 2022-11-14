public class Sum_of_invalid_integer {
    public static void main(String[] args) {
    int i,sum=0,count=0;
    System.out.println("execution starts");
    for(i=0; i<args.length; i++) {
        try {
            sum = sum + Integer.parseInt(args[i]);
        }
        catch(NumberFormatException e)
        {
            System.out.println("invalid integers");
            count++;
        }
    }
       System.out.println("sum of the valid  integers:" +sum);
       System.out.println("invalid integers:" +count);
      }
        }


