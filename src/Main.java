// TESTE DE DEBUG
public class Main {
    public static void main(String[] args) {
        System.out.println("Listar os numeros pares de 0 a 20");
        evenNumbers(20);
    }
    public static void evenNumbers(int numbers) {
        for (int i = 6; i <= numbers; i++) // ERA PRA INICIAR EM 0
            if (i % 2 == 0)
                System.out.print(i + " ");
    }
}

/***

public class Main {
    public static void main(String[] args) {
        // CRIANDO METODOS
        produtoLista("Laranja", 25.99);
        produtoLista("Banana", 15.80);
    }
    public static void produtoLista(String produtoNome, double valorProduto) {
        System.out.println(produtoNome + " - custa: " + valorProduto);
    }
}


/***
" "
''
\n     pular linha
\t     tab
 ***/
