public class Command_line_argument {
    public static void main(String[] args) {
        System.out.println("here it starts:");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[0]);
            System.out.println(args[1]);
            System.out.println(args[2]);
            break;
        }
    }
}

