import java.util.Scanner;

public class AtividadePetri2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pedidos = new String[10];
        int quantidade = 0;
        int escolha = 0;

        while (escolha != 4) {
            System.out.println("LANCHONETE DO GORDINHO");
            System.out.println("1 - Fazer um pedido");
            System.out.println("2 - Preparar o pedido mais antigo");
            System.out.println("3 - Ver os pedidos que faltam");
            System.out.println("4 - Fechar a lanchonete");
            System.out.print("Escolhe ai: ");
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    if (quantidade >= pedidos.length) {
                        System.out.println("A fila ta cheia, nao cabe mais pedido agora kkk");
                    } else {
                        System.out.print("Qual vai ser o pedido? ");
                        String novoPedido = scanner.nextLine();

                        pedidos[quantidade] = novoPedido;
                        quantidade++;

                        System.out.println("Pedido entrou na fila!");
                    }
                    break;

                case 2:
                    if (quantidade == 0) {
                        System.out.println("Nao tem nenhum pedido pra fazer agora.");
                    } else {
                        String pedidoProcessado = pedidos[0];
                        int i = 0;

                        while (i < quantidade - 1) {
                            pedidos[i] = pedidos[i + 1];
                            i++;
                        }

                        quantidade--;
                        pedidos[quantidade] = null;

                        System.out.println("Pedido pronto: " + pedidoProcessado);
                    }
                    break;

                case 3:
                    if (quantidade == 0) {
                        System.out.println("Ta tranquilo, nao tem pedido na fila.");
                    } else {
                        System.out.println("\n===== PEDIDOS QUE AINDA FALTAM =====");

                        int i = 0;
                        while (i < quantidade) {
                            System.out.println((i + 1) + " - " + pedidos[i]);
                            i++;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Lanchonete fechada, partiu descansar.");
                    break;

                default:
                    System.out.println("Essa opcao nao existe po, escolhe de 1 a 4.");
            }
        }

        scanner.close();
    }
}
