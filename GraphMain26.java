import java.util.Scanner;

public class GraphMain26 {
    public static void main(String[] args) throws Exception {
        /*Graph26 gedung = new Graph26(6);

        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();

        gedung.removeEdge(1, 3);
        gedung.printGraph();/* */

        Scanner sc26 = new Scanner(System.in);
        /*System.out.print("Masukkan gedung asal: ");
        int asal = sc26.nextInt();
        System.out.print("Masukkan gedung tujuan: ");
        int tujuan = sc26.nextInt();

        if (gedung.isAdjecent(asal, tujuan)){
            System.out.println("Gedung "+ (char) ('A' +asal) + " dan Gedung "+ (char) ('A' + tujuan)+ " bertetangga");
        } else {
            System.out.println("Gedung "+ (char) ('A' +asal) + " dan Gedung "+ (char) ('A' + tujuan)+ " tidak bertetangga");
        }/* */

        GraphMatriks26 gdg = new GraphMatriks26(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("Hasil setelah penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();

        for (int i = 0; i < 4; i++){
            System.out.println("Degree of Gedung "+ (char) ('A'+i) + ": ");
            System.out.println("InDegree: "+ gdg.inDegree(i));
            System.out.println("OutDegree: "+ gdg.outDegree(i));
            System.out.println();
        }

        System.out.print("Masukkan jumlah vertex: ");
        int jmlVertex = sc26.nextInt();
        GraphMatriks26 graph = new GraphMatriks26(jmlVertex);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Update Jarak");
            System.out.println("7. Hitung Edge");
            System.out.print("Pilih menu: ");
            int choice = sc26.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan gedung asal: ");
                    int asal = sc26.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuan = sc26.nextInt();
                    System.out.print("Masukkan jarak: ");
                    int jarak = sc26.nextInt();
                    graph.makeEdge(asal, tujuan, jarak);
                    break;
                case 2:
                    System.out.print("Masukkan gedung asal: ");
                    asal = sc26.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    tujuan = sc26.nextInt();
                    graph.removeEdge(asal, tujuan);
                    break;
                case 3:
                    System.out.print("Masukkan gedung: ");
                    int vertex = sc26.nextInt();
                    int inDegree = graph.inDegree(vertex);
                    int outDegree = graph.outDegree(vertex);
                    System.out.println("InDegree dari Gedung " + (char) ('A' + vertex) + ": " + inDegree);
                    System.out.println("OutDegree dari Gedung " + (char) ('A' + vertex) + ": " + outDegree);
                    System.out.println("Degree dari Gedung " + (char) ('A' + vertex) + ": " + (inDegree + outDegree));
                    break;
                case 4:
                    graph.printGraph();
                    break;
                case 5:
                    System.out.print("Masukkan gedung asal: ");
                    asal = sc26.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    tujuan = sc26.nextInt();
                    if (gdg.cekEdge(asal, tujuan)){
                        System.out.println("Edge ada");
                    } else {
                        System.out.println("Edge tidak ada");
                    }
                    break;
                case 6:
                    System.out.println("Masukkan asal: ");
                    asal = sc26.nextInt();
                    System.out.println("Masukkan tujuan: ");
                    tujuan = sc26.nextInt();
                    System.out.println("Masukkan jarak baru: ");
                    jarak = sc26.nextInt();
                    gdg.updateJarak(asal, tujuan, jarak);
                    break;
                case 7:
                    System.out.println("Jumlah edge dalam graf: "+ gdg.hitungEdge());
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            System.out.println();
        }
    }
}