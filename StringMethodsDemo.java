public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "Java";
        String str2 = "Programming";
        String str3 = "java";
        String str4 = "Hello World";
        String str5 = "Welcome to Java";
        String withSpaces = "  Java Programming  ";

        // length()
        System.out.println("length: " + str.length()); // 4

        // charAt(int index)
        System.out.println("charAt(2): " + str.charAt(2)); // v

        // concat(String s)
        System.out.println("concat: " + str.concat(" World")); // Java World

        // equals(Object s)
        System.out.println("equals: " + str.equals(str3)); // false

        // equalsIgnoreCase(String s)
        System.out.println("equalsIgnoreCase: " + str.equalsIgnoreCase(str3)); // true

        // compareTo(String s)
        System.out.println("compareTo: " + str.compareTo(str3)); // negative value

        // substring(int beginIndex)
        System.out.println("substring(6): " + str2.substring(6)); // ming

        // substring(int begin, int end)
        System.out.println("substring(0, 7): " + str2.substring(0, 7)); // Program

        // toUpperCase()
        System.out.println("toUpperCase: " + str3.toUpperCase()); // JAVA

        // trim()
        System.out.println("trim: '" + withSpaces.trim() + "'"); // 'Java Programming'

        // toLowerCase()
        System.out.println("toLowerCase: " + str.toLowerCase()); // java

        // replace(char oldChar, char newChar)
        System.out.println("replace: " + str4.replace('o', '0')); // Hell0 W0rld

        // split(String regex)
        String[] arr = str5.split(" ");
        System.out.print("split: ");
        for (String s : arr)
            System.out.print(s + ", "); // Welcome, to, Java, 
        System.out.println();

        // startsWith(String prefix)
        System.out.println("startsWith 'Wel': " + str5.startsWith("Wel")); // true

        // endsWith(String suffix)
        System.out.println("endsWith 'Java': " + str5.endsWith("Java")); // true

        // indexOf(char/Str)
        System.out.println("indexOf 'o': " + str5.indexOf('o')); // 4

        // lastIndexOf(char/Str)
        System.out.println("lastIndexOf 'o': " + str5.lastIndexOf('o')); // 9

        // isEmpty()
        String emptyString = "";
        System.out.println("isEmpty: " + emptyString.isEmpty()); // true

        // valueOf(int/double/other primitive)
        int x = 42;
        double y = 3.14;
        System.out.println("valueOf(int): " + String.valueOf(x)); // "42"
        System.out.println("valueOf(double): " + String.valueOf(y)); // "3.14"

        // join(CharSequence delimiter, CharSequence... elements)
        String joined = String.join("-", "2025", "10", "07");
        System.out.println("join: " + joined); // 2025-10-07

        // toCharArray()
        char[] charArr = str.toCharArray();
        System.out.print("toCharArray: ");
        for (char c : charArr)
            System.out.print(c + " "); // J a v a 
        System.out.println();

        // indexOf(int ch)
        System.out.println("indexOf('g'): " + str2.indexOf('g')); // 3

        // indexOf(String s)
        System.out.println("indexOf("gram"): " + str2.indexOf("gram")); // 3

        // lastIndexOf(char/Str)
        System.out.println("lastIndexOf('a'): " + str2.lastIndexOf('a')); // 9

        // contains(CharSequence s)
        System.out.println("contains 'Pro': " + str2.contains("Pro")); // true

        // toLowerCase()
        System.out.println("toLowerCase (again): " + str2.toLowerCase()); // programming

        // equalsIgnoreCase(String s) (again)
        System.out.println("equalsIgnoreCase (again): " + "Java".equalsIgnoreCase("java")); // true 
    }
}
