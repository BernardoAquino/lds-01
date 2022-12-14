package com.projeto;

import java.util.List;
import java.util.Scanner;

public class ScannerUtils {
  public static String lerInstrucao(Scanner scanner) {
    return lerInstrucao("Escolha uma opção: ", scanner);
  }

  public static String lerInstrucao(String label, Scanner scanner) {
    System.out.println(label);

    return scanner.nextLine();
  }

  public static String lerValor(String label, Scanner scanner) {
    return lerValor(label, scanner, List.of());
  }

  public static String lerValor(String label, Scanner scanner, List<String> restricao) {
    String valor = "";
    Boolean invalido = false;

    do {
      System.out.println(label);
      valor = scanner.nextLine();
      invalido = valor.equals("") || (restricao.size() >= 1 && !restricao.contains(valor));

      if (invalido) {
        System.out.println("Valor inválido.\n");
      }
    } while (invalido);

    return valor;
  }
}
