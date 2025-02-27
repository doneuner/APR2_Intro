package kap11;

import java.util.List;

public interface DateiZugriff {

    List<String> readLines(String fileName);

    void writeLine(String fileName, String line);

    void writeLines(String fileName, List<String> lines);

}
