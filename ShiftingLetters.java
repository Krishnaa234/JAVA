class ShiftingLetters {
    public String shiftingLetters(String s, int[] shifts) {
        
		for(int i=shifts.length-1; i>0; --i){
            shifts[i-1] = shifts[i-1] + shifts[i];   // add up the shift
            shifts[i-1] = shifts[i-1] % 26;   // check for integer overflow
        }
        
        char[] charArr = s.toCharArray();
        for(int i=0; i<s.length(); ++i){
            charArr[i] = (char)('a'+(charArr[i]-'a' + shifts[i])%26 );
        }
        return String.valueOf(charArr);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        ShiftingLetters sol = new ShiftingLetters();
        String s = in.next();
        int size = in.nextInt();
        int[] shifts = new int[size];

        String ans = sol.shiftingLetters(s, shifts);
    }
}
