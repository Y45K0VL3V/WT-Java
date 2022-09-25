package Task1;

import IOServices.Reader.Implement.ConsoleReader;
import IOServices.Writer.Implement.ConsoleWriter;
import Task1.Math.FunctionSolver;

public class Main {
    public static void main(String[] args)
    {
        var writer = ConsoleWriter.getInstance();
        var reader = ConsoleReader.getInstance();
        var calculator = new FunctionSolver();

        writer.WriteLn("Input x:");
        var x = reader.ReadDouble();

        writer.WriteLn("Input y:");
        var y = reader.ReadDouble();

        writer.WriteLn("Result = " + calculator.Calculate(x, y));
    }
}
