public class Flags {
    public static void main(String[] args) {
        
        for (int i = 0; i < args.length; i++) {
    if (args[i].equals("-file")) {
        String filename = args[i + 1];
        System.out.println("File: " + filename);
    }
    if (args[i].equals("--name")) {
        String name = args[i + 1];
        System.out.println("Name: " + name);
    }
    if (args[i].equals("-limit")) {
        int limit = Integer.parseInt(args[i + 1]); //convert to integer
        System.out.println("Limit: " + limit);
    }
    // java --file ducname.txt --name AliJan -limit 100 //this is how Flag command work.
}

    }
    
}
