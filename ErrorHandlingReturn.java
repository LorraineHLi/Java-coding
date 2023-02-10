public class ErrorHandlingReturn {
    public static boolean birthdayGreetings(String name, int age) {
        boolean success;
        if (age > 0) {
            System.out.println("All the best to your " + age + ". birthday " + name);
            success = true;
        } else {
            System.err.println("ERROR: The given age must be larger zero but is: " + age);
            success = false;
        }
        return success;
    }

    public static void spam(String[] names, int[] ages) {
        int l = names.length;
        for (int i = 0; i < l; i++){
            if (! birthdayGreetings(names[i], ages[i])) birthdayGreetings(names[i], 20);
        }
    }
}
