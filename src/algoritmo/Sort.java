package algoritmo;

import java.util.Random;

public class Sort {
    
    public Sort() {
        super();
    }

    public Sort(int[]array) {
        this.initialize(array);
        this.mergeSort(array, 0, array.length - 1);
    }

    /* 
     * Algoritmo do Merge Sort(recursivo) 
     * Tempo: O(n logn)
     */
    public void mergeSort(int[] array, int start, int end) {
        if(start < end) {
            int mid = (start + end) / 2;
            mergeSort(array, start, mid);
            mergeSort(array,mid + 1, end);
            merge(array, start, mid, end);
        }
    }

    /*
     * Método que divide o vetor passado por parâmetro em dois subvetores, onde
     * esse estão previamente ordenados devido a recursão. Depois, é feita a
     * intercalação etre esses dois subvetores, resultando no vetor que foi dividido,
     * porém agora ordenado.
     * 
     * Tempo: Theta(n)
     */ 
    public void merge(int[] array, int start, int mid, int end) {
        // Valor sentinela sendo o máximo valor de um int
        int sentinel = Integer.MAX_VALUE;
        
        // Definindo vetores auxiliares
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int[] left = new int[n1 + 1];
        int[] right = new int[n2 + 1];

        // Ultima posição dos subvetores definida como o valor sentinela
        left[left.length - 1] = sentinel;
        right[right.length - 1] = sentinel;
        
        // Preechendo os subvetores
        for (int i = 0; i < n1; i++) {
            left[i] = array[start + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = array[mid + i + 1];
        }
        
        // Intercalando os valores dos subvetores, obtendo-se a sequencia ordenada
        int j = 0, k = 0;
        for (int i = start; i <= end; i++) {
            if(left[j] < right[k]) {
                array[i] = left[j];
                j++;
            }else{
                array[i] = right[k];
                k++;
            }
        }
    }

    /*
     * Método para imprimir os valores do vetor passado por parâmetro
     */
    public void print(int[] array) {
        int limit = 40; // Variável para limitar quantos valores irão ser mostrados

        if(array.length < limit) {
            limit = array.length;
        }

        
        System.out.println(limit + " primeiros elementos do vetor: ");
        for (int i = 0; i < limit; i++) {
            System.out.print("[" + array[i] + "] ");
        }
        System.out.println();
    }

    /*
     * Método que inicializa o vetor passado por parâmetro, colocando
     * valores pseudoaleatórios em seus espaços
     */
    public void initialize(int[]array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(200000);
        }
    }

    /*
     * Método para verificar a ordenação 
     */ 
    public void verify(int[]array) {
        int cont = 0;
        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i] > array[(i+1)]) {
                cont++;
            }
        }
        
        if(cont > 0) {
            System.out.println("ERRO!");
        }else{
            System.out.println("Ordenação realizada com sucesso!");
        }
    }
}
