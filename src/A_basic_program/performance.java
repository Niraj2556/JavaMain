package string;

public class performance {
    public static void main(String[] args) {

        String series = "";
        for (int i = 0; i <  26; i++) {
            char alp = (char)('a' + i);
            series = series + alp;
        }
        System.out.println(series);



    }
}
