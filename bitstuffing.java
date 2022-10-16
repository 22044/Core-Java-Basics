public class bitstuffing {
    public static void main(String[] args) {
        String flag="010100";
        String data="010111111011";
        int i;
        int count=0;

        for(i=0;i<data.length();i++){
            if(data[i]=='1'){
                count++;
            }
            else{
                count=0;
                System.out.println(data);
            }
            if(count==5){
                System.out.println("0");
                count=0;
            }

        }

        System.out.println(flag + data + flag);
    }



}
