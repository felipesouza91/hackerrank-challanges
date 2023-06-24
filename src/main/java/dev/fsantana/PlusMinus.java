package dev.fsantana;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlusMinus {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());
    List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(Collectors.toList());

    plusMinus(arr);

    bufferedReader.close();
  }

  public static void plusMinus(List<Integer> arr) {
    int countPossitive = 0;
    int countNegative = 0;
    int countZero = 0;
    for (int i = 0; i < arr.size(); i++) {
      if (arr.get(i) > 0) {
        countPossitive++;
      } else if (arr.get(i) < 0) {
        countNegative++;
      } else {
        countZero++;
      }
    }

    System.out.format("%.6f\n", countPossitive / ((float) arr.size()));
    System.out.format("%.6f\n", countNegative / ((float) arr.size()));
    System.out.format("%.6f\n", countZero / ((float) arr.size()));

  }
}
