/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.awt.*;                                       
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;

public class AnalogClock extends Frame {
    public AnalogClock() {
        setTitle("Analog Clock");
        setSize(400, 400);
        setResizable(false);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int radius = Math.min(centerX, centerY) - 10;

        // Draw the clock face
        g2d.setColor(Color.WHITE);
        g2d.fillOval(centerX - radius, centerY - radius, radius * 2, radius * 2);
        g2d.setColor(Color.BLACK);
        g2d.drawOval(centerX - radius, centerY - radius, radius * 2, radius * 2);

        // Get the current time
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        // Calculate the angles for hour, minute, and second hands
        double hourAngle = Math.toRadians((hour * 30) - 90);
        double minuteAngle = Math.toRadians((minute * 6) - 90);
        double secondAngle = Math.toRadians((second * 6) - 90);

        // Draw the hour hand
        int hourHandLength = radius / 2;
        int hourHandX = centerX + (int) (hourHandLength * Math.cos(hourAngle));
        int hourHandY = centerY + (int) (hourHandLength * Math.sin(hourAngle));
        g2d.drawLine(centerX, centerY, hourHandX, hourHandY);

        // Draw the minute hand
        int minuteHandLength = radius * 3 / 4;
        int minuteHandX = centerX + (int) (minuteHandLength * Math.cos(minuteAngle));
        int minuteHandY = centerY + (int) (minuteHandLength * Math.sin(minuteAngle));
        g2d.drawLine(centerX, centerY, minuteHandX, minuteHandY);

        // Draw the second hand
        int secondHandLength = radius * 9 / 10;
        int secondHandX = centerX + (int) (secondHandLength * Math.cos(secondAngle));
        int secondHandY = centerY + (int) (secondHandLength * Math.sin(secondAngle));
        g2d.setColor(Color.RED);
        g2d.drawLine(centerX, centerY, secondHandX, secondHandY);
    }

    public static void main(String[] args) {
        new AnalogClock();
    }
}