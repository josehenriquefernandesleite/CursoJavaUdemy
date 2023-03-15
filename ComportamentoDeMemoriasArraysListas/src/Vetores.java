import java.util.Locale;
import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de produtos: ");
        int n = input.nextInt();
        String nomeProduto = null;
        double precoProduto = 0;
        double somaPrecoProdutos = 0;

        Produtos[] vetorProdutos = new Produtos[n];

        for (int contador = 0; contador < vetorProdutos.length; contador ++) {
            System.out.print("Digite um produto: ");
            input.nextLine();
            nomeProduto = input.nextLine();
            System.out.print("Digite o preço do produto: ");
            precoProduto = input.nextDouble();
            vetorProdutos[contador] = new Produtos(nomeProduto, precoProduto);
            somaPrecoProdutos += precoProduto;
        }

        for (int contador = 0; contador < vetorProdutos.length; contador ++) {
            System.out.printf("Produto: %s, valor: %.2f\n", vetorProdutos[contador].getNome(), vetorProdutos[contador].getPreco());
        }

        double precoMediaDosProdutos = somaPrecoProdutos / n;
        System.out.printf("A média dos preços dos produtos é: %.2f", precoMediaDosProdutos);
    }
}
