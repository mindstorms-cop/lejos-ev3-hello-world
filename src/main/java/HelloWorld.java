import lejos.hardware.Brick;
import lejos.hardware.BrickFinder;
import lejos.hardware.Keys;
import lejos.hardware.lcd.TextLCD;

public class HelloWorld {

    public static void main(String[] args) {

        Brick ev3  = BrickFinder.getLocal();
        TextLCD lcd = ev3.getTextLCD();
        Keys keys = ev3.getKeys();
        lcd.drawString("Hello World", 4, 3);
        lcd.drawString("I'm a Java app", 2, 4);
        keys.waitForAnyPress();

    }
}
