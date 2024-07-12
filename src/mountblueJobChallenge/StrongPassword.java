package mountblueJobChallenge;

// https://www.hackerrank.com/challenges/strong-password/problem

public class StrongPassword {
    public static void main(String[] args) {

        System.out.println(minimumNumber(1, "a"));
    }

    public static int minimumNumber(int n, String password) {

        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasDigit = false;
        boolean hasSpecialCharacter = false;

        String specialCharacters = "!@#$%^&*()-+";

        for (char c : password.toCharArray()){

            if (Character.isUpperCase(c)){
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (specialCharacters.contains(String.valueOf(c))){
                hasSpecialCharacter = true;
            }
        }

        int missingCharacters = 0;

        if (!hasLowerCase){
            missingCharacters++;
        }

        if (!hasUpperCase){
            missingCharacters++;
        }

        if (!hasDigit){
            missingCharacters++;
        }

        if (!hasSpecialCharacter){
            missingCharacters++;
        }

        return Math.max(missingCharacters, 6 - n);
    }
}