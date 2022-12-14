package Task6;

import IOServices.Reader.Implement.ConsoleReader;
import IOServices.Writer.Implement.ConsoleWriter;
import IOServices.Writer.Interface.Writer;

import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        var writer = ConsoleWriter.getInstance();
        var reader = ConsoleReader.getInstance();

        writer.WriteLn("Input size:");
        var size = reader.ReadInt();

        var array = new int[size];
        for (int i = 0; i < array.length; i++) {
            writer.WriteLn("Input element " + (i + 1) + ":");
            array[i] = reader.ReadInt();
        }

        var matrix = ArrayTransformer.TransformArray(array);
        PrintTable(writer, matrix);
    }

    private static void PrintTable(Writer writer, int[][] array) {
        for (int[] ints : array) {
            for (int number : ints) {
                writer.Write(number + " ");
            }
            writer.WriteLn("");
        }
    }
}
