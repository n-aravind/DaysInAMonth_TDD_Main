public class Main {

    public static void main(String[] args) {
	// write your code here
        DaysInAMonth daysInAMonth = new DaysInAMonth();

        System.out.println("Test 1 : " + (31==daysInAMonth.getDaysInMonth(1,2019)?"Pass":"Fail"));
        System.out.println("Test 2 : " + (31==daysInAMonth.getDaysInMonth(3,2019)?"Pass":"Fail"));
        System.out.println("Test 3 : " + (30==daysInAMonth.getDaysInMonth(4,2019)?"Pass":"Fail"));
        System.out.println("Test 4 : " + (31==daysInAMonth.getDaysInMonth(5,2019)?"Pass":"Fail"));
        System.out.println("Test 5 : " + (30==daysInAMonth.getDaysInMonth(6,2019)?"Pass":"Fail"));
        System.out.println("Test 6 : " + (31==daysInAMonth.getDaysInMonth(7,2019)?"Pass":"Fail"));
        System.out.println("Test 7 : " + (31==daysInAMonth.getDaysInMonth(8,2019)?"Pass":"Fail"));
        System.out.println("Test 8 : " + (30==daysInAMonth.getDaysInMonth(9,2019)?"Pass":"Fail"));
        System.out.println("Test 9 : " + (31==daysInAMonth.getDaysInMonth(10,2019)?"Pass":"Fail"));
        System.out.println("Test 10 : " + (30==daysInAMonth.getDaysInMonth(11,2019)?"Pass":"Fail"));
        System.out.println("Test 11 : " + (31==daysInAMonth.getDaysInMonth(12,2019)?"Pass":"Fail"));
        System.out.println("Test 12 : " + (28==daysInAMonth.getDaysInMonth(2,2019)?"Pass":"Fail"));
        System.out.println("Test 13 : " + (29==daysInAMonth.getDaysInMonth(2,2020)?"Pass":"Fail"));
        System.out.println("Test 14 : " + (29==daysInAMonth.getDaysInMonth(2,2016)?"Pass":"Fail"));
        System.out.println("Test 15 : " + (29==daysInAMonth.getDaysInMonth(2,2000)?"Pass":"Fail"));
        System.out.println("Test 16 : " + (28==daysInAMonth.getDaysInMonth(2,1900)?"Pass":"Fail"));

    }
}
