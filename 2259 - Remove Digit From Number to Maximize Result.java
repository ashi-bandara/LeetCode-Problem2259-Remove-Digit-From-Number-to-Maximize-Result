class Solution {
    public String removeDigit(String number, char digit) {
        int n = number.length();
        int reference = 0;

        for (int i = 0; i < n; i++) {
            if (number.charAt(i) == digit) {
                reference = i;
                if(i<n-1 && digit < number.charAt(i+1)) {
                    break;
                }
            }
        }
        String returnString = number.substring(0, reference) + number.substring(reference + 1);
        return returnString;
    }
}
