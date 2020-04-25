package enums;

public class EnumMain {
    public static void main(String[] args) {
        Size small =Size.SMALL;
        Size medium =Size.MEDIUM;

        Size otherMedium = Size.MEDIUM;
        Size otherSmall= Size.valueOf("SMALL");

        Color red = Color.RED;
        red.sing();


    }
}
