package Task7;

import IOServices.Reader.Implement.ConsoleReader;
import IOServices.Writer.Implement.ConsoleWriter;
import IOServices.Writer.Interface.Writer;
import Task6.ArrayTransformer;

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

        ShellSort.Sort(array);
        PrintArray(writer, array);
    }

    private static void PrintArray(Writer writer, int[] array) {
        for (int number : array) {
            writer.Write(number + " ");
        }
    }
}
