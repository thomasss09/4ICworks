public class Pila<T> {
   
        private Lista<T> stack;
        public Pila(){
            this.stack = new Lista<>();
    }
    public T peek(){
        if(this.stack.length() == 0){
            return null;
        }
        return this.stack.get(0);
    }
    public void push(T element){
        this.stack.insert(element, 0);
    }
    public T pop(){
        T aux = this.peek();
        if(aux != null){
            this.stack.remove(0);
        }
        return aux;
    }
}
