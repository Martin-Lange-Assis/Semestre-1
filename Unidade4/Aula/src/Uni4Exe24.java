import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        int val1;
        int val2;
        int val3;

        System.out.println("Informe a opção");
        opcao = teclado.nextInt();
        System.out.println("Informe o valor 1");
        val1 = teclado.nextInt();
        System.out.println("Informe o valor 2");
        val2 = teclado.nextInt();
        System.out.println("Informe o valor 3");
        val3 = teclado.nextInt();

        switch (opcao) {
            case 1:
                if (val1 < val2 && val1 < val3 && val2 < val3) {
                    System.out.println(val1);
                    System.out.println(val2);
                    System.out.println(val3);
                } else {
                    if (val1 < val2 && val1 < val3 && val2 > val3) {
                        System.out.println(val1);
                        System.out.println(val3);
                        System.out.println(val2);
                    } else {
                        if (val1 > val2 && val1 < val3 && val2 < val3) {
                            System.out.println(val2);
                            System.out.println(val1);
                            System.out.println(val3);
                        } else {
                            if (val1 > val2 && val1 > val3 && val2 < val3) {
                                System.out.println(val2);
                                System.out.println(val3);
                                System.out.println(val1);
                            } else {
                                if (val1 > val2 && val1 > val3 && val2 > val3) {
                                    System.out.println(val3);
                                    System.out.println(val2);
                                    System.out.println(val1);
                                } else {
                                    if (val1 < val2 && val1 > val3 && val2 > val3) {
                                        System.out.println(val3);
                                        System.out.println(val1);
                                        System.out.println(val2);
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 2:
                if (val1 > val2 && val1 > val3 && val2 > val3) {
                    System.out.println(val1);
                    System.out.println(val2);
                    System.out.println(val3);
                } else {
                    if (val1 > val2 && val1 > val3 && val2 < val3) {
                        System.out.println(val1);
                        System.out.println(val3);
                        System.out.println(val2);
                    } else {
                        if (val1 < val2 && val1 > val3 && val2 > val3) {
                            System.out.println(val2);
                            System.out.println(val1);
                            System.out.println(val3);
                        } else {
                            if (val1 < val2 && val1 < val3 && val2 > val3) {
                                System.out.println(val2);
                                System.out.println(val3);
                                System.out.println(val1);
                            } else {
                                if (val1 < val2 && val1 < val3 && val2 < val3) {
                                    System.out.println(val3);
                                    System.out.println(val2);
                                    System.out.println(val1);
                                } else {
                                    if (val1 > val2 && val1 < val3 && val2 < val3) {
                                        System.out.println(val3);
                                        System.out.println(val1);
                                        System.out.println(val2);
                                    }
                                }
                            }
                        }
                    }

                }
                break;
            case 3:
                if (val1 < val2 && val1 < val3 && val2 < val3) {
                    System.out.println(val1);
                    System.out.println(val3);
                    System.out.println(val2);
                } else {
                    if (val1 < val2 && val1 < val3 && val2 > val3) {
                        System.out.println(val1);
                        System.out.println(val2);
                        System.out.println(val3);
                    } else {
                        if (val1 > val2 && val1 < val3 && val2 < val3) {
                            System.out.println(val2);
                            System.out.println(val3);
                            System.out.println(val1);
                        } else {
                            if (val1 > val2 && val1 > val3 && val2 < val3) {
                                System.out.println(val2);
                                System.out.println(val1);
                                System.out.println(val3);
                            } else {
                                if (val1 > val2 && val1 > val3 && val2 > val3) {
                                    System.out.println(val3);
                                    System.out.println(val1);
                                    System.out.println(val2);
                                } else {
                                    if (val1 < val2 && val1 > val3 && val2 > val3) {
                                        System.out.println(val3);
                                        System.out.println(val2);
                                        System.out.println(val1);
                                    }
                                }
                            }
                        }
                    }
                }
        }

        teclado.close();
    }
}