package linear_search;

public class linear_search {

    public static void main(String[] args) {
        String[] name = {"neeraj" ,"fjdvjfn"};
        String search = "neeraj";
        System.out.println(linear_string( name , search));
    }

    static String linear_string(String[] hello , String target) {
        for (int index = 0; index < hello.length; index++) {
            String element = hello[index];
            if(element == target){
                return "found";
            }

        }
        return" not found";
    }
}
//    public static void main(String[] args) {
//        int[] array = new int[8];
//        int target = 322;
//
//        System.out.println( l_search(array, target));
//
//    }
//    static int l_search(int[] arr ,int search){
//        if (arr.length==0){
//            return -1;
//        }
//
//        for (int index = 0; index <arr.length ; index++) {
//            int list = arr[index];
//            if (list == search){
//                return index;
//            }
//
//        }
//        return Integer.MAX_VALUE;
//    }
//
//}




