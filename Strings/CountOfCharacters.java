package _String_programs_;

public class CountOfCharacters {

//    Providing main method program Starts from this line
    public static void main(String[] args) {

//        Declaring a String
        String language = "Core  Java";


//        Declaring the count Variable
        int count = 0;

//        We're using loop to iterate over the string to count the words or characters
        for (int i=0;i<language.length();i++){

//            Incrementing the count variable
//            count++;

//             If we provide a String with Spaces then it is required
            if (language.charAt(i) != ' '){
                count++;
            }

        }
//        Printing the Total Count of a string
        System.out.println(count);
    }
}
