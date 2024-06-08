public class GraphMatriks26 {
    int vertex;
    int[][] matriks;

    public GraphMatriks26(int v){
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak){
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan){
        matriks[asal][tujuan] = 0;
    }

    public void printGraph(){
        for (int i = 0; i < vertex; i++){
            System.out.print("Gedung "+ (char) ('A'+i) + ": ");
            for (int j = 0; j < vertex; j++){
                if (matriks[i][j] != -1){
                    System.out.print("Gedung "+ (char) ('A' + j) + " (" + matriks[i][j] + " m), ");
                }
            }
            System.out.println();
        }
    }

    public int inDegree(int vertex){
        int Degree = 0;
        for (int i = 0; i < this.vertex; i++){
            if (matriks[i][vertex] != 0){
                Degree++;
            }
        }
        return Degree;
    }

    public int outDegree(int vertex){
        int Degree = 0;
        for (int i = 0; i < this.vertex; i++){
            if (matriks[vertex][i] != 0){
                Degree++;
            }
        }
        return Degree;
    }

    public boolean cekEdge(int asal, int tujuan) {
        return matriks[asal][tujuan] != 0;
    }

    public void updateJarak(int asal, int tujuan, int jarak){
        if (matriks[asal][tujuan] != 0){
            matriks[asal][tujuan] = jarak;
        } else {
            System.out.println("Edge tidak ditemukan");
        }
    }

    public int hitungEdge(){
        int jml = 0;
        for (int i = 0; i < vertex; i++){
            for (int j = 0; j < vertex; j++){
                if (matriks[i][j] != 0){
                    jml++;
                }
            }
        }
        return jml;
    }
}
