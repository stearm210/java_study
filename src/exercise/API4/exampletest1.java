package exercise.API4;

public class exampletest1 {
    public static void main(String[] args) {
        int[] list=new int[100];
        list[0]=11;
        list[1]=22;
        list[2]=33;
        System.out.println(getArrayData(list));
    }
    public static String getArrayData(int[] arr){
        //是否为空数组
        if(arr == null){
            return null;
        }
        //arr数组对象是否存在 arr=[11,22,33]
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}




