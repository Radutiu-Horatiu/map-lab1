import java.util.Arrays;

public class Problem4 {
    // stocks
    int [] keyboard = new int[]{40, 35, 70, 25, 45};
    int [] usb = new int[]{20, 15, 80, 15, 90, 55};

    public int getCheapKeyboard() {
        Problem2 obj = new Problem2();

        return obj.getMin(this.keyboard);
    }

    public int getExpensiveGadget() {
        Problem2 obj = new Problem2();

        int keyboard = obj.getMax(this.keyboard);
        int usb = obj.getMax(this.usb);

        if (keyboard > usb)
            return keyboard;
        return usb;
    }

    public int getAffordableUsb(int budget) {
        Arrays.sort(this.usb);
        int usb = 0;

        for (int i = 0; i < this.usb.length; i++) {
            if (budget >= this.usb[i])
                usb = this.usb[i];
            else
                break;
        }

        return usb;
    }

    public int shopEconomic(int budget) {
        Problem2 obj = new Problem2();

        int usb = obj.getMin(this.usb);
        int keyboard = this.getCheapKeyboard();

        if (usb + keyboard > budget)
            return -1;
        return usb + keyboard;
    }
}