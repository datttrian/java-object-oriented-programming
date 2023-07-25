package _05_02;

import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    DigitsOnlyFileReader digitsOnlyFileReader = new DigitsOnlyFileReader(
        "./_05_02/message.txt");

    System.out.println(digitsOnlyFileReader.readFile());
    System.out.println(digitsOnlyFileReader.getPath());
  }
}
