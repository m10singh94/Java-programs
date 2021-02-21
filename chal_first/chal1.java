// to create a program to add various types of data

class chal1{
    public static void main(String[] args){
        int int_num = 7899654;
        short short_num = 15647;
        byte byte_num = 120;
        long total = 50000L + (10L * (int_num + short_num + byte_num));
        System.out.println("Total = " + total);
    }
}