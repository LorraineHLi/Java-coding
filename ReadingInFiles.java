public class ReadingInFiles {
    public static void main(String[] args) {
        In file = new In("http://www.gutenberg.org/files/39063/39063-0.txt");
        while (!file.isEmpty()) {
            String line = file.readLine();
            if (line.contains("mountain")) {
                System.out.println(line);
            }
        }

//        In file1 = new In("myfile.txt");
//        String s = file1.readAll();
//        String[] words = s.split(" ");
    }
}
