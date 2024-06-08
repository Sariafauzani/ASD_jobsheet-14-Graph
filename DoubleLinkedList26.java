public class DoubleLinkedList26 {
    Node26 head;
    int size;

    public DoubleLinkedList26(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(int item, int jarak){
        if (isEmpty()){
            head = new Node26(null, item, jarak, null);
        } else {
            Node26 newNode26 = new Node26(null, item, jarak, head);
            head.prev = newNode26;
            head = newNode26;
        }
        size++;
    }

    public int size(){
        return size;
    }

    public void clear(){
        head = null;
        size = 0;
    }

    public void print(){
        if (!isEmpty()){
            Node26 tmp = head;
            while (tmp != null){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public void remove(int index){
        Node26 current = head;
        while (current != null){
            if (current.data == index){
                if (current.prev != null){
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null){
                    current.next.prev = current.prev;
                }
                size--;
                break;
            }
        }
        current = current.next;
    }

    public int get(int index) throws Exception{
        if (isEmpty() || index >= size){
            throw new Exception("Nilai indeks di luar batas.");
        }
        Node26 tmp = head;
        for (int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int getJarak(int index) throws Exception{
        if (isEmpty() || index >= size){
            throw new Exception("Nilai indeks di luar btas");
        }
        Node26 tmp = head;
        for (int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        return tmp.jarak;
    }
}