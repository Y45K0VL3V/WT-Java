package Task2;

import IOServices.Reader.Implement.ConsoleReader;
import IOServices.Writer.Implement.ConsoleWriter;
import Task2.Implement.FullArea;
import Task2.Implement.RectangleArea;
import Task2.Interface.Area;

public class Main {
    public static void main(String[] args) {
        var writer = ConsoleWriter.getInstance();
        var reader = ConsoleReader.getInstance();
        Area taskArea = new FullArea(
                new RectangleArea(-4, 0, 8, 5),
                new RectangleArea(-6, -3, 12, 3)
        );

        writer.WriteLn("Input x:");
        var x = reader.ReadDouble();

        writer.WriteLn("Input y:");
        var y = reader.ReadDouble();

        writer.WriteLn("Point " + (taskArea.Contains(x, y) ? "in" : "not in") + " area");
    }
}