public class Main {
    public static void main(String[] args) {

    /* ======= Case 1 ============
    SELECT e.surname
    FROM db.employees e
    ORDER BY e.experience DESC LIMIT 1, 1;
    */

    // ======= TestCases for 2 ============
        int firstNum = 1, secNum = -99;
        swapTwoNumbers(firstNum,secNum);

    // ======= TestCases for 3.1 ============
        OneDirectionLinkedList<Integer> linkedList = new OneDirectionLinkedList<>();
        linkedList.add(23234);
        linkedList.add(123124);
        linkedList.add(124125);
        linkedList.add(12312);

        linkedList.printList(linkedList.head);
        linkedList.reverse();
        linkedList.printList(linkedList.head);

    // ======= TestCases for 3.2 ============
        System.out.println(isPalindrome("Я им - их манеж. Отчим, и что же нам? Химия.")); // true
        System.out.println(isPalindrome("123Вот сила типа кухарки марксистов. Вот с искрами крах у капиталистов!321")); // true
        System.out.println(isPalindrome("Некоторый текст, который, очевидно - не палиндром")); // false
    }

    // ======= Case 2 ============
    public static void swapTwoNumbers(int firstNum, int secNum){
        firstNum ^= secNum ^ (secNum = firstNum);
        System.out.println("first = " + firstNum + ", second = " + secNum);
    }

    // ======= Case 3.2 ============
    public static boolean isPalindrome(String inputText) {
        String stripInputText = inputText.replaceAll("[^A-Za-zА-Яа-я\\d]+", "").toLowerCase();
        return stripInputText.contentEquals(new StringBuilder(stripInputText).reverse());
    }
}