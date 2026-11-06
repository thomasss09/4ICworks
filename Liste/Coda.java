public class Coda<T> {
    private Lista<T> queue;
        public Coda(){
            this.queue = new Lista<>();
        }
        public void enqueue(T element){

            this.queue.add(element);
        }
        public boolean isEmpty(){
            if(this.queue.length() == 0){
                return true;
            }
            return false;
        }
        public T dequeue(){
            if(this.isEmpty()){
                return null;
            }
            T aux = this.queue.get(0);
            this.queue.remove(0);
            return aux; 
        }
    }

