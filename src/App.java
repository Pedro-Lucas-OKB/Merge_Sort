import algoritmo.Sort;

public class App {
    public static void main(String[] args) throws Exception {
        int[]a = new int[15000];    

        Sort ms = new Sort();
        
        System.out.println("Antes da ordenação: ");
        ms.initialize(a);
        ms.print(a);

        System.out.println("Depois da ordenação: ");
        ms.mergeSort(a, 0, a.length - 1);
        ms.print(a);
    }
}