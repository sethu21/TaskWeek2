import java.util.Arrays;

public class FriendsListOrder {
    public static void main(String[] args) {
        String[] Friends = new String[]{"sethu","kabil","shalini","priya","jayanth","prasath","devaraj","mika"};
        Arrays.sort(Friends);
        for(String Friend:Friends){
            System.out.println(Friend);

        }
    }
}
