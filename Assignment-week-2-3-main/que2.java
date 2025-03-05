public class que2 {

    public static void charArrtoString(char arr[]) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);

        }
        System.out.println(sb.toString());
        
    }
    public static void main(String[] args) {
        char arr[]={'a','s','d','f','h','a'};
        charArrtoString(arr);
        


    }
}
