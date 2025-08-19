

public class findOccurrenceRecursions {
    public static int first = -1;
    public static int last = -1;

    public static void printOccurrence(char element, String str, int idx)

    {

        if (idx == str.length()) {
            System.out.println(first);
            System.err.println(last);
            return;

        }
        char currChar = str.charAt(idx);
        if (currChar == element) {
            if (currChar == -1) {
                first = idx;
            } else {
                last = idx;
            }


        }

         printOccurrence(element, str, idx + 1);



    }

    public static void main(String[] args) {
        String str = "aaahjuaaida";
        printOccurrence('a' ,"str" , 0);
    }

    }

