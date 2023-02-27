package ua.com.alevel;

public class SumNumbers {
    public int numbers (String st){
        char [] chars = st.toCharArray();
        int sum = 0;
        for (char a : chars){
            if (a <= 57 && a >= 48){
                sum = sum + Character.getNumericValue(a);

            }
        }
        return (sum);
    }
}
