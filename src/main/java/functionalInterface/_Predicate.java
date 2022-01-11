package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        //Imperative way
        System.out.println(isPhoneNumberValid("0711111111"));
        System.out.println(isPhoneNumberValid("07222222222"));

        //Declarative way
        System.out.println(isPhoneNumberValidPredicate.test("0711111111"));
        System.out.println(isPhoneNumberValidPredicate.test("071111111123"));
        System.out.println(
                isPhoneNumberValidPredicate.and(containsNumber3).test("0711111234")
        );
        System.out.println(
                isPhoneNumberValidPredicate.or(containsNumber3).test("0711111234")
        );


    }

    //Imperative way
    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 10;
    }

    //Declarative way
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 10;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");

}
