package queues;

public class customQueue {
    private int[] data;
        private static final int DEFAULT_SIZE = 10;
        int end = 0;

        public customQueue(int size){
            this.data = new int[size];
        }

        public customQueue(){
            this(DEFAULT_SIZE);
        }

        public boolean isFull(){
            return end = data.length;
        }

        public boolean isEmpty(){
            return end == 0;
        }

        public boolean insert(int item){
            if(isFull()){
                return false;
            }
            data[end++] = item;
            return true;
        }

        public boolean delete{
            if(isEmpty()){
                throw new Exception("The queue is empty, can't be removed.")
            }
            int removed = data[end--];
            return removed;
        }
    public static void main(String[] args){
    }
}
