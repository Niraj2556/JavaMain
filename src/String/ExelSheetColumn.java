package String;

public class ExelSheetColumn {
     public static String convertToTitle(int columnNumber) {
            StringBuilder columnTitle = new StringBuilder();
            while (columnNumber > 0) {
                int remainder = (columnNumber - 1) % 26;
                columnTitle.insert(0 ,(char) (remainder + 'A'));
                columnNumber = (columnNumber - 1) / 26;
            }
            return columnTitle.toString();
        }

        public static void main(String[] args) {
            int columnNumber = 28;
            String columnTitle = convertToTitle(columnNumber);
            System.out.println("Column number " + columnNumber + " is Excel column title: " + columnTitle);

    }

}









